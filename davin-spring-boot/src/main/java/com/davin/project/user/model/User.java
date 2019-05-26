package com.davin.project.user.model;

import java.sql.Date;

public class User {
	private Integer id;
	private String name;
	private String loginName;
	private int status;
	private Date createTime;
	private Date modifyTime;
	private Date expireTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", loginName=" + loginName + ", status=" + status
				+ ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", expireTime=" + expireTime + "]";
	}
}
