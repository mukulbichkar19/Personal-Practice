#!bin/bash
rand=$RANDOM
secret=${rand:0:1}

function game{

	read -p "guess a one-digit number ? " guess
	while [[ $guess!=$secret ]]; do
		read -p "Nope try again" guess
	done
	echo "You are a good guesser"
}

function generate{
	echo "random number is $rand"
	echo -e "Type game for a diversion"

}

if [[ $1 ~= game|GAME|Game ]];then
	game
else
	generate
fi 
