package com.test;

import com.repository.ClassaRepository;
import com.repository.StudentClassRepository;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream=Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactor=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactor.openSession();
//        StudentClassRepository studentClassRepository=sqlSession.getMapper(StudentClassRepository.class);
//        System.out.println(studentClassRepository.findByid(1));
        ClassaRepository classaRepository=sqlSession.getMapper(ClassaRepository.class);
        System.out.println(classaRepository.findById(2));
    }
}
