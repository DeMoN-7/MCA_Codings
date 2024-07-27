# Question 5: Count Occurrences of a Character in a String 
# Task: Write a program that takes a string and a character as input from the user and counts 
# the number of occurrences of the character in the string using a loop and conditional 
# statements. Print the count. 

a=input("Enter the string ").lower()
ch=input("Enter char ").lower()
count=0
for c in a:
    if c==ch:
        count+=1
print(ch," occurs ",count," times")