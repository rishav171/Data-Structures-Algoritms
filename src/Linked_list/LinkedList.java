package Linked_list;


public class LinkedList {

	
	private node head;
	
	
	public void InsertatHead(int data){
	node newnode=new node(data);
	newnode.setNextnode(this.head);
	this.head=newnode;
		
		
	} 
	
	public int length(){
		
		int length=0;
		node current=this.head;
		while(current!=null){
			
			length++;
			current=current.getNextnode();
		}
		return length;
		
		
	}
	public void delFromHead(){
		
		this.head=this.head.getNextnode();
		
	}
	public node node_find(int data){
		
		node current=this.head;
		while(current!=null){
			if(current.getData()==data){
				return current;
			}
			current=current.getNextnode();
			
		}
		return null;
		
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result="{";
		node current=this.head;
		while(current!=null){
			result+=current.toString()+",";
			current=current.getNextnode();
		}
		result+="}";
		return result;
	}
	
}
