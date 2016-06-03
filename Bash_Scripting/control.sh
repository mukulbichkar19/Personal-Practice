#!bin/bash

bash_version=$BASH_VERSION
# echo $bash_version
bash_version_substr=${bash_version:0:6}
echo $bash_version_substr


# lets write an if else statement
a=5
b=4
if [ $a -gt $b ]; then
	echo $a " is greater than " $b
else
	echo $a " is smaller than "$b
fi

# While loop 
i=0
while [ $i -le 10 ];do
	echo i: $i
	((i+=1))
done

# for loop
for i in {1..100}
do
	echo $i
done
echo "In C Styled for"
# for loop C style
for ((i=0;i<=10;i++))
do
	echo $i
done

# for each kind of syntax
fruits=("apple" "banana" "strawberry" "cherry")
for i in ${fruits[@]}
do
	echo  $i
done

