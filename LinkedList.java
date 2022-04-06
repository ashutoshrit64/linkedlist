package com.linkedlist.demo.listimpl;

import com.linkedlist.demo.Node;

public class LinkedList {
	
	int size;
	Node head;
	Node tail;
	
	public LinkedList() {
		this.size=0;
		this.head=null;
	}
//	linkedlist empty
//	insert element at first
//	insert at last
//	insert at particular position
//	delete element from particular position
//	display linkedlist
	
	
	public boolean isEmpty() {
		if(this.size==0) {
			return true;
		}
		return false;
	}
	
	public void inserAtFirst(int data) {
		Node node=new Node();
		node.setData(data);
		if(head==null) {
			head=node;	
			size++;
		}
		else {
			node.setNext(head);;
			head=node;
			size++;
		}
	}
	
	
	public void display() {
		System.out.println("size ::->"+size);
		if(size==0) {
			System.out.println("List is empty");
		}else {
			System.out.println("List ::->");
			Node n=head;
			for(int i=0;i<size;i++) {
				System.out.println(n.getData());
				n=n.getNext();
				
			}
		}
	}
	
	public void insertAtLast(int data) {
		Node n,t;
        n=new Node();
        n.setData(data);
        n.setNext(null);
        t=head;
		if(head==null) {
			head=n;
			
		}else {
			 while (t.getNext() !=null) {
	                t=t.getNext();
	                }
	                t.setNext(n);
	                tail=n;
	            size++;
		}
		
	}
	
	
	public void insertAtPosition(int val,int pos){
        if (pos == 1){
        	inserAtFirst(val);
        }
        else if(pos == size+1 && pos > size+1){
            insertAtLast(val);
        }else if(pos>1 && pos<size){
            Node n,t;
            n=new Node();
            n.setData(val);
            n.setNext(null);
            t=head;
//            21,14,16,43
            for(int i=1;i<pos;i++) {
//            	t=head;i=1;t=head.getnext();
                t = t.getNext();
                n.setNext(t.getNext());
                t.setNext(n);
                size++;
            }
        }

    }
	
	
	public void deleteFirst(){
        if(head == null){
            System.out.println("Empty");
        }
        else{
            head=head.getNext();
            size--;
        }
    }
	
	public void deleteLast(){
        if (head == null){
            System.out.println("empty");
        }
        else if(size == 1){
            head=null;
            size--;
        }else{
            Node t;
            t=head;
            for(int i=1;i<size-1;i++)
                t=t.getNext();
                t.setNext(null);
                size--;
        }
    }

}
