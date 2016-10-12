public class GenericDemo5{
	public static void main(String []args){
		GenericClass2 gen=new GenericClass2();
		gen.println("abc");
		gen.println(true);
		gen.println(10);
		gen.println(10.5);
		gen.println(new Dog());
		gen.println(new Cat());
		GenericClass2.print("哈哈");

	}
}

class GenericClass2{
    //泛型方法
	public <T> void println(T content){
		System.out.println(content);
	}
    //泛型方法的重载
	public <T extends Animal> void println(T animal){
		animal.eat();
	}

	public static <T> void print(T content){
		System.out.println(content);
	}
}



interface Animal
{
	public abstract void eat();
}

class Dog implements Animal{
	public void eat(){
		System.out.println("啃骨头");
	}
}

class Cat implements Animal{
	public void eat(){
		System.out.println("吃鱼肉");
	}
}