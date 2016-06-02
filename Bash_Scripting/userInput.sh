#!bin/bash

echo "What is your username?"
read username

echo "Enter your password "$username
read -s password

echo "The entered username and password is "$username" "$password

select animal in "cat" "dog" "mouse"
do 
	echo "You selected $animal"
	break
done

select option in "a" "b" "c" "quit"
do
	case $option in 
		a) echo "A";;
		b) echo "B";;
		c) echo "C";;
		quit) break;;
		*) echo "Not a correct choice";;
	esac
done


