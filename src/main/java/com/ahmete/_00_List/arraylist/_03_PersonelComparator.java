package com.ahmete._00_List.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _03_PersonelComparator {
	public static void main(String[] args) {
		ArrayList<Personel> personelArrayList=new ArrayList<Personel>();
		
		personelArrayList.add(new Personel("Alex","Walker",30,50000.0));
		personelArrayList.add(new Personel("Alexander joseph","Walker",30,50000.0));
		personelArrayList.add(new Personel("Murat","Saçak",25,40000.0));
		personelArrayList.add(new Personel("murat","Tufan",28,45000.0));
		personelArrayList.add(new Personel("Harun","Sakin",28,45000.0));
		
		//bu sınıf içine bir comparator yazınız.
		// comparator ile personelArrayList'i ad a göre a->z ye sıralayalım.
		// eger adlar aynı ise soyada göre z->a ya sıralayalım.
		
		Comparator<Personel> personelComparator=new Comparator<Personel>() {
			@Override
			public int compare(Personel o1, Personel o2) {
				int sonuc=  o1.getAd().compareToIgnoreCase(o2.getAd());
				if (sonuc==0){
					sonuc=o2.getSoyAd().compareToIgnoreCase(o1.getSoyAd());
				}
				return sonuc;
			}
		};
		
		
		Collections.sort(personelArrayList, personelComparator);
		for (Personel personel:personelArrayList){
			System.out.println(personel);
		}
		
		// personelleri isimlerin uzunluguna göre dogal sıralı getiren comparatoru yazınız
		
		Comparator<Personel> personelAdLegntComparator=new Comparator<Personel>() {
			@Override
			public int compare(Personel o1, Personel o2) {
				
				return o1.getAd().length()-o2.getAd().length();
			}
		};
	}
}