package com.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.ping.ecut.student;

import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        //加载mybatis配置文件
        InputStream inputStream=Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        String statement="com.mapper.studentMapper.save";
//        student student=new student("2","张三",22,);
//        sqlSession.insert(statement,student);
        sqlSession.commit();
        sqlSession.close();
    }
}
