package org.employee.bean;

import org.employee.bean.Department;

import java.util.List;

public class Employee
{
    private Department department;
    private String name;
    private Integer age;
    private Double salary;
    private List<String> tasklist;
    public void Employee() {}

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

    public void setDepartment(Department department)
    {
        System.out.println("Creating the object of Department class");
        this.department= department;
    }

    public void init(){
        System.out.println(getClass()+" INIT");
    }
    public void destroy() {
        System.out.println(getClass()+" DESTROY");
    }

    public void printEmployee()
    {
        System.out.println(name+" "+age+" "+salary+" "+tasklist);
    }

    public void printDepartment()
    {
        department.print();
    }
}
