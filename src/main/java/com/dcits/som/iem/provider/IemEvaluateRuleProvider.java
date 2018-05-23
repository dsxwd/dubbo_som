package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemEvaluateRuleVO;

public interface IemEvaluateRuleProvider { 
  
	int deleteByPrimaryKey(Integer id) throws Exception;

	int insertSelective(IemEvaluateRuleVO record) throws Exception ;
	
	IemEvaluateRuleVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemEvaluateRuleVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemEvaluateRuleVO> findIemEvaluateRuleList(IemEvaluateRuleVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemEvaluateRuleVO> findIemEvaluateRulePage(IemEvaluateRuleVO record, DataTableReqVO reqDt) throws Exception;

	
}
