package Assignment_2;
/**
 * 
 * @author Vishwas
 * 
 * In here creating a Runnable class by Implementing
 * than implementing run method to create a class
 *
 */
class Sleep implements Runnable{

	
	public void run() {
		// window console 
		System.out.println("Printing 10 times after 3 second\n");
		/**
		 * Using for loop to print 10 times  
		 */
		for(int i=1;i<=10;i++){
			/**
			 * Concatenating 'i' with window console 
			 * to print with serial number 	
			 */
			System.out.println(i+ ": Welcome to AcadGild " );
			/**
			 * In here using try and catch block for Exception handling
			 * and also using sleep method 
			 * sleep() is used to sleep a thread for specified time
			 */
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
}
// creating class ThreadSleep
public class ThreadSleep {
	//main method  
	public static void main(String[] args) {
		/**
		 * creating thread
		 * and inside the thread constructor passing Sleep()
		 * and calling start method to create thread 
		 * which will call, run method automatically
		 * 
		 */
		Thread thread= new Thread(new Sleep());
		thread.start();

	}

}
