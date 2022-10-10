JR=java 
JC=javac

define set_shell
	export SHELL="/bin/bash"
endef

run:
	CLASSPATH="./course.jar"
	$(export CLASSPATH="./course.jar")
	$(call set_shell)

	$(JC)  TestProject/*.java
	$(JR)  TestProject.TestProject

	$(JC) Lab1/*.java
	$(JR) Lab1.Lab1

	$(JC) course/*.java course/demo/*.java
	$(JR) course.Hello

	$(JC) Lab2/*.java
	$(JR) Lab2.Main

tojar:
	@ nano course/manifest.txt
	@ jar cf course.jar course/*/*.java