package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemEvaluateDetailVO;

public interface IemEvaluateDetailProvider {

	int deleteByPrimaryKey(Integer id) throws Exception;
	   
	int insertSelective(IemEvaluateDetailVO record) throws Exception ;
	
	IemEvaluateDetailVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemEvaluateDetailVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemEvaluateDetailVO> findIemEvaluateDetailList(IemEvaluateDetailVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemEvaluateDetailVO> findIemEvaluateDetailPage(IemEvaluateDetailVO record, DataTableReqVO reqDt) throws Exception;

}
