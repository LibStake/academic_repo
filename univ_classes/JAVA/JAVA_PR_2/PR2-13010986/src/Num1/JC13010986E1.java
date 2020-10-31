package Num1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class JC13010986E1 {
	public static void main(String [] args) {
		System.out.println("13010986 최기표");
		
		HashMap<String, Location> dict = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);
		
		String buf;
		String [] res;
		
		System.out.println("도시, 위도, 경도를 입력하세요.");
		for (int i=0; i<4; i++) {	
			System.out.print(">> ");
			buf = scanner.nextLine();
			res = buf.split(" ");
			dict.put(res[0], new Location(res[0], Integer.parseInt(res[1]), Integer.parseInt(res[2])));
		}
		
		Iterator<String> it = dict.keySet().iterator();
		System.out.println("------------------------------");
		while (it.hasNext()) System.out.println(dict.get(it.next()).toString());
		System.out.println("------------------------------");
		
		buf = "";
		Location loc;
		while (true) {
			System.out.print("도시 이름 >> ");
			buf = scanner.next();
			
			if (buf.equals("그만")) break;
			
			loc = dict.get(buf);
			if (loc != null) System.out.println(loc.toString());
			else System.out.println(buf + "은(는) 없습니다.");
		}
	}
}
