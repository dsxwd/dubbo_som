package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemTemplateProductVO;

public interface IemTemplateProductProvider {
	
	int deleteByPrimaryKey(Integer id) throws Exception;

	int insertSelective(IemTemplateProductVO record) throws Exception ;
	
	IemTemplateProductVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemTemplateProductVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemTemplateProductVO> findIemTemplateProductList(IemTemplateProductVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemTemplateProductVO> findIemTemplateProductPage(IemTemplateProductVO record, DataTableReqVO reqDt) throws Exception;
}
