// code to create Threads by Extending Thread Class 
import java.io.*;
import java.util.*;

public class Crt_Thr_Ext_Thrd_Clas extends Thread {
	// initiated run method for Thread
	public void run()
	{
		System.out.println("Thread Started Running...");
	}
	public static void main(String[] args)
	{
		Crt_Thr_Ext_Thrd_Clas g1 = new Crt_Thr_Ext_Thrd_Clas();

		// Invoking Thread using start() method
		g1.start();
	}
}
/*The run() method of thread class is called if the thread was constructed 
 using a separate Runnable object otherwise this method does nothing and returns. 
 * When the run() method calls, the code specified in the run() method is executed. */
 