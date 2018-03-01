package com.bdqn;

import com.bdqn.dao.UserMapper;
import com.bdqn.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.bdqn.dao")
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
        List<User> userList = userMapper.getAll();

        for (User user :
                userList) {
            System.out.println(user.getDevName()+user.getDevInfo());
        }
    }

	@Test
	public void insertUser() {
        User user = new User();
        user.setDevName("zhaoliu");
        user.setDevCode("12345");
        userMapper.insertUser(user);
        System.out.println("添加成功");
    }

}
