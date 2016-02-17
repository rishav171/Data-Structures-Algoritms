package DS;

public class node {
	private int data;
	private int Nextnode;
	
	
	public node(int data) {
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	public int getData() {
		return this.data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getNextnode() {
		return Nextnode;
	}
	public void setNextnode(node nextnode) {
		this.Nextnode = nextnode;
	}

}
