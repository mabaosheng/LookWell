package cn.bdqn.tangcco.student.dao;

import cn.bdqn.tangcco.entity.Student;

/**
 * Created by ASUS on 2017/7/28.
 */
public interface StudentMapper {
    Integer queryCountStudent();
    Student queryStudentById(Integer id);
    Integer addStudent(Student student);
    Integer updateStudent(Student student);
    Integer deleteStudentById(Integer id);
}
