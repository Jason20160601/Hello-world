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
		//���޶�ͨ�����ʹ��
		GenericClass<?> gclass=null;
		gclass=dogClass;
		((Dog)gclass.getObj()).eat();

		gclass=StringClass;
		//�ϱ߽��޶�ͨ���
		GenericClass<? extends Animal> subclass=null;
		subclass=dogClass;//Animal a=dog;
		subclass.getObj().eat();
		//�±߽��޶�ͨ���
		GenericClass<? super Dog> sclass=null;
		GenericClass<Animal> cClass=new GenericClass<Animal>();
	    //sclass=catClass;//���Ͳ�����
		sclass=cClass;//����
	

	}
}

//�����������յĲ�����������,ֻ�ܽ���Animal���ͻ���Animal�����������
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
		System.out.println("�й�ͷ");
	}
}

class Cat /*extends*/ implements Animal{
	public void eat(){
		System.out.println("������");
	}
}