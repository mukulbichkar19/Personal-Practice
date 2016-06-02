#!bin/bash
# Arrays in bash/shell script
declare -A myarray
myarray[color]=red
myarray["office building"]="Palo Alto"
a=()  # Empty Array
b=("apple" "banana" "cherry")
echo $a
echo ${b[1]}
b[5]="Kiwi"
echo ${b[5]}
b+=("mango") # Append to the array
echo ${b[6]}
echo ${b[@]}
echo ${myarray["office building"]} is ${myarray[color]}
