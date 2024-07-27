# Question 4: Find the Largest Number in a List 
# Task: Write a program that takes a list of integers and finds the largest number in the list 
# using a loop and conditional statements. Print the largest number.

count=int(input("Enter the length of list "))
a=[]
z=0
for i in range(0,count):
    x=int(input("Enter the element of list "))
    a.append(x)
    if(x>z):
        z=x
print("Largest number in list: ",z)
