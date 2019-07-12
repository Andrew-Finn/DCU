#!/bin/sh

grep "computing.dcu.ie" access.current | cut -c21-25  | awk '!/einst/' | sort -u
# Only care about users        ~remove excess  ;/                      remove ""
