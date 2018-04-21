#/usr/bin/env bash

# Run this shell script to prepare and Amazon Linux AMI instance
# for executing the benchmarks. You will need plenty of memory,
# so use at least an m5.xlarge instance.
# This script is suitable for Amazon Linux AMI 2017.09.1.

# Install required software from Amazon repos
sudo yum -y update
sudo yum -y install java-1.8.0-openjdk tmux htop

# Set OpenJDK 1.8.0 as default
sudo alternatives --set java /usr/lib/jvm/jre-1.8.0-openjdk.x86_64/bin/java

echo "Configured java environment:"
echo "========================================================================"
java -version
echo "========================================================================"

echo "Further tasks:"
echo "1. Download and unpack hu.bme.mit.inf.viewmodel.benchmarks.product-linux.gtk.x86_64.zip"
echo "2. Set up benchmarks.json as desired"
echo "3. Run ./eclipse -vmargs -Xmx15g to execute the benchmarks"
echo "Don't forget to use tmux to allow closing SSH sessions without aborting the benchmark"
