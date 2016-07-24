# DataStructuresJava
This project contains basic Data Structures implemented in Java in order to provide a way to know how Standard Data Structures work internally.


## Implemented Data Structures


We have the following Data Structures with unit tests:

### LinkedList

	init method:     	   		   O(1)
	insert method (last):   	   O(n)
	retrieve method (index):       O(n)
	delete method (index):   	   O(n)
	insertInitial: 		   		   O(1) 
    deleteInitial: 		   		   O(1)


### Stack
	init method:     	   O(1)
	push method:   	   	   O(1)
	peek method:       	   O(1)
	pop method:		   	   O(1)


### Queue
	init method:     	   O(1)
	enqueue method:   	   O(1)
	peek method:       	   O(1)
	dequeue method:	  	   O(1)
	
	
## Running the tests

If you want to run the project you need to have maven installed and run:

		$> mvn clean test
