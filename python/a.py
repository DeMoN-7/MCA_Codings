try:
    a=open("a.txt","w")
    a.write("fdfd")
except FileNotFoundError:
    print("file not ")