
#!/bin/bash

# My first attempt at scripting which prints current directory.

pwd
ls
a=$(pwd)
echo "The current working directory is $a"
b=$(ping -c 1 google.com | grep 'bytes from'| cut -d = -f 4)
echo "The time taken is $b"
