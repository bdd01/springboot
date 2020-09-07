package com.example.action_manage.bo;

public class SaleJobBo {
    private Integer id;
    private String jobname;
    private String begin;
    private String end;
    private String school;
    private String numflag;
    private String actionname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNumflag() {
        return numflag;
    }

    public void setNumflag(String numflag) {
        this.numflag = numflag;
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname;
    }

    @Override
    public String toString() {
        return "SaleJobBo{" +
                "id=" + id +
                ", jobname='" + jobname + '\'' +
                ", begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                ", school='" + school + '\'' +
                ", numflag='" + numflag + '\'' +
                ", actionname='" + actionname + '\'' +
                '}';
    }
}
