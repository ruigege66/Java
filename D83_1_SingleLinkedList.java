package com.bjpowernode.java_learning;
/**
 * 使用java语言用来模拟单向链表
 * @author lenovo1
 *
 */
public class D83_1_SingleLinkedList {
	public static void main(String[] args) {
		
	}
	//节点
	//Field
	Entry entry;
	
//	Constructor
	D83_1_SingleLinkedList(){
		//只有一个头节点
		entry = new Entry(null,null);
	}
			
	//静态内部类
	static class Entry{
		//Field
		Object data;
		Entry next;
		//Constructor
		Entry(){}
		Entry(Object data,Entry next){
			this.data = data;
			this.next = next;
		}
	}
}
