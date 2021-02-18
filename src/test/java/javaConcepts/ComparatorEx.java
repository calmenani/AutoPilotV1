package javaConcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(925);
		list.add(124);
		list.add(827);
		list.add(122);
		list.add(529);
		list.add(325);

		/*Comparator<Integer> co = new Comparator<Integer>() 
		{
			public int compare(Integer i, Integer j) 
			{
				return i % 10 > j % 10 ? 1 : -1;
			}
		};*/
		Collections.sort(list, (i,j)->i % 10 > j % 10 ? 1 : -1);
		for (Integer o : list) {
			System.out.println(o);
		}

	}

}
