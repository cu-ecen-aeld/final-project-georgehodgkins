inherit core-image
IMAGE_INSTALL_append = " ledimg"
CORE_IMAGE_EXTRA_INSTALL = " opencv"
inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P root root;"
