package com.example.tugasp4_recycler_view;
public class barang {
    private String brand,tgl,chat;
    private int logo;
    public barang(String brand, String tgl, String chat, int logo){
        this.brand = brand;
        this.tgl = tgl;
        this.chat = chat;
        this.logo= logo ;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getTgl(){
        return tgl;
    }
    public void setTgl(String tgl){
        this.tgl = tgl;
    }
    public String getChat(){
        return chat;
    }
    public void setChat(String chat){
        this.chat = chat;
    }
    public int getLogo(){
        return logo;
    }
    public void setILogo(int logo){
        this.logo = logo;
    }
}

