package com.dcits.som.iem.vo;

import java.io.Serializable;

import com.dcits.som.iem.entity.IemTemplateType;

public class IemTemplateTypeVO extends IemTemplateType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String parentName;
	private String parentIds;
	private String formName;
	
	
	
	
	
	
	
	
	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	
}
