package demo._interface;

public class InterfaceDemo {

	public static void main(String[] args) {
		// 1.Override init
		Message m = new Message() { 
			@Override
			public void hello(String msg) {
				System.out.println("test1");
			}
		};
		
		m.hello(null);
		
		
		// 2.Lambda init
		Message m2 = (String s) -> System.out.println("test2");
		
		m2.hello(null);
		
		
		// 3.Class implement init
		class ImplMessage implements Message{ 
			@Override
			public void hello(String msg) {
				System.out.println("test3"); 
			} 
		}
		
		Message m3 = new ImplMessage();
		m3.hello(null);
		
		
		// 4.call static method in Interface
		//Message.length=1;
		Message.getLenght();
	}

}
