#!/bin/sh

for dir in $@
do
    if test -f $dir
    then
        echo $dir file
    elif test -d $dir
    then
        echo $dir directory
    else
        echo $dir does not exist
    fi
done