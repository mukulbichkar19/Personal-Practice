make:
	@javac ArrayDeclaration.java

run:
	@java: ArrayDeclaration

clean:
	@rm -rf *.class

commit:
	@git add .
	@read -p "Enter Commit Message:" message; 
	@git commit $$message 
	@git push

filecount:
	@ls -F |grep -v / | wc -l

clear:
	@clear
