#!/bin/sh

seen="F"
flag="F"

while read line
do
	if [ $line != $seen ]
	then
		seen=$line
	elif [ $flag = "F" ]
	then
		flag=$seen
	fi
done

if [ $flag != "F" ]
then
	echo $flag
fi
