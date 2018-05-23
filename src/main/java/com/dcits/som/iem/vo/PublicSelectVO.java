package com.dcits.som.iem.vo;

import java.io.Serializable;

public class PublicSelectVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String code;
	private String formName;
	private String subject;
	private String address;
	private String tableDesc;
	private String tableName;
	
	private String publicCode;
	
	
	
	public String getPublicCode() {
		return publicCode;
	}
	public void setPublicCode(String publicCode) {
		this.publicCode = publicCode;
	}
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getTableDesc() {
		return tableDesc;
	}
	public void setTableDesc(String tableDesc) {
		this.tableDesc = tableDesc;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	
	
}
