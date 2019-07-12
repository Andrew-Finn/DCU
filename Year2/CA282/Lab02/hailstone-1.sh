#!/bin/sh

read i
echo $i

for n in $(seq 19)
do
	if [ $((i % 2)) -eq 0 ]
	then
		i=$((i / 2))
	else
		i=$(((i * 3) + 1))
	fi
	echo $i
done
