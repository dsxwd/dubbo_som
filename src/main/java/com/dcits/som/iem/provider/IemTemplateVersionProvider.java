package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemTemplateVersionVO;


public interface IemTemplateVersionProvider {

	int deleteByPrimaryKey(Integer id) throws Exception;
	   
	int insertSelective(IemTemplateVersionVO record) throws Exception ;
	
	IemTemplateVersionVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemTemplateVersionVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemTemplateVersionVO> findIemTemplateVersionList(IemTemplateVersionVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemTemplateVersionVO> findIemTemplateVersionPage(IemTemplateVersionVO record, DataTableReqVO reqDt) throws Exception;

}
