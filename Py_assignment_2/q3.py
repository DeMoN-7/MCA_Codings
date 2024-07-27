# Question 3: Reverse a String 
# Task: Write a program that takes a string input from the user and prints the string in reverse 
# order using a loop.

a=input("Enter string ")
lis=list(a)
cou=len(lis)-1
lis2=[]
for i in range(cou,-1,-1):
    lis2.append(a[i])
b = ''.join(lis2)
print("old string:",a)
print("new string:",b)
