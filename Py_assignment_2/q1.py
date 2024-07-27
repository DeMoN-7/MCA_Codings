# Question 1: Check for Vowels 
# Task: Write a program that checks if a given character is a vowel or consonant. The program 
# should take a character input from the user and use conditional statements to determine and 
# print whether it is a vowel or consonant.


a=input("Enter Character ")
a=a.lower()
lis=['a','e','i','o','u']
if a in lis:
    print(a," is vowel")
else:
    print(a," is consonant")