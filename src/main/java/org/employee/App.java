package org.employee;

import org.employee.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //Configuring the bean using 2 xml files, one for Employee and one for Department.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext1.xml");
        Employee employee1 = context.getBean("employee", Employee.class);
        Employee employee2 = context.getBean("employee", Employee.class);
        //As employee's scope is prototype, employee1 and employee2 are diff objects referring to diff memory locations.
        System.out.print("Are employee1 and employee2 same instances? ");
        System.out.println(employee1==employee2);

        employee1.printEmployee();
        employee1.printDepartment();

        //Will call the destroy method of every bean.
        context.close();
    }
}
