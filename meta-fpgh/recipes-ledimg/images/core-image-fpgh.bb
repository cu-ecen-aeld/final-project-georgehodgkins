inherit core-image
IMAGE_INSTALL_append = " ledimg libuvc"
DISTRO_FEATURES_append = " opengl x11-core x11-sato"
CORE_IMAGE_EXTRA_INSTALL = " opencv openssh tmux vim gdb strace v4l-utils libusb1 libusb-compat jpeg libgpiod"
inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P root root;"

