
//We can directly use the Thread class to spawn new threads using the constructors defined above.

public class By_Thread_Class  
{  
  
public static void main(String argvs[])  
{  
// creating an object of the Thread class using the constructor Thread(String name)   
Thread t= new Thread("My first thread");  
  
// the start() method moves the thread to the active state  
t.start();  
// getting the thread name by invoking the getName() method  
String str = t.getName();  
System.out.println(str);  
}  
}  
