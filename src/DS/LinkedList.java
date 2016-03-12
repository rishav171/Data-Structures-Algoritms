package DS;

public class LinkedList {

	
	private node head;
	
	
	public void InsertatHead(int data){
		head=null;
		node newnode=new node(data);
		//newnode.setData(2);
		newnode.setNextnode(this.head);
		this.head=newnode;
		System.out.println();
		
		
		
		
		
		
		
		
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
