public class GenericDemo1{
	public static void main(String []args){
		//创建一个泛型类对象
		GenClass<String> gen1=new GenClass<String>("chenhao");
		System.out.println(gen1.getData());
		GenClass<Integer> gen2=new GenClass<Integer>(100);
		System.out.println(gen2.getData());

		GenClass<GenClass<Student>> gen3=new GenClass<GenClass<Student>>();
		GenClass<Student> gen4=new GenClass<Student>();
		gen4.setData(new Student("张三"));
		gen3.setData(gen4);
		System.out.println(gen3.getData().getData().toString());

		GenClass2<String,Integer> gen5=new GenClass2<String,Integer>("李四",30);
		System.out.println(gen5.getData1());
		System.out.println(gen5.getData2());

	}
}

class GenClass2<T1,T2>{
	private T1 data1;
	private T2 data2;
	public  GenClass2(T1 data1,T2 data2){
		this.data1=data1;
		this.data2=data2;
	}

	public T1 getData1(){
		return data1;
	}
	public T2 getData2(){
		return data2;
	}
}

//创建一个泛型类
class GenClass <T>{
	private T data;
	public GenClass(){
	}
	public GenClass(T data){
		this.data=data;
	}
	public void setData(T data){
		this.data=data;
	}
	public T getData(){
		return data;
	}
}

class Student{
	private String name;
	public Student(String name){
		this.name=name;
	}
	public String toString(){
		return "我是:"+name;
	}
}

