package DS;

public class node {
	private int data;
	private node Nextnode;
	
	
	
	
	public node(node nextnode) {
		Nextnode = nextnode;
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
	
	
	
}
