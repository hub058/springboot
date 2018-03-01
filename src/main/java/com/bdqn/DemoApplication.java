package com.bdqn;

import com.bdqn.dao.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@ComponentScan(basePackages = "com.bdqn")
@MapperScan("com.bdqn.dao")
public class DemoApplication {

	@Autowired
	private UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(args);
	}

	@RequestMapping({"/login","/"})
	public String login(String uname,String passwd,Model model){
		model.addAttribute("uname",uname);
		model.addAttribute("passwd",passwd);
		return "index";
	}

	@RequestMapping({"/getAll"})
	public String getAll(){
		return userMapper.getAll().toString();
	}
}
