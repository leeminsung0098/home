package com.mycompany.hello.domain;

import java.util.Date;

import lombok.Data;


@Data
public class MemberVO {
	private int user_uid;
	private String id;
	private String password;
	private String name;
	private String email;
	private String phonenum;
	private String burth;
	private Date regDate;
	
}
