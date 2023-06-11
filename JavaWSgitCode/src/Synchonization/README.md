**Synchronization**

This folder speaks about the multithreaded access of shared data, how it impacts the consistency 
and what are the approches Java or in general across language provides as solution


1. lock
2. semaphores
3. concurrent data structures
4. atomic 
5. synchronized - block keyword (synctatical over lock)
6. synchronized - methods

Demo1 - Problem


synchronized - methods
 We want to ensure the class supports multithreaded, they ensure protection on a given object


synchronized method will have additional code to work even in the single threaded environment.
so bettre use non-sync methods in single threaded applications(faster performance)

    // StringBuilder -- requires user to have synchrozed block
        //StringBuffer  -- Threadsafe uses synchonized methods

       // HashMap-- requires user to have synchrozed block
      //  Hashtable-- Threadsafe uses synchonized methods
        
        
        //Concurrent Datastructres like ConcurrentHashMap Threadsafe uses the efficient way of locking segments rather than complete hash
//Concurrent hashtable takes lock on each segment/block
while hashtable takes lock on entire table

// AtomicDatstructures provides the atomicity of the operation on the datatypes, ex: AtomicInteger


//single threaded prefer hashmap