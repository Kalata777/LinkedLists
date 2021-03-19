package paket;

import java.util.LinkedList;

public class speedTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		long start = 0l;
		long end = 0l;

		for (int i = 0; i < 5000000; i++) {
			list.add(i);
		}

		int temp = 0;

	
		start = System.currentTimeMillis();
		for (int i = 0; i < 500000; i++) {
			temp = list.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}