import os  # import libraries with OS and system-related functions
import sys

path = './shakespeare/'  # set path to current directory
if len(sys.argv) == 2:  # if there is a command-line argument specified
    path = sys.argv[1]  # set path to the argument

files = os.listdir(path)  # get a list of files
for name in files:  # for each one in the list
    print(name)  # print the name
    full_path = os.path.join(path, name)  # the foll OS path of the file
    print(full_path)  # print this

    inode = os.stat(full_path)  # retrieve object
    print(('  ' + str(inode.st_size)))  # print size of file
    print(('  ' + str(inode.st_mode)))

    # Next few lines determine if the current item is file

    # or directory based on its mode. and print different things accordingly
    print(('  ' + ('f' if inode.st_mode & 0o100000 else '-')))
    print(('  ' + ('d' if inode.st_mode & 0o040000 else '-')))

    # another way of doing this...
    if os.path.isdir(full_path):
        print('    dir')
    elif os.path.isfile(full_path):
        print('    file')
    print(('    ' + str(os.path.getsize(full_path))))
