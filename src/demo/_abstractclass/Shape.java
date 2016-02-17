package demo._abstractclass;

/*
 * 能做什麼，是類別
 * 該做什麼，是介面
 * 能做什麼，又該做什麼，是抽象類別
 * 
 * 抽象類別別便是在領域概念中無法具體化的類別 
 * 
 * 介面所定義的每個方法都必須在延伸類別中實作，
 * 抽象類別則可以定義部分的方法是已經具有此方法的內容描述，而部分是定義必須在延伸類別中去實作的
 * @See: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 * */
public abstract class Shape {
	
	public abstract void roll();
	
	public abstract void cut(); 
	
	public void delete() { // subclass don't have to implement regular method
		System.out.println("delete!"); 
	}; 
}
