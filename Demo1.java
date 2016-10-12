public class Demo1{
	public static void main(String []args){
		MyClass1 class1=new MyClass1("zhangsan");
		System.out.println(class1.getData());
		MyClass2 class2=new MyClass2(10);
		System.out.println(class2.getData());
	}
}

class MyClass1{
	private String data;
	public MyClass1(String data){
		this.data=data;
	}
	public void setData(String data){
		this.data=data;
	}
	public String getData(){
		return data;
	}
}

class MyClass2{
	private int data;
	public MyClass2(int data){
		this.data=data;
	}
	public void setData(int data){
		this.data=data;
	}
	public int getData(){
		return data;
	}
}