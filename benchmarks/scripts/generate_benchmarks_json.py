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
CONFIG["timestampOutput"] = "true"

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

CASES_PETRI_NET = [("petriNet", model_size) for model_size in [1, 2, 4, 8, 16]]
CASES_VIRTUAL_SWITCH = [("virtualSwitch", model_size) for model_size in [16, 32, 64, 128, 256]]
CASES_DEPENDABILITY = [("dependability", model_size) for model_size in [1, 2, 4, 8, 16]]
CASES = CASES_DEPENDABILITY + CASES_VIRTUAL_SWITCH

BATCH_EXPERIMENTS = [
    "viewModel-batch-physical",
    # "viewmodel-batch-mock",
    # "tgg-batch",
    "viatra-batch",
    "viatra-batch-priorities",
]

INCREMENTAL_EXPERIMENTS = [
    "viewModel-incremental-physical",
    #"viewmodel-incremental-mock",
    #"tgg-incremental",
    "viatra-incremental",
    "viatra-incremental-priorities",
]

def add_experiment(model_size, transformation_case, experiment, modification_mix):
    """
    Adds a new experiment.
    """

    experiment_info = collections.OrderedDict()
    experiment_info["model"] = "railway-batch-{}".format(model_size)
    if 'dependability' in transformation_case:
        experiment_info["dependabilityModel"] = "dependability-{}".format(model_size)
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

def add_all(cases, experiments, modification_mix):
    """
    Adds a new modification mix with all experiments and cases.
    """

    for (transformation_case, model_size) in cases:
        for experiment in experiments:
            add_experiment(model_size, transformation_case, experiment, modification_mix)
# for batch_experiment in BATCH_EXPERIMENTS:
#     add_experiment_all_cases(batch_experiment, None)

# add_experiment_all_cases("atl-batch", None)
# for (transformation_case, model_size) in CASES_PETRI_NET:
#     add_experiment(model_size, transformation_case, "atl-batch-imperative", None)

# for incremental_experiment in INCREMENTAL_EXPERIMENTS:
#     for mix_name in MODIFICATION_MIXES.keys():
#         add_experiment_all_cases(incremental_experiment, mix_name)

if __name__ == "__main__":
    import json
    import sys
    index = int(sys.argv[1])
    case = sys.argv[2]
    if case == 'dependability':
        cases = CASES_DEPENDABILITY
    elif case == 'virtualSwitch':
        cases = CASES_VIRTUAL_SWITCH
    else:
        raise "No such case"
    if index < 15:
        mix_name = list(MODIFICATION_MIXES.keys())[index]
        add_all(cases, INCREMENTAL_EXPERIMENTS, mix_name)
        CONFIG["outputPath"] = "/mnt/results/all-" + case + "-" + mix_name
    else:
        add_all(cases, BATCH_EXPERIMENTS, None)
        CONFIG["outputPath"] = "/mnt/results/all-" + case + "-batch"

    json.dump(CONFIG, sys.stdout, indent=True)
    print()
