package com.dcits.som.iem.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.dcits.som.iem.entity.IemEvaluateDetail;

public class IemEvaluateDetailVO extends IemEvaluateDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String itemCode;
	private Integer valueType;
	private BigDecimal weight;
	private String itemDesc;
	private String valueDesc;
	private BigDecimal valueWeight;
	
	
	
	public BigDecimal getValueWeight() {
		return valueWeight;
	}
	public void setValueWeight(BigDecimal valueWeight) {
		this.valueWeight = valueWeight;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getValueDesc() {
		return valueDesc;
	}
	public void setValueDesc(String valueDesc) {
		this.valueDesc = valueDesc;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Integer getValueType() {
		return valueType;
	}
	public void setValueType(Integer valueType) {
		this.valueType = valueType;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
	
}
