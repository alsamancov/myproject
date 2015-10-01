package com.springapp.mvc.service;


import com.springapp.mvc.dao.StudentDao;
import com.springapp.mvc.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public void insert(Student student) {
        studentDao.insert(student);
    }
}
