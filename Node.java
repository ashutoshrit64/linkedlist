package com.linkedlist.demo.listimpl;

public class Node {
	
	private int data;
	private Node node;
	
	public Node() {
		this.data=0;
		this.node=null;
	}
	
	
	
	
	public Node(int data, Node node) {
		super();
		this.data = data;
		this.node = node;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	
	

}
