CISC320-010/011 (Group 5) 
Project 1-COWS

For this project, you will need to write a program that solves the problem above and create a readme.txt 
that explains your solution at a high level. Inside your readme.txt file, 
make sure you clearly explain the algorithmic runtime of your program in terms of Big O. 
For full credit, you must be able to justify your program's complexity as average case O(c*log(c)+r).
 

For project 1, the data structure we decided to use is a hashmap. A hashmap will allow us to store and maintain keys,
which is the Cow's ID and able to retrieve that value later on. Rather than trying to constantly loop through, we implemented 
a hashmap to pull keys and values which verifies that our program run on average time case O(c*log(c)+r). Using a loop (O(c)), sort (O(c log(c))),
and then put it all together with the average case O(1) with the characterization of O(r)--- this solves the algorithm of O(c*log(c)+r).
