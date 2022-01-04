# RopeDataStructure

A rope is a binary tree data structure. 
Leaf contains sub strings. Used to store and manipulate large strings. Widely used in text editors, email software. 
Excels in Insertions & Deletions 


Why Rope when we have string? 
To append and concatenate strings. Less memory allocations. 
Unlike arrays ropes do not require O(n) extra memory for copying operations. 

Rope vs strings? 

Function 	                  Rope 	   String 
Destructive concatenation 	O(log n) 	O(n)
Insert	                    O(log n)  O(n)
Append	                    O(log n) 	O(n) / O(1)
Delete	                    O(log n) 	O(n)



The numbers represent the weight of node / child node. Root weight comes from left most node. 

Indexing. O(log n) 
Find 12th index == "O" -- "root_is_strOnger
	As index is greater than node move to the right. i = i – 7.  i = 5
	As 5 is also greater than 3. Move to right. i = i – 3 = 2
	As 2 less than 3. Move to the left. And end “ron” == ‘o’ 12th 
