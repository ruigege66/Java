package com.bjpowernode.java_learning;

public class D69_3_ArraysSimulateStack {
	public static void main(String[] args) {
		Stack s = new Stack(2);
		User69 u1 = new User69("jfidsa",12);
		User69 u2 = new User69("jfiddfsa",12);
		User69 u3 = new User69("jfidfdsfsa",12);
		try {
			s.push(u1);
			s.push(u2);
			s.push(u3);
		}catch(StackOperationException e) {
			System.out.println(e);
		}
//	    System.out.println(s.pop());
	}

}
class Stack{
	//使用数组存储数据,注意栈可以存储多个引用类型的元素
	Object[] elements;
	//指向栈顶元素上方的一个帧
	int index;
	
	//栈默认的初始化容量是10
	Stack(){
		this(10);
	}
	Stack(int max){
		elements = new Object[max];
	}
	//栈应该对外提供一个压栈的方法
	public void push(Object element) throws StackOperationException{
		if (index == elements.length) {
			throw new StackOperationException("栈已经满了");
		}
		elements[index++] = element;
	}
	//对外提供一个弹栈的方法
	public Object pop() throws StackOperationException{
		if(index == 0) {
			throw new StackOperationException("栈已经空了");
		}
		return elements[--index];
	}
}

class User69{
	String name;
	int age;
	User69(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return "User是我";
	}
}
class StackOperationException extends Exception{
	public StackOperationException() {}
	public StackOperationException(String msg) {
		super(msg);
	}
	
}
