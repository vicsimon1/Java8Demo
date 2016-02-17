package demo._interface;

import java.util.stream.IntStream;

//@FunctionalInterface
public interface Message {
	public int length = 0; //只能宣告常數，不能宣告 instance variable
	
    public abstract void hello(String msg);
    
      
    public static int getLenght() {
    	System.out.println(length); 
		return length; 
    }
}