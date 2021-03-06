package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.vo.UserVO;

@Controller
@RequestMapping("/users")
public class UserController {
	  @Autowired
	    UserMapper userMapper;
	    
	    @GetMapping
	    @ResponseBody
	    public List<UserVO> userList(){
	        System.out.println(userMapper.userList());
	        System.out.println("유저리스트 출력 성공");
	        return userMapper.userList();
	    }

	    
}
