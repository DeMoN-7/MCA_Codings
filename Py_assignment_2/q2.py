# Question 2: Sum of Elements in a List 
# Task: Write a program that takes a list of integers and calculates the sum of all the elements 
# using a loop. Print the sum.

sum=0
count=int(input("Enter the length of list "))
a=[]
for i in range(0,count):
    x=int(input("Enter the element of list "))
    a.append(x)
    sum=sum+x
print("Sum of list: ",sum)