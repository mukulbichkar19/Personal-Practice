public class interLeaving{
	
	// Not a memory efficient method but still a workaround
	// Refer Problem 9 from Algos and DS book 

	static java.util.Queue<Integer> qsub1;
	static java.util.Queue<Integer> qsub2;

	public static void main(String args[]){

		java.util.Queue<Integer> q = new java.util.LinkedList<Integer>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		
		int originalsize = 

		qsub1 = new java.util.LinkedList<Integer>();
		qsub2 = new java.util.LinkedList<Integer>();
		for(int i=0;i<(q.size()/2);i++){
			qsub1.add(q.poll());
		}
		for(int i=(q.size()/2);i<q.size();i++){
			qsub2.add(q.poll());
		}

		for(int i=0;i<qsub1.size();i++){
			q.add(qsub1.poll());
			q.add(qsub2.poll());
		}

		for(int i:q){
			System.out.println(q);
		}




	}
}