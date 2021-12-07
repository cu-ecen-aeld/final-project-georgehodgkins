# See http://git.yoctoproject.org/cgit.cgi/poky/tree/meta/files/common-licenses
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@github.com/georgehodgkins/aesd-ledimg.git;protocol=ssh;branch=main"
SRCREV = "refs/heads/main"
PV = "1.0+git${SRCPV}"

DEPENDS += " opencv libgpiod"
RDEPENDS:${PN} += " libgpiod-tools"
EXTRA_OECMAKE = " -DDEVHOST=OFF"

S = "${WORKDIR}/git"

FILES:${PN} += "${bindir}/testapp"
FILES:${PN} += "${bindir}/gridtest"
FILES:${PN} += "${bindir}/circle"
FILES:${PN} += "/home/root/sample.jpeg"

do_install:append () {
	install -d ${D}/home/root/
	install -m 0755 ${S}/sample.jpeg ${D}/home/root/sample.jpeg
}

inherit pkgconfig cmake cuda

