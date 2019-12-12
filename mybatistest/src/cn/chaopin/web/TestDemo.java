package cn.chaopin.web;

import cn.chaopin.pojo.Student;
import cn.chaopin.server.StudentServer;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestDemo {
    StudentServer studentServer = new StudentServer();
    @Test
    public void queryTest() throws IOException {

        List<Student> list = studentServer.list();
        System.out.println(list);
    }
}
