require readline.inc

SRC_URI += "file://norpath.patch \
            file://0001-Add-fix-for-packages-that-are-not-compatible-with-C2.patch \
            "

SRC_URI[archive.sha256sum] = "0e5be4d2937e8bd9b7cd60d46721ce79f88a33415dd68c2d738fb5924638f656"
