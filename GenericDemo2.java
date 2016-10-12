public class GenericDemo2{
	public static void main(String []args){
		SubClass<String,Integer> sub=new SubClass<String,Integer>("张三",20);
		System.out.println(sub.show1());
		sub.show2(100);

	}
}

class SuperClass<T1>{
	private T1 var1;
	public SuperClass(T1 var1){
		this.var1=var1;
	}

	public T1 show1(){
		return var1;
	}
}

interface IInfo<T2>{
	public void show2(T2 var3);
}

class SubClass<T1,T2> extends SuperClass<T1> implements IInfo<T2>{
	private T2 var2;
	public SubClass(T1 var1,T2 var2){
		super(var1);
		this.var2=var2;
	}
	//重写了父类的方法
	public T1 show1(){
		return super.show1();
	}
	public void show2(T2 var3){
		System.out.println(var3);
		System.out.println(var2);
		System.out.println(var2+var3);
	}
}
