package com.gxr.com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gxr.com.entity.User;



public interface UserMapper {
	int deleteByPrimaryKey(User userId);

	int insert(User record);

	/**
	 * 注册用户信息
	 * @Title: insertSelective
	 * @Description:
	 * @param  @param record
	 * @param  @return
	 * @return int
	 * @date 2016年4月11日 上午10:01:13
	 * @throws
	 */
	int insertSelective(User record);

	User selectByPrimaryKey(Integer userId);

	/**
	 * 
	 * @Title: updateByPrimaryKeySelective
	 * @Description:修改用户信息
	 * @param  @param record
	 * @param  @return
	 * @return int
	 * @date 2016年4月15日 上午11:21:53
	 * @throws
	 */

	int updateByPrimaryKeySelective(User record);

	/**
	 * 
	 * @Title: udapteState
	 * @Description:修改用户状态
	 * @param  @param map
	 * @param  @return
	 * @return int
	 * @date 2016年5月21日 下午1:31:18
	 * @throws
	 */
	int udapteState(Map<String, Integer> map);

	int updateByPrimaryKey(User record);

	/**
	 * 
	 * @Title: findUserByemail
	 * @Description: 邮箱验证
	 * @param  @param email
	 * @param  @return
	 * @return int
	 * @date 2016年4月11日 下午4:47:18
	 * @throws
	 */
	int findUserByemail(String email);

	/**
	 * 查找用户，根据邮件和密码
	 * @param email
	 * @param password
	 * @return
	 */
	User findByEmailPassword(@Param("email") String email, @Param("password") String password);

	List<User> selectByPhone(String phone);

	/**
	 * 
	 * @Title: findUserByNickname
	 * @Description:昵称验证
	 * @param  @param nickname
	 * @param  @return
	 * @return int
	 * @date 2016年4月11日 下午4:52:53
	 * @throws
	 */

	int findUserByNickname(String nickname);

	/**
	 * 
	 * @Title: findUserByPassword
	 * @Description: 密码校验
	 * @param  @param password
	 * @param  @return
	 * @return int
	 * @date 2016年4月12日 上午11:22:01
	 * @throws
	 */

	int findUserByPassword(String password);

	/**
	 * 
	 * @Title: findUserByNickname2
	 * @Description:根据昵称查询用户信息
	 * @param  @param nickname
	 * @param  @return
	 * @return User
	 * @date 2016年4月15日 上午10:51:45
	 * @throws
	 */
	User findUserByNickname2(String nickname);

	/**
	 * 
	 * @Title: findEmailByUpdatePassword
	 * @Description: 根据邮箱修改密码
	 * @param  @param record
	 * @param  @return
	 * @return int
	 * @date 2016年4月19日 上午10:26:24
	 * @throws
	 */
	int updatePassword(User record);

	/**
	 * 
	 * @Title: findEmail
	 * @Description:根据邮箱查用询信息
	 * @param  @param Email
	 * @param  @return
	 * @return User
	 * @date 2016年4月23日 下午12:48:14
	 * @throws
	 */
	User findEmail(User email);

	/**
	 * 
	 * @Title: findUserEmail
	 * @Description:根据邮箱查询用户信息
	 * @param  @param user
	 * @param  @return
	 * @return User
	 * @date 2016年5月21日 下午12:58:55
	 * @throws
	 */
	User findUserEmail(String email);

	/**
	 * 
	 * @Title: findUserByid
	 * @Description: 根据userid查询用户信息
	 * @param  @param userid
	 * @param  @return
	 * @return User
	 * @date 2016年4月26日 下午3:41:46
	 * @throws
	 */
	User findUserById(String userid);

	List<User> findAllUserExcept(String except);

	/**
	 * 根据用户id查询用户角色
	 * @param userId
	 * @return
	 */
	String selectUserRoleByUserId(Integer userId);


	/**
	 * 
	 * @Title: findUserIdByzoneId
	 * @Description:根据userId查询时区
	 * @param  @param userId
	 * @param  @return
	 * @return int
	 * @date 2016年6月4日 下午1:04:16
	 * @throws
	 */
	Map<String, Object> findUserIdByzoneId(Integer userId);

	/**
	 * 
	 * @Title: checkEmailPasdsword
	 * @Description:校验邮箱密码
	 * @param  @param map
	 * @param  @return
	 * @return int
	 * @date 2016年6月22日 下午6:20:11
	 * @throws
	 */
	int checkEmailPasdsword(Map<String, Object> map);

	/**
	 * 
	 * @Title: updatePassword
	 * @Description:修改密码
	 * @param  @param map
	 * @param  @return
	 * @return int
	 * @date 2016年6月24日 下午5:34:26
	 * @throws
	 */
	int updatePassword(Map<String, Object> map);

	/**
	 * 根据用户名查询用户列表
	 * @param map
	 * @return
	 */
	List<User> findUserByFullname(Map<String, Object> map);

	/**
	 * 查询教师信息
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> searchTeacher(Map<String, Object> map);

	/**
	 * 根据用户名查询用户列表数量
	 * @param map
	 * @return
	 */
	int findUserByFullnameCount(Map<String, Object> map);

	/**
	 * 查询教师信息数量
	 * @param map
	 * @return
	 */
	int searchTeacherCount(Map<String, Object> map);

	/**
	 * 
	 * @Description:统计用户
	 * @param map
	 * @return
	 * Integer
	 * @author: gxrong
	 * @date:2016年11月16日 下午1:48:02
	 */
	Integer findUserCount(Map<String, Object> map);

	List<User> queryUsUser(Map<String, Object> map);

}