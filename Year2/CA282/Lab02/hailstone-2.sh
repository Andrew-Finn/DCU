#!/bin/sh

i=$1
echo $i

while ! [ $i -eq 1 ]
do
	if [ $((i % 2)) -eq 0 ]
	then
		i=$((i / 2))
	else
		i=$(((i * 3) + 1))
	fi
	echo $i
done
