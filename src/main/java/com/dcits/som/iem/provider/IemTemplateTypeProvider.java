package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemTemplateTypeVO;

public interface IemTemplateTypeProvider {

	int deleteByPrimaryKey(Integer id) throws Exception;
	   
	int insertSelective(IemTemplateTypeVO record) throws Exception ;
	
	IemTemplateTypeVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemTemplateTypeVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemTemplateTypeVO> findIemTemplateTypeList(IemTemplateTypeVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemTemplateTypeVO> findIemTemplateTypePage(IemTemplateTypeVO record, DataTableReqVO reqDt) throws Exception;
	
	/**
	 * 查询该节点的所有的父节点（不含自己）
	 * @param e
	 * @return
	 */
	String findParentString(IemTemplateTypeVO e)throws Exception;

	List<IemTemplateTypeVO> findParent(IemTemplateTypeVO e)throws Exception;
	/**
	 * 查询子类
	 * @param iemTemplateTypeVO
	 * @return
	 * @throws Exception
	 */
	List<IemTemplateTypeVO> findSons(IemTemplateTypeVO iemTemplateTypeVO)throws Exception;

}
