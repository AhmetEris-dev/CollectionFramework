package com.ahmete._00_List.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> sayilar= new ArrayList<>();
		sayilar.add(5);
		sayilar.add(2);
		sayilar.add(8);
		
		System.out.println("sayilar arraylistin ilk hali");
		for (Integer sayi : sayilar){
			System.out.println(sayi);
		}
		
		Collections.sort(sayilar); // kucukten büyüğe doğru sıralama yapar
		
		System.out.println("sayilar arraylistin Collection.sort metodundan sonraki hali");
		for (Integer sayi : sayilar){
			System.out.println(sayi);
		}
		
		
		
		Ogrenci ogre1=new Ogrenci("Ali",50.0,20);
		Ogrenci ogre2=new Ogrenci("Zeynep",40.0,15);
		Ogrenci ogre3=new Ogrenci("Kaan",30.0,22);
		
		ArrayList<Ogrenci> ogrenciler=new ArrayList<>();
		ogrenciler.add(ogre1);
		ogrenciler.add(ogre2);
		ogrenciler.add(ogre3);
		
		System.out.println(ogrenciler);
		//Collections.sort(ogrenciler); ilk yazdıgımızda ogrenci sınıfı comparable interface ini implemente etmediği
		// için hata verir
		
		//Ogrenci sınıfı comparable interface ini implemente ettikten sonra
		Collections.sort(ogrenciler);
		System.out.println("ort göre sıralı: "+ogrenciler);
	}
}