package demo._lambda;

import demo._interface.Message;

public class LambdaDemo {

	public static void main(String[] args) {
		// FunctionalInterface Runnable
		Runnable runnbale = new Runnable() {
		    public void run() {
		    	System.out.println("run me!");
		    }
		};
		
		Runnable runnbale2 = () -> System.out.println("run me!");
		
		
		
		// FunctionalInterface Message
		Message m = (temp_s) -> System.out.println("run me!" + temp_s);
		
		
	}

}
