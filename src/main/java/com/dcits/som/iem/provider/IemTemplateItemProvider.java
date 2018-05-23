package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemTemplateItemVO;
import com.dcits.som.iem.vo.ItemObject;

public interface IemTemplateItemProvider {

	int deleteByPrimaryKey(Integer id) throws Exception;

	int insertSelective(IemTemplateItemVO record) throws Exception ;
	
	IemTemplateItemVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemTemplateItemVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemTemplateItemVO> findIemTemplateItemList(IemTemplateItemVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemTemplateItemVO> findIemTemplateItemPage(IemTemplateItemVO record, DataTableReqVO reqDt) throws Exception;
	
	/**
	 * 保存 调查项
	 * @param itemObject
	 * @return
	 */
	int save(ItemObject itemObject)throws Exception;
	
}
