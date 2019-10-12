package com.example.retrofittask2;


class employee {

//    private String id;
    private String bloger_name;
    private String pic_url;
    private String types;
    private String College;
    private String bloger_topic;
    private String bloger_blog;
    private String bloger_status;
    private String bloger_pic;
    private String fblink;
    private String instalink;

    public employee(String bloger_name, String pic_url, String types, String college, String bloger_topic, String bloger_blog, String bloger_status, String bloger_pic, String fblink, String instalink) {
        this.bloger_name = bloger_name;
        this.pic_url = pic_url;
        this.types = types;
        College = college;
        this.bloger_topic = bloger_topic;
        this.bloger_blog = bloger_blog;
        this.bloger_status = bloger_status;
        this.bloger_pic = bloger_pic;
        this.fblink = fblink;
        this.instalink = instalink;
    }

    public String getBloger_name() {
        return bloger_name;
    }

    public void setBloger_name(String bloger_name) {
        this.bloger_name = bloger_name;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getBloger_topic() {
        return bloger_topic;
    }

    public void setBloger_topic(String bloger_topic) {
        this.bloger_topic = bloger_topic;
    }

    public String getBloger_blog() {
        return bloger_blog;
    }

    public void setBloger_blog(String bloger_blog) {
        this.bloger_blog = bloger_blog;
    }

    public String getBloger_status() {
        return bloger_status;
    }

    public void setBloger_status(String bloger_status) {
        this.bloger_status = bloger_status;
    }

    public String getBloger_pic() {
        return bloger_pic;
    }

    public void setBloger_pic(String bloger_pic) {
        this.bloger_pic = bloger_pic;
    }

    public String getFblink() {
        return fblink;
    }

    public void setFblink(String fblink) {
        this.fblink = fblink;
    }

    public String getInstalink() {
        return instalink;
    }

    public void setInstalink(String instalink) {
        this.instalink = instalink;
    }
}
