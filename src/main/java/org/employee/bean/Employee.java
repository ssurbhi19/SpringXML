package org.employee.bean;

import java.util.List;

public class Employee
{
    private Department department;
    private String name;
    private Integer age;
    private Double salary;
    private List<String> tasklist;

    //Getters and Setters
    public List<String> getTasklist() {
        return tasklist;
    }

    public void setTasklist(List<String> tasklist) {
        this.tasklist = tasklist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //Dependency injection through Setter.
    public void setDepartment(Department department)
    {
        this.department= department;
    }

    //Will call this method in xml file using init-method
    public void init()
    {
        System.out.println(getClass()+" init()");
    }

    //Will call this method in xml file using destroy-method
    public void destroy() {
        System.out.println(getClass()+" destroy()");
    }

    public void printEmployee()
    {
        System.out.println("Name:"+name+" Age:"+age+" Salary:"+salary+" TaskList:"+tasklist);
    }

    public void printDepartment()
    {
        department.print();
    }
}
