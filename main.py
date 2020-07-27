'''
Recursion: The process of repeatedly calling the same function over and over until a base case is reached

Any recursion statement can also be made into an iterative procedure using while or for loops, but there are cases where recursion is cleaner to use
'''


#Here is a simple example
def sayHiCTimes(c):
	'''c is our counter variable'''
	if(c == 1):
		#this can be considered our condition to exit for while loops, or in the case of recursion, a "base case"
		return "Hi"
	else:
		#We keep on concatenating "Hi" to the result of the same function but with a smaller counter. This goes on until we finally reach c==1
		return "Hi " + sayHiCTimes(c-1)
print(sayHiCTimes(4))
print("---")
print(sayHiCTimes(10))
print("---")


#The example above can easily be written as a for loop
c = int(input("Enter the number of time you want to say Hi: "))
m = ""
for i in range(c):
	m += "Hi "
print(m)



'''
It is obviously easier to write the example as a loop, but there are certain times when recursion makes more sense. For example, let's say we are dealing with user input within a function. We can use recursion to filter out any answers that are invalid
'''
print("---")
def askuser():
	'''Asks the user if they like cookies. If it is a nonsensical answer, ask the question again'''
	cookies = input("Do you like cookies? Answer Y or N.").upper()
	if(cookies == "Y"):
		print("Me too!\n")
	elif(cookies == "N"):
		print("Wow, aren't you salty :)\n")
	else:
		print("Please enter a valid input\n")
		#Here is the recursive case, a "fallback statement" within a function
		askuser()
askuser()



'''
Finally, here is a textbook recursive function that displays the usefulness of recursive functions in the form of factorials. We have two functions, one recursive and one iterative, that do the same things.
'''
print("---")

def findFactorialIterative(n):
	'''Finds the factorial of n using a while loop'''
	c = 1
	total = 1
	while c <= n:
		total *= c
		c += 1
	return total

def findFactorialRecursive(n):
	'''Finds the factorial of n using recursion'''
	if(n == 1):
		return 1
	else:
		return n * findFactorialRecursive(n-1)
		#If n started out as 3, we would do 3 * 2 * 1 = 6

factorial = int(input("What number do you want to find the factorial of?: "))
print(findFactorialRecursive(factorial))
print(findFactorialIterative(factorial))




'''
Finally, let's take a look at something called binomial recursion, where  each recursive call branches out into two different recursive calls. This is a challenging concept used to iterate different data structures such as trees and graphs, but a simple example can be seen with the Fibonacci sequence.

The sequence is 0, 1, 1, 2, 3, 5, 8... where the nth term can be found by adding up the n-1th term and n-2th term, and where n0 and n1 are 0 and 1
'''
print("---")

def findNthTerm(n):
	if(n == 2):
		return 1
	elif(n == 1):
		return 0
	else:
		return findNthTerm(n-1) + findNthTerm(n-2)
		#From 1 call, we do two calls to find the n-1th term and n-2th term, resulting in 2 calls, then those two do two more calls, which results in a complexity of 2**n calls. So if n is 4, then we can excpect around 16 function calls

fibonacci = int(input("We will find the nth term of the Fibonacci sequence. What is n?: "))
print(findNthTerm(fibonacci))
