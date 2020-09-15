package com.atguigu.test03;

public class SingleLinkedList {
	//这里不需要数组，不需要其他的复杂的结构，我只要记录单向链表的“头”结点
	private Node first;//first中记录的是第一个结点的地址
	private int total;//这里我记录total是为了后面处理的方便，例如：当用户获取链表有效元素的个数时，不用现数，而是直接返回total等
	
	/*
	 * 内部类，因为这种Node结点的类型，在别的地方没有用，只在单向链表中，用于存储和表示它的结点关系。
	 * 因为我这里涉及为内部类型。
	 */
	private class Node{
		Object data;//因为数据可以是任意类型的对象，所以设计为Object
		Node next;//因为next中记录的下一个结点的地址，因此类型是结点类型
		//这里data,next没有私有化，是希望在外部类中可以不需要get/set，而是直接“结点对象.data","结点对象.next"使用
		Node(Object data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	
	public void add(Object obj){
		/*
		 * (1)把obj的数据，包装成一个Node类型结点对象
		 * (2)把新结点“链接”当前链表的最后
		 * ①当前新结点是第一个结点
		 * 如何判断是否是第一个   if(first==null)说明暂时还没有第一个
		 * ②先找到目前的最后一个，把新结点链接到它的next中
		 * 如何判断是否是最后一个   if(某个结点.next == null)说明这个结点是最后一个
		 */
//		(1)把obj的数据，包装成一个Node类型结点对象
		//这里新结点的next赋值为null，表示新结点是最后一个结点
		Node newNode = new Node(obj, null);
		
		//①当前新结点是第一个结点
		if(first == null){
			//说明newNode是第一个
			first = newNode;
		}else{
			//②先找到目前的最后一个，把新结点链接到它的next中
			Node node = first;
			while(node.next != null){
				node = node.next;
			}
			//退出循环时node指向最后一个结点
			
			//把新结点链接到它的next中
			node.next = newNode;
		}
		
		total++;
	}
	
	public int size(){
		return total;
	}
	
	public Object[] getAll(){
		//(1)创建一个数组，长度为total
		Object[] all = new Object[total];
		
		//(2)把单向链表的每一个结点中的data，拿过来放到all数组中
		Node node = first;
		for (int i = 0; i < total; i++) {
//			all[i] = 结点.data;
			all[i] = node.data;
			//然后node指向下一个
			node = node.next;
		}
		
		//(3)返回数组
		return all;
	}
	
	public void remove(Object obj){
		if(obj == null){
			//(1)先考虑是否是第一个
			if(first!=null){//链表非空
				
				//要删除的结点正好是第一个结点
				if(first.data == null){
					//让第一个结点指向它的下一个
					first = first.next;
					total--;
					return;
				}
				
				//要删除的不是第一个结点
				Node node = first.next;//第二个结点
				Node last = first;
				while(node.next!=null){//这里不包括最后一个，因为node.next==null，不进入循环，而node.next==null是最后一个
					if(node.data == null){
						last.next = node.next;
						total--;
						return;
					}
					last = node;
					node = node.next;
				}
				
				//单独判断最后一个是否是要删除的结点
				if(node.data == null){
					//要删除的是最后一个结点
					last.next = null;
					total--;
					return;
				}
			}
		}else{
			//(1)先考虑是否是第一个
			if(first!=null){//链表非空
				
				//要删除的结点正好是第一个结点
				if(obj.equals(first.data)){
					//让第一个结点指向它的下一个
					first = first.next;
					total--;
					return;
				}
				
				//要删除的不是第一个结点
				Node node = first.next;//第二个结点
				Node last = first;
				while(node.next!=null){//这里不包括最后一个，因为node.next==null，不进入循环，而node.next==null是最后一个
					if(obj.equals(node.data)){
						last.next = node.next;
						total--;
						return;
					}
					last = node;
					node = node.next;
				}
				
				//单独判断最后一个是否是要删除的结点
				if(obj.equals(node.data)){
					//要删除的是最后一个结点
					last.next = null;
					total--;
					return;
				}
			}
		}
	}

	public int indexOf(Object obj){
		if(obj == null){
			Node node = first;
			for (int i = 0; i < total; i++) {
				if(node.data == null){
					return i;
				}
				node = node.next;
			}
		}else{
			Node node = first;
			for (int i = 0; i < total; i++) {
				if(obj.equals(node.data)){
					return i;
				}
				node = node.next;
			}
		}
		return -1;
	}
}
