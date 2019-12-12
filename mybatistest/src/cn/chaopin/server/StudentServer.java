package cn.chaopin.server;

import cn.chaopin.mapper.StudentMapper;
import cn.chaopin.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class StudentServer {
//   将mapper接口定义为StudentServer的属性
    private StudentMapper studentMapper;
//    在业务层调用mapper（dao层）的方法
    public List<Student> list() throws IOException {
        System.out.println("studentMapper = " + studentMapper);
        //      mybatis的模板代码
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(StudentServer.class.getClassLoader().getResourceAsStream("mybatis-3-cfg.xml"));
        System.out.println("sqlSessionFactory = " + sqlSessionFactory);
//       得到sqlsession的工厂对象之后需要将通过openSession方法获得sqlSession对象进行操作
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        打开session后，通过getMapper方法获取代理对象
        studentMapper = sqlSession.getMapper(StudentMapper.class);
        return studentMapper.list();
    }

}
