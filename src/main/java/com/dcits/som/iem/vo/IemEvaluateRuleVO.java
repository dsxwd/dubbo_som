package com.dcits.som.iem.vo;

import java.io.Serializable;

import com.dcits.som.iem.entity.IemEvaluateRule;

public class IemEvaluateRuleVO extends IemEvaluateRule implements Serializable{

	private static final long serialVersionUID = 1L;

	private String v_id;

	public String getV_id() {
		return v_id;
	}

	public void setV_id(String v_id) {
		this.v_id = v_id;
	}
	
	
}
