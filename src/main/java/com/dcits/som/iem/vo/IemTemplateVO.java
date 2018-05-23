package com.dcits.som.iem.vo;

import java.io.Serializable;
import java.util.List;

import com.dcits.som.iem.entity.IemTemplate;
import com.dcits.som.serviceProducts.vo.SvcProductVO;

public class IemTemplateVO extends IemTemplate implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String templateTypeName;
	
	private List<IemEvaluateRuleVO> detailEvaluateRuleList;
	
	private List<SvcProductVO> detailProductList;
	
	private List<IemBusinessParameterVO> parameterList;
	
	private List<IemTemplateItemVO> item;
	private Integer objectPrimaryId;     // 评价对象的主键id
	private String objectPrimaryName;    // 对应名称
	private Integer productId;           // 服务产品
	
	// 满足问卷调查
	private String formId;
	private String sourceFlag;           // 判断标志
	private List<Integer> templateIdList;
	private Integer versionId;
	private Integer evaluateId;
	
	// 暂时加上， 待考虑
	private Integer objectType;        // 给那一类的做评价
	
	private IemEvaluateVO iemEvaluate;  // 回显问卷调查的显示
	
	private Integer keyId;    // 事件列表查询调查问卷
	private String formName;
	
	
	
	
	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public Integer getKeyId() {
		return keyId;
	}

	public void setKeyId(Integer keyId) {
		this.keyId = keyId;
	}

	public Integer getEvaluateId() {
		return evaluateId;
	}

	public void setEvaluateId(Integer evaluateId) {
		this.evaluateId = evaluateId;
	}

	public IemEvaluateVO getIemEvaluate() {
		return iemEvaluate;
	}

	public void setIemEvaluate(IemEvaluateVO iemEvaluate) {
		this.iemEvaluate = iemEvaluate;
	}

	public Integer getObjectType() {
		return objectType;
	}

	public void setObjectType(Integer objectType) {
		this.objectType = objectType;
	}

	public String getObjectPrimaryName() {
		return objectPrimaryName;
	}

	public void setObjectPrimaryName(String objectPrimaryName) {
		this.objectPrimaryName = objectPrimaryName;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public List<Integer> getTemplateIdList() {
		return templateIdList;
	}

	public void setTemplateIdList(List<Integer> templateIdList) {
		this.templateIdList = templateIdList;
	}

	public String getSourceFlag() {
		return sourceFlag;
	}

	public void setSourceFlag(String sourceFlag) {
		this.sourceFlag = sourceFlag;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getObjectPrimaryId() {
		return objectPrimaryId;
	}

	public void setObjectPrimaryId(Integer objectPrimaryId) {
		this.objectPrimaryId = objectPrimaryId;
	}

	public List<IemTemplateItemVO> getItem() {
		return item;
	}

	public void setItem(List<IemTemplateItemVO> item) {
		this.item = item;
	}

	public List<IemBusinessParameterVO> getParameterList() {
		return parameterList;
	}

	public void setParameterList(List<IemBusinessParameterVO> parameterList) {
		this.parameterList = parameterList;
	}

	public List<IemEvaluateRuleVO> getDetailEvaluateRuleList() {
		return detailEvaluateRuleList;
	}

	public void setDetailEvaluateRuleList(List<IemEvaluateRuleVO> detailEvaluateRuleList) {
		this.detailEvaluateRuleList = detailEvaluateRuleList;
	}

	public List<SvcProductVO> getDetailProductList() {
		return detailProductList;
	}

	public void setDetailProductList(List<SvcProductVO> detailProductList) {
		this.detailProductList = detailProductList;
	}

	public String getTemplateTypeName() {
		return templateTypeName;
	}

	public void setTemplateTypeName(String templateTypeName) {
		this.templateTypeName = templateTypeName;
	}
	
	
	
}
