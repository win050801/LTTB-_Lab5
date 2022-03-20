package com.example.on_gk;

public class emtity {
    private int image;
    private String ten;
    private String cuahang;
    private String gia;

    public emtity(int image, String ten, String cuahang, String gia) {
        this.image = image;
        this.ten = ten;
        this.cuahang = cuahang;
        this.gia = gia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCuahang() {
        return cuahang;
    }

    public void setCuahang(String cuahang) {
        this.cuahang = cuahang;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
