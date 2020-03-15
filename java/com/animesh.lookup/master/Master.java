package com.animesh.master;

import com.animesh.beans.Department;
import com.animesh.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Master {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee emp1=(Employee)context.getBean("employee");
        Department dept1=emp1.lookup();
        dept1.setDeptName("CS");
        dept1.setCreatedOn(new java.util.Date(System.currentTimeMillis()));
        System.out.println("Dept1 " + dept1.hashCode());

        Employee emp2=(Employee)context.getBean("employee");
        System.out.println("EMP2 " + emp2.lookup().hashCode());
    }
}
