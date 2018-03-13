# define a makefile variable for the java compiler
#
JCC = javac
JC = java

# Copy
CP = -cp

default: System.class Cluster.class Driver.class

System.class: System.java
	@$(JCC) System.java

Cluster.class: Cluster.java
	@$(JCC) Cluster.java

Driver.class: Driver.java
	@$(JCC) Driver.java

deploy:
	@$(JC) Driver

clean:
	@	rm -rf *.class	
