#!bash/bin

a="Hello"
b="World"
c=$a$b    # Concatenates the two strings a and b
echo $c
echo ${#c} # Returns the length of the string
echo ${#a}
d=${c:3} # From 3 character
echo $d
e=${c:3:4} # From 3 character 4 characters after it
echo $e
f=${c: -4} # Last 4 Characters
echo $f
g=${c: -4:3} #3 characters of last 4 characters
echo $g 
fruits="apple banana banana cherry"
echo ${fruits//banana/maple}
echo ${fruits/#apple/grapes} # Replaces the word at the start of the string
echo ${fruits/#banana/durian} # if it's not the start then it just ignores
echo ${fruits/%cherry/peach} # Replaces the last word in the string
echo ${fruits/c*/orange} # Replace all words again starting with b

