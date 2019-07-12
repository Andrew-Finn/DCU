#!/bin/sh

grep -o "user.*" access.current | cut -c1-9 | sort -t: -k2 | sort -u | awk '!/=/'
# Only care about users        ~remove excess  ;/                      remove
