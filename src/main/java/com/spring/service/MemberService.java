package com.spring.service;

import com.spring.domain.AuthVO;
import com.spring.domain.ChangeVO;
import com.spring.domain.LoginVO;

public interface MemberService {
	public AuthVO login(LoginVO login);
	
	public String getPwd(String userid);
	
	public boolean updatePwd(ChangeVO vo);
	
	public boolean delete(String userid);

}
