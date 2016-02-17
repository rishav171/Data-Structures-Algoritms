package DS;

public class LinkedList {

	private node Head;
	
	public void InsertatHead(int data){
		node newnode=new node(data);
		newnode.setNextnode(this.Head);
	}
	
}
