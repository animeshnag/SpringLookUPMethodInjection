package com.animesh.beans;

import java.util.Date;

public class Department {

    private String deptName;
    private Date createdOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}

