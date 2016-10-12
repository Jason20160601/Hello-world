import java.util.Arrays;
public class MyContainer{
	public static void main(String [] agrs){
		IContainer<String> list=new ArrayList<String>();
		for(int i=0;i<12;i++){
			list.add("data:"+(i+1));
		}

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

		IContainer<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<12;i++){
			list1.add(i+1);
		}

		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}


	}
}

interface IContainer<T>{
	public void add(T obj);//�������������
	public T get(int index);//��ȡָ���±�λ�ô���Ԫ������
	public int size();//����������Ԫ�صĸ���
}

class ArrayList<T> implements IContainer<T>{
	//private T[] data=new T[10];//����,���ܴ�����������
	private Object[] data=null;
	private int size=0;//��¼������Ԫ�صĸ���
	public ArrayList(){
		data=new Object[10];//��ʼ��СΪ10
	}
	public ArrayList(int capacity){
		data=new Object[capacity];//ָ�������Ĵ�С
	}

	public void add(T obj){
		//�ж�Ԫ�صĸ����Ƿ��Ѿ������������Ĵ�С,������
		//Ӧ�ö�������������.
		ensureCapacity(size+1);
		data[size++]=obj;//���Ԫ��

	}
	private void ensureCapacity(int capacity){
		if(capacity>data.length){
			int oldCapacity=data.length;//��ȡԭ�����������Ĵ�С
			int newCapacity=oldCapacity+(oldCapacity>>1);//����Ϊԭ��������1.5��
			data=Arrays.copyOf(data,newCapacity);//��ԭ�������е����ݿ������´�����������
		}
	}

	@SuppressWarnings("unchecked")
	public T get(int index){
		return (T)data[index];
	}

	public int size(){
		return size;
	}

	
}