package demo._interface;

import java.util.stream.IntStream;

//@FunctionalInterface
public interface Message {
	public int length = 0; //�u��ŧi�`�ơA����ŧi instance variable
	
    public abstract void hello(String msg);
    
      
    public static int getLenght() {
    	System.out.println(length); 
		return length; 
    }
}