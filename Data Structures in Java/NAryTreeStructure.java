public class NAryTreeStructure{
	
	public int data;
	public NAryTreeStructure firstChild;
	public NAryTreeStructure nextSibling;

	

	pulic int getData(){

		return data;
	}
	// Setters
	public void setData(int data){
		this.data = data;
	}

	public void setFirstChild(BinaryTreeNode firstChild){
		this.firstChild = firstChild;
	}

	public void setSibling(BinaryTreeNode nextSibling){
		this.nextSibling = nextSibling;
	}

	// Getters

	public int getData(){
		return this.data;
	}

	public NAryTreeStructure getFirstChild(){
		return this.firstChild;
	}

	public NAryTreeStructure getSibling(){
		return this.nextSibling;
	}

	



}