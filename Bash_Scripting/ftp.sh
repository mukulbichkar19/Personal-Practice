#!bin/bash
ftp -n <<- DoneWithTheUpdate
	open mirrors.xmission.com
	user anonymous nothinghere
	ascii
	cd gutenberg
	get GUIDEINDEX.01
	bye
DoneWithTheUpdate

