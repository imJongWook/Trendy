package com.trendy.admin.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class userController 
{
	@Autowired
	private userService service;
	
	//회원관리 목록 페이지 
	@RequestMapping("memberInfo")
	public String user_(String select, String search,
			@RequestParam(value="currentPage", required = false) String cp, Model model) {
		//service.memberInfo(select, search, cp, model);
		return "member/memberInfo";
	}
}
