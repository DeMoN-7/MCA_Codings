try:
    with open("a.txt","w")
    a.write("fdfd")
except FileNotFoundError:
    print("file not ")
print("File Written")
a.close()