package com.project1.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project1.test.bean.Doctor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext(" ./Resource/spring.xml");
    	Doctor doctor =context.getBean(Doctor.class);
    	doctor.doctorAssit();
    
    	
    	System.out.println(doctor.getName());
    	System.out.println(doctor.getQualification());
    	
    }
}
