package com.dcits.som.iem.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ItemObject implements Serializable {
	
	private static final long serialVersionUID = 3606368996540084560L;
	
	private List<IemTemplateItemVO> item;
	
	private Integer id;
	private Integer templateId;
	private Integer versionId;
	
	private Integer createUser;
    private Date createDate;
    private Integer modifyUser;
    private Date modifyDate;
	
    private String flag;   // 标记判断！
    private Integer sizeNum;
    
    private String test;
    private BigDecimal fullScore;
    
    
	public BigDecimal getFullScore() {
		return fullScore;
	}

	public void setFullScore(BigDecimal fullScore) {
		this.fullScore = fullScore;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Integer getSizeNum() {
		return sizeNum;
	}

	public void setSizeNum(Integer sizeNum) {
		this.sizeNum = sizeNum;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(Integer modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public List<IemTemplateItemVO> getItem() {
		return item;
	}

	public void setItem(List<IemTemplateItemVO> item) {
		this.item = item;
	}
	
	
}
