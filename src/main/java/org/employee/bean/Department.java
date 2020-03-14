package org.employee.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Date;

public class Department implements InitializingBean, DisposableBean
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
        System.out.println("Department name:"+this.deptName+" Date:"+this.date);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(getClass()+" destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass()+" init()");
    }

}
