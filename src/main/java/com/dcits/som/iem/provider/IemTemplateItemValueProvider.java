package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemTemplateItemValueVO;

public interface IemTemplateItemValueProvider {
	
	int deleteByPrimaryKey(Integer id) throws Exception;
	   
	int insertSelective(IemTemplateItemValueVO record) throws Exception ;
	
	IemTemplateItemValueVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemTemplateItemValueVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemTemplateItemValueVO> findIemTemplateItemValueList(IemTemplateItemValueVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemTemplateItemValueVO> findIemTemplateItemValuePage(IemTemplateItemValueVO record, DataTableReqVO reqDt) throws Exception;

}
