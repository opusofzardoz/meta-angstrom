require psplash.inc
require psplash-ua.inc

ALTERNATIVE_PRIORITY = "10"

SRC_URI += "\
          file://psplash-poky-img.h \
          file://psplash-bar-img.h \
          file://psplash-default \
          file://splashfuncs \
          file://psplash-init"
S = "${WORKDIR}/git"

