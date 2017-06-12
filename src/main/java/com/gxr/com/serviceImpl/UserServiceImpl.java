package com.gxr.com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxr.com.dao.UserMapper;
import com.gxr.com.entity.User;
import com.gxr.com.service.UserService;


/**
 * @Description: TODO 用户登录注册
 * @author Mayanlong
 * @date 2016年3月30日 下午7:00:06
 * @version V1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;;
	@Override
	public void save(User user) {
		 userMapper.insertSelective(user);
	}


	/**
	 * 注册
	 */
	/*@Override
	public User userRegister(User user) {

		try {

			user.setEmail(user.getEmail());
			//user.setNickname(user.getNickname());
			user.setNickname(user.getNickname());
			user.setCreateTime(DateUtil.getCurrentTime());
			user.setUpdateTime(DateUtil.getCurrentTime());
			user.setPassword(MD5.sign(user.getPassword()));
			user.setZoneId(user.getZoneId());
			user.setState(0);
			user.setRoles("0");

			
			// url加密
			String passAlgorithmsCiphering = algorithmsCiphering(new Object[] { user.getEmail() });
			int insertSelective = userMapper.insertSelective(user);
			
			if (insertSelective > 0) {
				// 根据邮箱查询
				User userEmail = userMapper.findEmail(user);

				return userEmail;
			}
			// 数据同步数据
			ObjectNode datanode = JsonNodeFactory.instance.objectNode();
			datanode.put("username", user.getUserId());
			datanode.put("password", user.getPassword());
		} catch (Exception e) {

			e.printStackTrace();

		}
		return null;

	}*/

	
/*	*//**
	 * 登录
	 *//*
	@Override
	public boolean userLogin(String email, String password) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		String checkLogin = checkLogin(user);
		Map<String, Object> map=new HashMap<>();
		map.put("email", email);
		map.put("password", MD5.sign(password));
		int checkEmailPasdsword = userMapper.checkEmailPasdsword(map);
		if (checkLogin.equals("true")) {
			if (checkEmailPasdsword > 0) {

				// 根据id查询用户信息，将用户信息返回给Controller
				queryUserEmail(email);

				return true;
			} else {
				return false;

			}
		}
		return false;

	}*/



	



}
