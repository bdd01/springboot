package com.example.action_manage.bo;

public class LoginBo {
    private Integer id;
    private String name;
    private String passWd;

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

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    @Override
    public String toString() {
        return "LoginBo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passWd='" + passWd + '\'' +
                '}';
    }
}
