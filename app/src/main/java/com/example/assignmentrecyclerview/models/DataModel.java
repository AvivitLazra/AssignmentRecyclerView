package com.example.assignmentrecyclerview.models;

public class DataModel {
    private String cName;
    private String cDesc;
    private int Image;

    public DataModel(String cName, String cDesc, int image) {
        this.cName = cName;
        this.cDesc = cDesc;
        Image = image;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
