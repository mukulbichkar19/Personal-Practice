	public class NAryTreeStructure{

		public int data;
		public NAryTreeStructure firstChild;
		public NAryTreeStructure nextSibling;




		// Setters
		public void setData(int data){
			this.data = data;
		}

		public void setFirstChild(NAryTreeStructure firstChild){
			this.firstChild = firstChild;
		}

		public void setnextSibling(NAryTreeStructure nextSibling){
			this.nextSibling = nextSibling;
		}

		// Getters

		public int getData(){
			return this.data;
		}

		public NAryTreeStructure getFirstChild(){
			return this.firstChild;
		}

		public NAryTreeStructure getnextSibling(){
			return this.nextSibling;
		}





	}
