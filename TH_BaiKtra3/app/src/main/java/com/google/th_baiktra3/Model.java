package com.google.th_baiktra3;

public class Model {
    String tenPhepTinh;
    String khuvuc;
    int icon;

    public Model(String tenPhepTinh,String khuvuc, int icon) {
        this.tenPhepTinh = tenPhepTinh;
        this.khuvuc = khuvuc;
        this.icon = icon;


    }

    public String getTenPhepTinh() {
        return tenPhepTinh;
    }

    public void setTenPhepTinh(String tenPhepTinh) {
        this.tenPhepTinh = tenPhepTinh;
    }

    public String getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
