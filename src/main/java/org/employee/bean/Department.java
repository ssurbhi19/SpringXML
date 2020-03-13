package org.employee.bean;

import java.util.Date;

public class Department
{
    private String deptName;
    private Date date;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeptName() {
        return deptName;
    }

    public void print()
    {
        System.out.println("Inside Department class");
        System.out.println(this.deptName);
        System.out.println(this.date);
    }

}
