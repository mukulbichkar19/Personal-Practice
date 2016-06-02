#!bash/bin

# Comparing Strings with normal operators
[[ "Hello" == "Hello" ]]
echo $?
# [[ "Hello" >= "hello" ]]
# echo $?
[[ "Hello" != "hello" ]]
echo $?
# [[ "Hello" <= "hello" ]]
# echo $?
[[ "Hello" > "hello" ]]
echo $?
[[ "Hello" < "hello" ]]
echo $?

# Comparisons for Numbers
[[ 12 -gt 15 ]]
echo $? # Should return 1
[[ 15 -eq 15 ]]
echo $? # should return 0
[[ 12 -lt 15 ]]
echo $? # should retrun 0
a=""
b="World"
[[ -n $a ]]
echo "The latest output is $?"
[[ -n $b ]]
echo "For b the output is $?"

