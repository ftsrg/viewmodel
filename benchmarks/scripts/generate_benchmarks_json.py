#!/bin/env python3

"""
Generates the `benchmarks.json` for the ViewModel benchmarking campaign.
"""

import collections

CONFIG = collections.OrderedDict()
CONFIG["randomSeed"] = 1
CONFIG["warmup"] = 10
CONFIG["iterations"] = 30
CONFIG["gcSleep"] = 500
CONFIG["modelPath"] = "models"
CONFIG["outputPath"] = "output"

BASIC_MODIFICATIONS = [
    "createSwitch",
    "createSegment",
    "connectTrackElements",
    "disconnectTrackElements",
    "createRoute",
    "removeRoute",
    "addSwitchToRoute",
    "removeSwitchFromRoute",
    "setSwitchFailed",
    "setSwitchOperational",
]

MODIFICATION_MIXES = collections.OrderedDict()
CONFIG["modificationMixes"] = MODIFICATION_MIXES

for basic_modification in BASIC_MODIFICATIONS:
    MODIFICATION_MIXES[basic_modification] = {basic_modification: 1}

MODIFICATION_MIXES["usual"] = {
    "createSwitch": 10,
    "createSegment": 10,
    "connectTrackElements": 10,
    "disconnectTrackElements": 10,
    "createRoute": 5,
    "removeRoute": 5,
    "addSwitchToRoute": 10,
    "removeSwitchFromRoute": 10,
    "setSwitchFailed": 15,
    "setSwitchOperational": 15,
}
MODIFICATION_MIXES["petriNetSlow"] = {
    "createSwitch": 25,
    "createRoute": 25,
    "removeRoute": 5,
    "addSwitchToRoute": 20,
    "removeSwitchFromRoute": 25,
}
MODIFICATION_MIXES["virtualSwitchSlow"] = {
    "disconnectTrackElements": 33,
    "setSwitchFailed": 34,
    "setSwitchOperational": 33,
}
MODIFICATION_MIXES["bothSlow"] = {
    "createSwitch": 12,
    "disconnectTrackElements": 16,
    "createRoute": 12,
    "removeRoute": 5,
    "addSwitchToRoute": 10,
    "removeSwitchFromRoute": 12,
    "setSwitchFailed": 17,
    "setSwitchOperational": 16,
}
MODIFICATION_MIXES["bothFast"] = {
    "createSegment": 50,
    "connectTrackElements": 50,
}

EXPERIMENTS = []
CONFIG["experiments"] = EXPERIMENTS

CASES = [("petriNet", model_size) for model_size in [1, 2, 4, 8, 16, 32]] + \
        [("virtualSwitch", model_size) for model_size in [16, 32, 64, 128, 256, 512]]

BATCH_EXPERIMENTS = [
    "viewModel-batch-physical",
    # "viewmodel-batch-mock",
]

INCREMENTAL_EXPERIMENTS = [
    "viewModel-incremental-physical",
    #"viewmodel-incremental-mock",
]

def add_experiment(model_size, transformation_case, experiment, modification_mix):
    """
    Adds a new experiment.
    """

    experiment_info = collections.OrderedDict()
    experiment_info["model"] = "railway-batch-{}".format(model_size)
    experiment_info["transformationCase"] = transformation_case
    experiment_info["experiment"] = experiment
    if modification_mix:
        experiment_info["modificationMix"] = modification_mix

    EXPERIMENTS.append(experiment_info)

def add_experiment_all_cases(experiment, modification_mix):
    """
    Adds a new experiment for all transformation cases and model sizes.
    """

    for (transformation_case, model_size) in CASES:
        add_experiment(model_size, transformation_case, experiment, modification_mix)

for batch_experiment in BATCH_EXPERIMENTS:
    add_experiment_all_cases(batch_experiment, None)

for incremental_experiment in INCREMENTAL_EXPERIMENTS:
    for mix_name in MODIFICATION_MIXES.keys():
        add_experiment_all_cases(incremental_experiment, mix_name)

if __name__ == "__main__":
    import json
    import sys

    json.dump(CONFIG, sys.stdout, indent=True)
    print()
