package array;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List1 = new ArrayList<>();
		System.out.println(List1.size());
		List1.add(10);
		List1.add(20);
		List1.add(30);
		System.out.println(List1.size());
		System.out.println(List1.get(2));
		List1.add(2,25);
		for(int i = 0; i <List1.size(); i++) {
		System.out.println(List1.get(i) + " ");
		}
		List1.remove(2);
		for(int i = 0; i <List1.size(); i++) {
			System.out.print(List1.get(i) + " ");
		}
	}

}
