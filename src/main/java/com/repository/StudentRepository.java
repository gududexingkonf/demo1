package com.repository;
import com.ping.ecut.student;

import java.util.List;

public interface StudentRepository {
    public int save(student student);
    public int updata(student student);
    public int deleteById(String id);
    public List<student>findAll();
    public student findById(String id);
    public student findName(String name);
    public student findNameAndAge(String name,int age);
    public int count();
    public String findNameById(String id);
}
