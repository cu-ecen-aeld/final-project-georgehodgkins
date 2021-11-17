# See http://git.yoctoproject.org/cgit.cgi/poky/tree/meta/files/common-licenses
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@github.com/georgehodgkins/aesd-ledimg.git;protocol=ssh;branch=main"
SRCREV = "refs/heads/main"

DEPENDS += "opencv"

S = "${WORKDIR}/git"

FILES:${PN} += "${bindir}/testapp"
FILES:${PN} += "${bindir}/gridtest"

inherit pkgconfig cmake cuda

