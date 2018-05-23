package com.dcits.som.iem.provider;

import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemBusinessParameterVO;

public interface IemBusinessParameterProvider {
	
	int deleteByPrimaryKey(Integer id) throws Exception;
		   
	int insertSelective(IemBusinessParameterVO record) throws Exception ;
	
	IemBusinessParameterVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemBusinessParameterVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemBusinessParameterVO> findIemBusinessParameterList(IemBusinessParameterVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemBusinessParameterVO> findIemBusinessParameterPage(IemBusinessParameterVO record, DataTableReqVO reqDt) throws Exception;

	
}
