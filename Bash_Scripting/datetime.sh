#!/bin/bash

# A Script that displays the current user along with date and time

todaysdate=$(date +"%d-%m-%y")
currenttime=$(date +"%H:%M:%S")
printf $USER" logged on "$todaysdate" at "$currenttime"\n"

# echo $currenttime
# echo $todaysdate
# echo $USER

