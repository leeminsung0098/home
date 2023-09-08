package com.mycompany.hello.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.hello.domain.MemberVO;

import Service.MemberService;


@Controller
public class UserController {
	
	@Autowired
	MemberService memberservice;
	
	@RequestMapping("/userlist")
	public String userlist(Model model) {
		List<MemberVO>list = memberservice.selectList();
		model.addAttribute("list",list);
		System.out.println("�������Ʈ ����");
		return "member/list";
	}
	
//	@GetMapping("signup")
//	public String signup() {
//		System.out.println("ȸ������ ����");
//		return "member/signup";
//	}

}
