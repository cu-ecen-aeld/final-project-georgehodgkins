#!/bin/sh
# based on Yocto build script from assignment 6

git submodule update --init --recursive

# arch linux only patch -- disable on Debian-based systems
cd tegra-demo-distro/repos/poky && git apply --check ../../../c17_poky.patch && \
	git apply ../../../c17_poky.patch > /dev/null

cd ../.. # tegra-demo-distro

if [[ -e build ]]; then
	echo "Found existing build directory - delete to force reconfiguration"
	source ./setup-env ./build
else
	source ./setup-env --machine jetson-nano-devkit --distro tegrademo ./build
fi

bitbake-layers show-layers | grep "meta-fpgh" > /dev/null
layer_missing=$?

set -e
if [[ $layer_missing -ne 0 ]]; then
	echo "meta-fpgh layer not found, adding"
	bitbake-layers add-layer ../../meta-fpgh
else
	echo "meta-fpgh layer present"
fi

bitbake core-image-fpgh

