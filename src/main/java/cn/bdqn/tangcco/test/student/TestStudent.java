package cn.bdqn.tangcco.test.student;

import cn.bdqn.tangcco.entity.Student;
import cn.bdqn.tangcco.student.services.StudentServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by ASUS on 2017/7/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestStudent {
    @Inject
    private StudentServices studentServices;
    @Test
   public void testDeleteStudent(){
        System.out.println(studentServices.deleteStudentById(4));
    }
    @Test
    public void testUpdateStudent(){
        Student stu = new Student();
        stu.setStudentId(1);
        stu.setStudentNum("111");
        stu.setUserId(1);
        int count = studentServices.updateStudent(stu);
        System.out.println(count);
    }
    @Test
    public void addStudent(){
        Student student = new Student();
        student.setStudentId(4);
        student.setStudentNum("444");
        student.setUserId(4);
        System.out.println(studentServices.addStudent(student));
    }
    @Test
    public void testQueryStudent(){
        System.out.println(studentServices.queryCountStudent());
    }
    @Test
    public void testQueryStudentById(){
        System.out.println(studentServices.queryStudentById(1));
    }
}
