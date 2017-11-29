package com.allen.entity;

import java.util.Date;

/**
 * Created by AllenWish on 2017-11-28.
 */
public class InfoEntity {
    private int id;
    private int infoType;
    private String infoTitle;
    private String infoContent;
    private String infoLinkman;
    private String infoPhone;
    private String infoEmail;
    private Date infoDate;
    private String infoState;
    private String infoPayfor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInfoType() {
        return infoType;
    }

    public void setInfoType(int infoType) {
        this.infoType = infoType;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public String getInfoLinkman() {
        return infoLinkman;
    }

    public void setInfoLinkman(String infoLinkman) {
        this.infoLinkman = infoLinkman;
    }

    public String getInfoPhone() {
        return infoPhone;
    }

    public void setInfoPhone(String infoPhone) {
        this.infoPhone = infoPhone;
    }

    public String getInfoEmail() {
        return infoEmail;
    }

    public void setInfoEmail(String infoEmail) {
        this.infoEmail = infoEmail;
    }

    public void setInfoDate(Date infoDate) {
        this.infoDate = infoDate;
    }

    public Date getInfoDate() {
        return infoDate;
    }

    public String getInfoState() {
        return infoState;
    }

    public void setInfoState(String infoState) {
        this.infoState = infoState;
    }

    public String getInfoPayfor() {
        return infoPayfor;
    }

    public void setInfoPayfor(String infoPayfor) {
        this.infoPayfor = infoPayfor;
    }
}
