package com.example.gridview;

public class SanPham {
    private String ten;
    private int Hinh;

    public SanPham(String ten, int hinh) {
        this.ten = ten;
        Hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
