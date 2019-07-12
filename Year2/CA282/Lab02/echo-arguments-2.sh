#!/bin/sh

i=1
for n in "$@"
do 
	echo "$i." "$n"
	i=$((i + 1))
done