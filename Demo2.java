public class Demo2{
	public static void main(String []args){
		MyClass class1=new MyClass("zhangsan");
		System.out.println((String)class1.getData());
		MyClass class2=new MyClass(10);
		//System.out.println((Integer)class2.getData());
		System.out.println((String)class2.getData());
	}
}

class MyClass{
	private Object data;
	public MyClass(Object data){
		this.data=data;
	}
	public void setData(Object data){
		this.data=data;
	}
	public Object getData(){
		return data;
	}
}

