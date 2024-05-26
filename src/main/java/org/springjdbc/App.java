package org.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springjdbc.config.SpringJDBCConfig;
import org.springjdbc.dao.StudentDao;
import org.springjdbc.entity.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("start...");
//        ApplicationContext context = new ClassPathXmlApplicationContext("springJDBCconfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
        Student student1 = new Student(2,"Ganesh","RKP");
        Student student2 = new Student(1,"Meghan","Blore");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        //INSERT
//        studentDao.insert(student1);
        //UPDATE
//        studentDao.change(student2);
        //DELETE
//        studentDao.delete(1);
        //SELECT single row
//         Student student=studentDao.getStudent(2);
//        System.out.println(student);
        //SELECT multiple row
        List<Student> students = studentDao.getAllStudents();
        for (Student s: students){
            System.out.println(s);
        }
        System.out.println("done");
    }
}
