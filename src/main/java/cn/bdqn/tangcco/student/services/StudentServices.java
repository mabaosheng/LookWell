package cn.bdqn.tangcco.student.services;

import cn.bdqn.tangcco.entity.Student;

/**
 * Created by ASUS on 2017/7/28.
 */
public interface StudentServices {
    Integer queryCountStudent();
    Student queryStudentById(Integer id);
    Integer addStudent(Student student);
    Integer updateStudent(Student student);
    Integer deleteStudentById(Integer id);
}
