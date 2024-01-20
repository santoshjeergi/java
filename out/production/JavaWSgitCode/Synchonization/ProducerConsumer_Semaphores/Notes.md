With Lock,
When 1 producer entered , no other producer can enter the store
we did not allow the producer 2 to check store, when the producer1 was doing was working
this solves the multiple producers and consumers problem,  
But the original problem is yet to be solved:  No of concurrent producers allowed inside the store = No of empty slots
Lock strategy will not allow > 1 produce