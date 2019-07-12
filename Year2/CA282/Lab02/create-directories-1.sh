#!/bin/sh

n=$1

seq $n |
   sed 's/^/dir./' |
   xargs mkdir