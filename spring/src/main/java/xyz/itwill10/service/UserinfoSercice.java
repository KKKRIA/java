package xyz.itwill10.service;

import java.util.List;

import xyz.itwill10.dto.Userinfo;
import xyz.itwill10.exception.ExistuUserinfoException;
import xyz.itwill10.exception.LoginAuthFailException;
import xyz.itwill10.exception.UserinfoNotFoundException;

public interface UserinfoSercice {
	void addUserinfo(Userinfo userinfo ) throws ExistuUserinfoException;
	void modifyUserinfo(Userinfo userinfo) throws UserinfoNotFoundException;
	void removeUserinfo(String userinfo) throws UserinfoNotFoundException;
	Userinfo getUserinfo(String userinfo) throws UserinfoNotFoundException;
	List<Userinfo> getUseinfoList();
	Userinfo loginAuth(Userinfo userinfo) throws LoginAuthFailException ;
} 
