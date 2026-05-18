// code to create Thread by using Runnable Interface
import java.io.*;
import java.util.*;

public class Crt_Thr_By_Runnble_Interfa implements Runnable {
	// method to start Thread
	public void run()
	{
		System.out.println(
				"Thread is Running Successfully");
	}

	public static void main(String[] args)
	{
		Crt_Thr_By_Runnble_Interfa g1 = new Crt_Thr_By_Runnble_Interfa();
		//initializing Thread Object
		Thread t1 = new Thread(g1);
		t1.start();
	}
}
/*
 The Runnable interface is a functional interface used to create threads in Java. 
Single Method:
It contains a single abstract method called run(), 
which defines the code that will be executed when the thread starts. 
 
*/