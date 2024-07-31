package com.ahmete._00_List.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _00_ArrayListIterator {
	public static void main(String[] args) {
		// ArrayList oluşturma
		ArrayList<String> musteriler=new ArrayList<>();
		
		//ArrayList eleman ekleme
		musteriler.add("Ali");
		musteriler.add("Veli");
		musteriler.add("Su");
		
		// for ile arraylistte gezinme
		System.out.println("for ile gezinme: ");
		for (int i = 0; i <musteriler.size() ; i++) {
			System.out.println(musteriler.get(i));
		}
		
		//foreach ile arraylistte gezinme:
		System.out.println("foreach ile gezinme");
		for (String musteri:musteriler){
			System.out.println(musteri);
			
		}
		
		//Iterator ile gezinme:
		System.out.println("Iterator ile gezinme: ");
		
		Iterator<String> iterator = musteriler.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		// iterator -> hasNext, next, remove
		
		//listIterator ile gezinme
		System.out.println("listIterator ile gezinme");
		ListIterator<String> stringListIterator= musteriler.listIterator();
		System.out.println("nextIndex: "+stringListIterator.nextIndex());
		System.out.println("next: "+stringListIterator.next());
		System.out.println("nextIndex: "+stringListIterator.nextIndex());
		System.out.println("next: "+stringListIterator.next());
		System.out.println("nextIndex: "+stringListIterator.nextIndex());
		System.out.println("next: "+stringListIterator.next());
//		System.out.println("next: "+stringListIterator.next()); // NoSuchElementException hatası
		System.out.println("nextIndex: "+stringListIterator.nextIndex());
		
		System.out.println("previous: "+stringListIterator.previous());
//		System.out.println("previous: "+stringListIterator.previous());
//		System.out.println("previous: "+stringListIterator.previous());
		
		System.out.println("nextIndex: "+stringListIterator.nextIndex());
		
		stringListIterator.add("Tolga");
		stringListIterator.previous();
		
		
		while (stringListIterator.hasNext()){
			System.out.println(stringListIterator.next());
		}
	
	}
}