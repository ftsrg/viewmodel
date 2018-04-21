#/usr/bin/env bash

# Run this shell script to prepare an Amazon Linux AMI instance
# to checkout out the ViewModel source from Github, and compile them.
# You will need plenty of memory to run the Xtext generator,
# so use at least a t2.medium instance.
# This script is suitable for Amazon Linux AMI 2017.09.1.

VIEWMODEL_REPO_URL_SSH="git@github.com:FTSRG/viewmodel.git"
VIEWMODEL_REPO_URL_HTTPS="https://github.com/FTSRG/viewmodel.git"
VIEWMODEL_FOLDER_NAME="viewmodel"

# Install required software from Amazon repos
sudo yum -y update
sudo yum -y install java-1.8.0-openjdk java-1.8.0-openjdk-devel git python36

# Install Maven
# http://aws-labs.com/install-maven-yum-amazon-linux/
# Also installs JDK 1.7.0, but we will not need it.
sudo wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
sudo yum -y install apache-maven

# Install Git LFS
# https://github.com/git-lfs/git-lfs/wiki/Installation
curl -s https://packagecloud.io/install/repositories/github/git-lfs/script.rpm.sh | sudo bash
sudo yum -y install git-lfs
git lfs install

# Set OpenJDK 1.8.0 as default
sudo alternatives --set java /usr/lib/jvm/jre-1.8.0-openjdk.x86_64/bin/java
sudo alternatives --set javac /usr/lib/jvm/java-1.8.0-openjdk.x86_64/bin/javac

echo "Configured java environment:"
echo "========================================================================"
java -version
javac -version
mvn --version
echo "========================================================================"

# Clone the repository
if [ "x${VIEWMODEL_CLONE_USING_SSH}" = "xyes" ]; then
    ssh-keygen -t rsa -N "" -f ~/.ssh/id_rsa
    echo "SSH public key for clone (make sure there are read privileges for the repository):"
    cat ~/.ssh/id_rsa.pub
    echo
    read -rsp "Press enter to continue..."
    git lfs clone "${VIEWMODEL_REPO_URL_SSH}" "${VIEWMODEL_FOLDER_NAME}"
else
    git lfs clone "${VIEWMODEL_REPO_URL_HTTPS}" "${VIEWMODEL_FOLDER_NAME}"
fi

# Build update sites and product archives
cd "${VIEWMODEL_FOLDER_NAME}"
mvn clean package -DcompileBenchmarks

echo "Transfer benchmarks/releng/hu.bme.mit.inf.viewmodel.benchmarks.repository/target/products/hu.bme.mit.inf.viewmodel.benchmarks.product-linux.gtk.x86_64.zip to your execution machines for running the benchmark"

