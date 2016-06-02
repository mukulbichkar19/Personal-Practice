#!bin/bash

if [ $# -lt 3 ]; then
	cat <<- EOM 
	This is an error message:
	Please enter username,userid and password
	EOM
else
	echo "1.Username is $1"
	echo "2.UserId is $2"
	echo "3.Password is $3"
fi

	
