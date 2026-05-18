
//Thread.sleep() methods execute, it always halts the execution of the current thread.

public class SLEEP_METHOD {  
    public static void main(String[] args) {  
        System.out.println("Start");  
        try {  
            Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)  
        } catch (InterruptedException e) {  
            System.out.println("Thread interrupted");  
        }  
        System.out.println("End");  
    }  
}  
// the main thread prints "Start", pauses for 2 seconds, and then prints "End".