#!bin/bash
message="Hi "$USER
function greetUser {
	echo $message" $1 $2 $3"
}
greetUser welcome to console
greetUser you are awesome

function numberthings {

	i=1
	for f in $@; do
		echo $i: $f
		(( i+=1 ))
	done
}
numberthings $(ls)
numberthings a b c d


