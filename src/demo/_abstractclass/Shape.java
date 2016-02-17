package demo._abstractclass;

/*
 * �వ����A�O���O
 * �Ӱ�����A�O����
 * �వ����A�S�Ӱ�����A�O��H���O
 * 
 * ��H���O�O�K�O�b��췧�����L�k����ƪ����O 
 * 
 * �����ҩw�q���C�Ӥ�k�������b�������O����@�A
 * ��H���O�h�i�H�w�q��������k�O�w�g�㦳����k�����e�y�z�A�ӳ����O�w�q�����b�������O���h��@��
 * @See: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 * */
public abstract class Shape {
	
	public abstract void roll();
	
	public abstract void cut(); 
	
	public void delete() { // subclass don't have to implement regular method
		System.out.println("delete!"); 
	}; 
}
