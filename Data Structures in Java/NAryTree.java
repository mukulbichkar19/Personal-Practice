public class NAryTree{


	// NAryTree Strcuture
	// For entire program we will be using the following tree structure
	//                               A(1)
	//								 |
	//      -----------------------------------------------------------
	//      |           |        |          |            |            |
	//      B(2)        C(3)     D(4)       E(5)         F(6)         G(7)
	//                           |         / |           |            |
	//                           H(8)     I(9) J(10)  -------------    N(11)
	//                                       |        |     |     |
	//                                   ---------    K(14) L(15) M(16)
	//                                   |       |
	//                                  P(12)    Q(13)

	

	public int getSum(NAryTreeStructure root){

		if(root == null){
			return 0;
		}
		return root.getData()+getSum(root.getFirstChild())+getSum(root.getnextSibling());


	}

	public int getSiblingCount(NAryTreeStructure current){

		int count = 0;
		while(current.getnextSibling() != null){
			count++;
			current = current.getnextSibling();
		}
		return count;

	}







	public static void main(String args[]){

			// Above Tree Structure
			NAryTree tree = new NAryTree();
			NAryTreeStructure root = new NAryTreeStructure();
			root.setData(1);
			NAryTreeStructure b = new NAryTreeStructure();
			b.setData(2);
			NAryTreeStructure c = new NAryTreeStructure();
			c.setData(3);
			NAryTreeStructure d = new NAryTreeStructure();
			d.setData(4);
			NAryTreeStructure e = new NAryTreeStructure();
			e.setData(5);
			NAryTreeStructure f = new NAryTreeStructure();
			f.setData(6);
			NAryTreeStructure g = new NAryTreeStructure();
			g.setData(7);
			NAryTreeStructure h = new NAryTreeStructure();
			h.setData(8);
			NAryTreeStructure i = new NAryTreeStructure();
			i.setData(9);
			NAryTreeStructure j = new NAryTreeStructure();
			j.setData(10);
			NAryTreeStructure n = new NAryTreeStructure();
			n.setData(11);
			NAryTreeStructure p = new NAryTreeStructure();
			p.setData(12);
			NAryTreeStructure q = new NAryTreeStructure();
			q.setData(13);
			NAryTreeStructure k = new NAryTreeStructure();
			k.setData(14);
			NAryTreeStructure l = new NAryTreeStructure();
			l.setData(15);
			NAryTreeStructure m = new NAryTreeStructure();
			m.setData(16);
			// First Level Completed
			root.setFirstChild(b);
			b.setnextSibling(c);
			c.setnextSibling(d);
			d.setnextSibling(e);
			e.setnextSibling(f);
			f.setnextSibling(g);

			// Second Level
			d.setFirstChild(h);
			e.setFirstChild(i);
			i.setnextSibling(j);
			f.setFirstChild(k);
			k.setnextSibling(l);
			l.setnextSibling(m);
			g.setFirstChild(n);

			// Third Level
			j.setFirstChild(p);
			p.setnextSibling(q);


			// Find Sum of a Tree
			System.out.println(tree.getSum(root));

			// Count of Siblings of a node
			System.out.println(tree.getSiblingCount(root));



	}
}