#!bash/bin

a=12
b="Good Morning"
c="Let's catchup tomorrow"
echo $a
echo $b
echo $c
declare -i d=123
declare -r e=1233
declare -l f='LOLOFCATS' #l specifies lowercase
declare -u g='lolofcats' #u specifies uppercase
echo $i
echo $e
echo $f
echo $g
sum=$((a+2))
echo "The sum is $sum"
div=$((1/3))
echo "The division without bc results in a $div"
divwithbc=$(echo 1/3 | bc -l)
echo "The division with a bc results in a $divwithbc"

