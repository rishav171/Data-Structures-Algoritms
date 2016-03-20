package Linked_list;

public class node {
	private int data;
	private node Nextnode;
	
	
	
	
	public node(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public node getNextnode() {
		return Nextnode;
	}
	public void setNextnode(node nextnode) {
		Nextnode = nextnode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "data"+" "+this.data;
	}
	
	
	
	
}
