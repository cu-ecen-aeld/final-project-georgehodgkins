#!/bin/bash

set -e
cd tegra-demo-distro/layers/meta-tegrademo/scripts
./oe4t-tegraflash-deploy -m jetson-nano-devkit -i core-image-fpgh

