package cn.chaopin.server;

import cn.chaopin.mapper.StudentMapper;
import cn.chaopin.pojo.Student;

import java.util.List;

public class StudentServer {
//   将mapper接口定义为StudentServer的属性
    private StudentMapper studentMapper;
//    在业务层调用mapper（dao层）的方法
    public List<Student> list() {
        return studentMapper.list();
    }

}
