package com.dcits.som.iem.vo;

import java.io.Serializable;

import com.dcits.som.iem.entity.IemTemplateItemValue;

public class IemTemplateItemValueVO extends IemTemplateItemValue implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String flagItemValue;

	private String sScore;
	
	
	
	public String getsScore() {
		return sScore;
	}

	public void setsScore(String sScore) {
		this.sScore = sScore;
	}

	public String getFlagItemValue() {
		return flagItemValue;
	}

	public void setFlagItemValue(String flagItemValue) {
		this.flagItemValue = flagItemValue;
	}
	
	
}
