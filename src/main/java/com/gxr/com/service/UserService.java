package com.gxr.com.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.gxr.com.entity.User;

/**
* @Description: TODO(用一句话描述该做什么) 
* @author Mayanlong   
* @date 2016年3月30日 下午6:39:57 
* @version V1.0   
*/
@Path("User")
public interface UserService { 

    /**
     * 保存用户
     * @param user
     * @return
     */
	@POST
	@Path("creat")
    void save(User user);   
}
