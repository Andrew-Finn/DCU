import os  # Python library containing OS functions
import sys

if len(sys.argv) == 2:
    path = sys.argv[1]
else:
    path = './shakespeare/'  # initialise path to current directory
files = os.listdir(path)  # create list of files
for name in files:  # loop through list
    print(name)  # Print each file
