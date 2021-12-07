# rendering w/o X on the Jetson requires OpenGL
EXTRA_OECMAKE:append = ' -DWITH_OPENGL=ON'
DEPENDS:append = " glfw mesa gtk+3"

