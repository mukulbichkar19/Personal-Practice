import java.util.*;
public class comparatorExample{
	



	public static void main(String args[]){


		TreeSet t = new TreeSet(new myComparator());
		t.add(10);
		t.add(2);
		t.add(0);
		t.add(15);
		t.add(20);
		System.out.println(t);

		Map m = new HashMap();
		m.put(101,"abc");
		m.put(102,"def");
		m.put(101,"ghi");
		System.out.println(m);






	}

}

class myComparator implements Comparator{

		public int compare(Object o1,Object o2){

			Integer i1 = (Integer)o1;
			Integer i2 = (Integer)o2;

			return i1.compareTo(i2);


		}
	}