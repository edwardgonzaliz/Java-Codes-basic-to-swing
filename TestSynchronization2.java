

//use the sleep() method on the custom thread.

class SLEEP_CUSTOMTHREAD extends Thread{    
 public void run(){    
  for(int i=1;i<5;i++){   
  // the thread will sleep for the 100 milli seconds   
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}    
    System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
	 SLEEP_CUSTOMTHREAD t1=new SLEEP_CUSTOMTHREAD();    
	 SLEEP_CUSTOMTHREAD t2=new SLEEP_CUSTOMTHREAD();    
     
  t1.start();    
  t2.start();    
 }    
}    