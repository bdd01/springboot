package com.example.action_manage.bo;

public class UserInfoBo {

    private Integer id;
    private String name;
    private String oaname;
    private String msisdn;
    private String provcode;
    private String citycode;
    private String passwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }


    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getOaname() {
        return oaname;
    }

    public void setOaname(String oaname) {
        this.oaname = oaname;
    }

    public String getProvcode() {
        return provcode;
    }

    public void setProvcode(String provcode) {
        this.provcode = provcode;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    @Override
    public String toString() {
        return "UserInfoBo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oaname='" + oaname + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", provcode='" + provcode + '\'' +
                ", citycode='" + citycode + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
