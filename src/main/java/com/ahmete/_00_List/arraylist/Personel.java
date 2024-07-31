package com.ahmete._00_List.arraylist;

public class Personel {
	private String ad;
	private String soyAd;
	private Integer yas;
	private Double maas;
	
	public Personel(String ad, String soyAd, Integer yas, Double maas) {
		this.ad = ad;
		this.soyAd = soyAd;
		this.yas = yas;
		this.maas = maas;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getMaas() {
		return maas;
	}
	
	public void setMaas(Double maas) {
		this.maas = maas;
	}
	
	public String getSoyAd() {
		return soyAd;
	}
	
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	
	public Integer getYas() {
		return yas;
	}
	
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	
	@Override
	public String toString() {
		return "Personel{" + "ad='" + getAd() + '\'' + ", soyAd='" + getSoyAd() + '\'' + ", yas=" + getYas() + ", maas=" + getMaas() + '}';
	}
	
}