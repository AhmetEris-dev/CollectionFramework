package com.ahmete._00_List.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _02_Comparator {
	public static void main(String[] args) {
		ArrayList<Integer> sayilar= new ArrayList<>();
		sayilar.add(5);
		sayilar.add(2);
		sayilar.add(8);
		
		System.out.println("sayilar arraylistin ilk hali");
		for (Integer sayi : sayilar){
			System.out.println(sayi);
		}
		
		Comparator<Integer> comparator=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		};
		
		// lambda expression hali:
		Comparator<Integer> comparator1=(o1,o2) -> o1-o2;
		
		// dogal sıralama yapar.
		Comparator<Integer> comparatorComparingInt= Comparator.comparingInt(o->o);
		
		
		
		Collections.sort(sayilar,comparator);
		System.out.println("sayilar arraylistin ilk hali");
		for (Integer sayi : sayilar){
			System.out.println(sayi);
		}
	}
}