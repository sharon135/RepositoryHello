package com.gxr.com.entity;




import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户表 Entity
 * Date: 2016-04-05 14:18:06
 * @author mayanlong
 */
@Component
@XmlRootElement
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	
	/** 用户ID */
	private Integer userId;
	/** 密码 */
	private String password;
	/** 昵称 */
	private String nickname;
	/** 用户名 */
	private String firstname;
	/** 用户姓 */
	private String lastname;
	/** 用户全名 */
	private String fullName;
	/** 性别 */
	private Integer sex;
	/** 生日 */
	private Date birthday;
	/** 电话 */
	private String phone;
	/** 邮箱 */
	private String email;
	/** 国家 */
	private String country;
	/** 语言 */
	private String language;
	/** 时区 */
	private Integer zoneId;
	/** 简介 */
	private String brief;
	/** 角色 */
	private String roles;
	/** 原始图片地址 */
	private String originalUrl;
	/** 头像 */
	private String imageUrl;
	/** 邮编 */
	private String postcode;
	/** ��ַ */
	private String address;
	/** 创建时间 */
	private Date createTime;
	/** 更新时间 */
	private Date updateTime;
	/** 身份:0 学生 1 教师  2 机构管理员 */
	private Integer identity;
	/** 状态 */
	private Integer state;
	/** 来源 */
	private String comefrom;
	/** 备注 */
	private String comment;
	/** 个性化 以json保存的APP端 用户选择 */
	private String profile;
	/** hobby */
	private String hobby;
	/** lastlogin_time */
	private Date lastloginTime;
	/** ucenter中的用户id */
	private Integer ucUserId;
	public Integer getUserId(){
		return this.userId;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	public String getNickname(){
		return this.nickname;
	}
	
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	public String getFirstname(){
		return this.firstname;
	}
	
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	public String getLastname(){
		return this.lastname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	public String getFullName(){
		return this.fullName;
	}
	
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	public Integer getSex(){
		return this.sex;
	}
	
	public void setSex(Integer sex){
		this.sex = sex;
	}
	public Date getBirthday(){
		return this.birthday;
	}
	
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	public String getPhone(){
		return this.phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getCountry(){
		return this.country;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	public String getLanguage(){
		return this.language;
	}
	
	public void setLanguage(String language){
		this.language = language;
	}
	public Integer getZoneId(){
		return this.zoneId;
	}
	
	public void setZoneId(Integer zoneId){
		this.zoneId = zoneId;
	}
	public String getBrief(){
		return this.brief;
	}
	
	public void setBrief(String brief){
		this.brief = brief;
	}
	public String getRoles(){
		return this.roles;
	}
	
	public void setRoles(String roles){
		this.roles = roles;
	}
	public String getOriginalUrl(){
		return this.originalUrl;
	}
	
	public void setOriginalUrl(String originalUrl){
		this.originalUrl = originalUrl;
	}
	public String getImageUrl(){
		return this.imageUrl;
	}
	
	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}
	public String getPostcode(){
		return this.postcode;
	}
	
	public void setPostcode(String postcode){
		this.postcode = postcode;
	}
	public String getAddress(){
		return this.address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public Integer getIdentity(){
		return this.identity;
	}
	
	public void setIdentity(Integer identity){
		this.identity = identity;
	}
	public Integer getState(){
		return this.state;
	}
	
	public void setState(Integer state){
		this.state = state;
	}
	public String getComefrom(){
		return this.comefrom;
	}
	
	public void setComefrom(String comefrom){
		this.comefrom = comefrom;
	}
	public String getComment(){
		return this.comment;
	}
	
	public void setComment(String comment){
		this.comment = comment;
	}
	public String getProfile(){
		return this.profile;
	}
	
	public void setProfile(String profile){
		this.profile = profile;
	}
	public String getHobby(){
		return this.hobby;
	}
	
	public void setHobby(String hobby){
		this.hobby = hobby;
	}
	public Date getLastloginTime(){
		return this.lastloginTime;
	}
	
	public void setLastloginTime(Date lastloginTime){
		this.lastloginTime = lastloginTime;
	}
	
	
	public Integer getUcUserId() {
		return ucUserId;
	}

	public void setUcUserId(Integer ucUserId) {
		this.ucUserId = ucUserId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}



}
