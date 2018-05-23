package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemTemplateVO;


public interface IemTemplateProvider {
	
	int deleteByPrimaryKey(Integer id) throws Exception;

	int insertSelective(IemTemplateVO record) throws Exception ;
	
	IemTemplateVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemTemplateVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemTemplateVO> findIemTemplateList(IemTemplateVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemTemplateVO> findIemTemplatePage(IemTemplateVO record, DataTableReqVO reqDt) throws Exception;

}
