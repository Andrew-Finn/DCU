#!/bin/sh

cd /tmp
touch oMiOBasx5j.txt

read str1
while true; 
do
	if grep -qF "$str1" oMiOBasx5j.txt;
	then
		echo "$str1"
		rm oMiOBasx5j.txt
		break
	fi
	echo "$str1" >> oMiOBasx5j.txt
	read str1
done
