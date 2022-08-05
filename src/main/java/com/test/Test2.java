package com.test;

import com.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.ping.ecut.student;
import org.springframework.jdbc.core.metadata.SqlServerCallMetaDataProvider;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream=Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //获取实现代理接口的实现对象
        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
        //添加数据
//        student student=new student("3","小明",18);
//        studentRepository.save(student);
//        sqlSession.commit();

        //查询全部
//        List<student>list=studentRepository.findAll();
//        for(student student1:list){
//            System.out.println(student1);
//        }

        //指定查询
//        student student1=studentRepository.findById("2");
//        System.out.println(student1);

        //修改
//        student student2=studentRepository.findById("1");
//        student2.setAge(18);
//        student2.setName("小张");
//        studentRepository.updata(student2);
//        sqlSession.commit();

        //删除
//        studentRepository.deleteById("2");
//        sqlSession.commit();
//        sqlSession.close();

        //按名字查询
        System.out.println(studentRepository.findName("小张"));

        //按名字年龄查询
        System.out.println(studentRepository.findNameAndAge("小张",18));

        //统计student的数量
        System.out.println(studentRepository.count());

        //根据条件查询需要的值
        System.out.println(studentRepository.findNameById("1"));
        System.out.println("hello word");
        System.out.println("hot-fix");
        System.out.println("hot-fix test");
        System.out.println("2022.8.5");
    }
}
