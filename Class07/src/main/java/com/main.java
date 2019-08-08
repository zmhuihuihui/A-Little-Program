package com;

import com.dao.UserDao;
import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception{

        //从资源文件中读取数据流
        InputStream inputStream = Resources.getResourceAsStream("SqlConfig.xml");

        //用工厂创建SqlSession对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession session =factory.openSession();

        //SqlSession对象实现Dao接口的动态代理
        UserDao userDao =session.getMapper(UserDao.class);

        //使用代理对象调用方法
        List<User> userList = userDao.findAll();
        for(User user:userList)
        {
            System.out.println(user);
        }

        //释放资源
        session.close();
        inputStream.close();
    }
}
