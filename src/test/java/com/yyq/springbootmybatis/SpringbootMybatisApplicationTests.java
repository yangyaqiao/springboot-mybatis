package com.yyq.springbootmybatis;

import com.yyq.springbootmybatis.entity.User;
import com.yyq.springbootmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired(required = false)
	UserMapper userMapper;

	@Test
	void contextLoads() {
//		IPage<User> page = new Page<>(1,5);
//		IPage<User> users = userMapper.selectPage(page,null);
		List<User> users = userMapper.list();
		List<User> userList = users.subList(0, 10);
		System.out.println(userList);
	}

}
