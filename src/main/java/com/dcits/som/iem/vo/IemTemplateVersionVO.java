package com.dcits.som.iem.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.dcits.som.iem.entity.IemTemplateVersion;

public class IemTemplateVersionVO extends IemTemplateVersion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String v_id;
	
	private String templateName;
	
	private String flagChoice;
	
	private BigDecimal fullScore;
	
	
	
	public BigDecimal getFullScore() {
		return fullScore;
	}

	public void setFullScore(BigDecimal fullScore) {
		this.fullScore = fullScore;
	}

	public String getFlagChoice() {
		return flagChoice;
	}

	public void setFlagChoice(String flagChoice) {
		this.flagChoice = flagChoice;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	

	public String getV_id() {
		return v_id;
	}

	public void setV_id(String v_id) {
		this.v_id = v_id;
	}
	
	
}
