package thaobcph28911.fpoly.luyentapbaithi;

import java.io.Serializable;

public class user implements Serializable {
    private String name;
    private String address;
    private int id;
    private int img;

    private int a;






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImgdelete() {
        return imgdelete;
    }

    public void setImgdelete(int imgdelete) {
        this.imgdelete = imgdelete;
    }

    public user(String name, String address, int id, int img, int imgdelete) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.img = img;
        this.imgdelete = imgdelete;
    }

    private int imgdelete;

    public user() {
    }
}
