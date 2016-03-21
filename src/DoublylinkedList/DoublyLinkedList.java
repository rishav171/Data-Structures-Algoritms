package DoublylinkedList;

import Linked_list.node;

public class DoublyLinkedList {
	
	
	
	private node head;
	
	public void insertathead(int data){
		
		
		node newnode=new node(data);
		newnode.setNextnode(this.head);
		
		if(this.head!=null){
			this.head.setPrevnode(newnode);
		}
		this.head=newnode;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		node n=this.head;
		while(n!=null){
			sb.append("node data");
			sb.append(n);
			sb.append("\n");
		}
		return sb;
	}

}
