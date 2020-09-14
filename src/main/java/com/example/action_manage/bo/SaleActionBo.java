package com.example.action_manage.bo;

public class SaleActionBo {

    private Integer id;
    private String actionname;
    private String begin;
    private String end;
    private String citycode;
    private String numflag;
    private String test1;
    private String test2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getNumflag() {
        return numflag;
    }

    public void setNumflag(String numflag) {
        this.numflag = numflag;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "SaleActionBo{" +
                "id=" + id +
                ", actionname='" + actionname + '\'' +
                ", begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                ", citycode='" + citycode + '\'' +
                ", numflag='" + numflag + '\'' +
                ", test1='" + test1 + '\'' +
                ", test2='" + test2 + '\'' +
                '}';
    }
}
