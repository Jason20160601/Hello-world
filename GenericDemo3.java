public class GenericDemo3{
	public static void main(String []args){
		GenericClass<Dog> dogClass=new GenericClass<Dog>();
		dogClass.setObj(new Dog());
		dogClass.getObj().eat();

		GenericClass<Cat> catClass=new GenericClass<Cat>();
		catClass.setObj(new Cat());
		catClass.getObj().eat();
		//GenericClass<String> StringClass=new GenericClass<String>();



	}
}

//泛型类所接收的参数做了限制,只能接收Animal类型或者Animal类的子类类型
class GenericClass<T extends Animal>{
	private T obj;
	public void setObj(T obj){
		this.obj=obj;
	}
	public T getObj(){
		return obj;
	}
}

/*abstract class Animal{
	public abstract void eat();
}*/

interface Animal
{
	public abstract void eat();
}

class Dog /*extends*/ implements Animal{
	public void eat(){
		System.out.println("啃骨头");
	}
}

class Cat /*extends*/ implements Animal{
	public void eat(){
		System.out.println("吃鱼肉");
	}
}