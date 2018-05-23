package com.dcits.som.iem.vo;

import java.io.Serializable;
import java.util.List;

import com.dcits.som.iem.entity.IemEvaluate;

public class IemEvaluateVO extends IemEvaluate implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String templateName;
	
	private String versionName;
	
	private String evaluateResultName;
	
	private String evaluatorName;
	
	private Integer templateTypeId;  // 记录模板类型的id
	
	// 回显 评价对象
	private String keyName;
	private Integer formId;          // 事件满意度列表
	
	private List<Integer> evaluateIds;
	
	private String evaIds;
	
	
	
	public String getEvaIds() {
		return evaIds;
	}

	public void setEvaIds(String evaIds) {
		this.evaIds = evaIds;
	}

	public Integer getFormId() {
		return formId;
	}

	public void setFormId(Integer formId) {
		this.formId = formId;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Integer getTemplateTypeId() {
		return templateTypeId;
	}

	public void setTemplateTypeId(Integer templateTypeId) {
		this.templateTypeId = templateTypeId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getEvaluateResultName() {
		return evaluateResultName;
	}

	public void setEvaluateResultName(String evaluateResultName) {
		this.evaluateResultName = evaluateResultName;
	}

	public String getEvaluatorName() {
		return evaluatorName;
	}

	public void setEvaluatorName(String evaluatorName) {
		this.evaluatorName = evaluatorName;
	}

	public List<Integer> getEvaluateIds() {
		return evaluateIds;
	}

	public void setEvaluateIds(List<Integer> evaluateIds) {
		this.evaluateIds = evaluateIds;
	}
	
	
	
}
