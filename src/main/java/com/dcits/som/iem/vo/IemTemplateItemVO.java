package com.dcits.som.iem.vo;

import java.io.Serializable;
import java.util.List;

import com.dcits.som.iem.entity.IemTemplateItem;

public class IemTemplateItemVO extends IemTemplateItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String flagItem;
	
	private List<IemTemplateItemValueVO> itemValue;
	
	private String radioValue;     // 调查问卷时，单选放入的字段
	
	private String textArea;
    
	private List<String>  checkBoxValue; // 回显调查问卷 多选的答案
	
	
	public List<String> getCheckBoxValue() {
		return checkBoxValue;
	}
	public void setCheckBoxValue(List<String> checkBoxValue) {
		this.checkBoxValue = checkBoxValue;
	}
	public String getRadioValue() {
		return radioValue;
	}
	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
	public String getTextArea() {
		return textArea;
	}
	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}
	public String getFlagItem() {
		return flagItem;
	}
	public void setFlagItem(String flagItem) {
		this.flagItem = flagItem;
	}
	public List<IemTemplateItemValueVO> getItemValue() {
		return itemValue;
	}
	public void setItemValue(List<IemTemplateItemValueVO> itemValue) {
		this.itemValue = itemValue;
	}
	
	
	
	
	
	

	
	
	
}
