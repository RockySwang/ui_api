package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User Config Controller
 * 
 * @author swang1
 * June 7, 2018
 * 4:05:01 PM
 */
@RestController
@RequestMapping("/users")
@SwaggerAnnotated
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;

	@CrossOrigin
	@ResponseBody
	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping(value="", method = RequestMethod.GET)
	@AdminPrivilegeRequired
	public List<JobUserDTO> userInfoList(String requestId){
		List<JobUserDTO> userList = new ArrayList<JobUserDTO>();
		
		userList = userService.getUserList();
		
		return userList;
	}
	
	/** The method for switching the user roles to admin.
	 * user name
	 * @return key - status succ/fail   
	 * **/
	@CrossOrigin
	@ResponseBody
	@Produces({ MediaType.APPLICATION_JSON }) 
	@Consumes(MediaType.APPLICATION_JSON)
	@RequestMapping(value="/{userName}",  method = RequestMethod.PATCH)
	@AdminPrivilegeRequired
	public Boolean switchRole(@PathVariable String userName){
		Long userId = userService.fetchUserId(userName);
		int count = userService.switchRoleToAdmin(userId);
		if(count>0){
			return true;
		}
		else {
			return false;
		}
	}

	@CrossOrigin
	@ResponseBody
	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping(value="/currentProfile", method = RequestMethod.GET)
	public UserVO getUserProfile(HttpServletRequest request){
		UserVO userVO= new UserVO();
		Context context= ContextHolder.getContext();
		userVO.setUserId(context.getUserId().toString());
		userVO.setUserEmail(context.getUserEmail());
		userVO.setUserName(context.getNtUsername());
		userVO.setRoleName(context.getRoleName());
		return userVO;
	}

	@CrossOrigin
	@ResponseBody
	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request,HttpServletResponse response,@RequestParam("userName")String userName, @RequestParam("password")String password){

		User user=userService.getUser(userName);
		if(user!=null)
		{
			UserSessionHelper.setUserInfo(request,user.getEmail(),user.getUsername());
			HeaderHelper.setUserInfoIntoHeader(response,user.getUsername(),user.getEmail());
		}
		else
		{
			return "invalid user name";
		}
		return "success";
	}

}