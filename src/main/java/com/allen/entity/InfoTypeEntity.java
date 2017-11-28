package com.allen.entity;

/**
 * Created by Administrator on 2017-11-28.
 */
public class InfoTypeEntity {

    private int id;
    private int typeSign;
    private String typeName;
    private String typeIntro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeSign() {
        return typeSign;
    }

    public void setTypeSign(int typeSign) {
        this.typeSign = typeSign;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeIntro() {
        return typeIntro;
    }

    public void setTypeIntro(String typeIntro) {
        this.typeIntro = typeIntro;
    }
}
