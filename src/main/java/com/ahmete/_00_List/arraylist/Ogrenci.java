package com.ahmete._00_List.arraylist;

public class Ogrenci implements Comparable<Ogrenci> {
	
	private String ad;
	private Integer yas;
	private Double ort;
	
	public Ogrenci(String ad, Double ort, Integer yas) {
		this.ad = ad;
		this.ort = ort;
		this.yas = yas;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getOrt() {
		return ort;
	}
	
	public void setOrt(Double ort) {
		this.ort = ort;
	}
	
	public Integer getYas() {
		return yas;
	}
	
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\'' + ", yas=" + getYas() + ", ort=" + getOrt() + '}';
	}
	
	@Override
	public int compareTo(Ogrenci o) {
		return (this.ort < o.ort) ? -1 : ((this.ort == o.ort) ? 0 : 1);
	}
}