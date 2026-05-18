/*
Inter-thread communication or Co-operation is all about allowing synchronized threads
 to communicate with each other.

Cooperation (Inter-thread communication) is a mechanism in which a thread is paused
running in its critical section and another thread is allowed to enter (or lock) 
in the same critical section to be executed.

It is implemented by following methods of Object class:
wait()
notify()
notifyAll()
1) wait() method
The wait() method causes current thread to release the lock and wait until 
either another thread invokes the notify() method or the notifyAll() method for this object, 
or a specified amount of time has elapsed.

The current thread must own this object's monitor, 
so it must be called from the synchronized method only otherwise it will throw exception.
Let's see the important differences between wait and sleep methods.

wait() VS  sleep()
The wait() method releases the lock.
It is a method of Object class
It is the non-static method
It should be notified by notify() or notifyAll() methods

The sleep() method doesn't release the lock.
It is a method of Thread class
It is the static method
After the specified amount of time, sleep is completed.
*/