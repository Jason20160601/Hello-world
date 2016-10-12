public class GenericDemo4{
	public static void main(String []args){
		GenericClass<Dog> dogClass=new GenericClass<Dog>();
		dogClass.setObj(new Dog());
		dogClass.getObj().eat();

		GenericClass<Cat> catClass=new GenericClass<Cat>();
		catClass.setObj(new Cat());
		catClass.getObj().eat();

		GenericClass<String> StringClass=new GenericClass<String>();

		//dogClass=catClass;
		//无限定通配符的使用
		GenericClass<?> gclass=null;
		gclass=dogClass;
		((Dog)gclass.getObj()).eat();

		gclass=StringClass;
		//上边界限定通配符
		GenericClass<? extends Animal> subclass=null;
		subclass=dogClass;//Animal a=dog;
		subclass.getObj().eat();
		//下边界限定通配符
		GenericClass<? super Dog> sclass=null;
		GenericClass<Animal> cClass=new GenericClass<Animal>();
	    //sclass=catClass;//类型不兼容
		sclass=cClass;//可以
	

	}
}

//泛型类所接收的参数做了限制,只能接收Animal类型或者Animal类的子类类型
class GenericClass<T>{
	private T obj;
	public void setObj(T obj){
		this.obj=obj;
	}
	public T getObj(){
		return obj;
	}
}

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