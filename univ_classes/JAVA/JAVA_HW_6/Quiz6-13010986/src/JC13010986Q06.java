import java.util.HashMap;
import java.util.Iterator;

public class JC13010986Q06 {
	public static void main(String [] args) {
		System.out.println("13010986 √÷±‚«•");
		
		Point p1 = new Point(-10, -10);
		Point p2 = new Point(10, 10);
		Point p3 = new Point(20, 20);
		Point p4 = new Point(30, 30);
		
		HashMap<Integer, Point> map = new HashMap<Integer, Point>();
		map.put(p1.sum(), p1);
		map.put(p2.sum(), p2);
		map.put(p3.sum(), p3);
		map.put(p4.sum(), p4);
		
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int k = it.next();
			System.out.println(map.get(k).toString());
		}
	}
}
