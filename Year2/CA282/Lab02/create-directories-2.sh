#!/bin/sh

n=$1

seq -f "%06g" $n |
   sed 's/^/dir./' |
   xargs mkdir