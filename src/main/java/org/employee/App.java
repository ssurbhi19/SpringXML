package org.employee;

import org.employee.bean.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext1.xml");
        Employee employee1 = context.getBean("employee", Employee.class);
        //Employee employee2 = context.getBean("employee", Employee.class);
        //System.out.println(employee1==employee2);
        System.out.println(employee1);
        //System.out.println(employee2);
        employee1.printDepartment();
        employee1.printEmployee();
        //context.registerShutdownHook();
        context.close();
    }
}
