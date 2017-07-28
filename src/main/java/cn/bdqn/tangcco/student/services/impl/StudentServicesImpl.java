package cn.bdqn.tangcco.student.services.impl;

import cn.bdqn.tangcco.entity.Student;
import cn.bdqn.tangcco.student.dao.StudentMapper;
import cn.bdqn.tangcco.student.services.StudentServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ASUS on 2017/7/28.
 */
@Service
public class StudentServicesImpl implements StudentServices{
    @Resource
    private StudentMapper studentMapper;
    @Override
    public Integer queryCountStudent() {
        return studentMapper.queryCountStudent();
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public Integer addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Integer deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }
}
