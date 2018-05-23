package com.dcits.som.iem.provider;

import java.math.BigDecimal;
import java.util.List;

import com.dcits.bscp.common.vo.DataTableReqVO;
import com.dcits.bscp.common.vo.DataTableRespVO;
import com.dcits.som.iem.vo.IemEvaluateVO;
import com.dcits.som.iem.vo.IemTemplateVO;
import com.dcits.som.iem.vo.PublicSelectVO;

public interface IemEvaluateProvider {
	
	int deleteByPrimaryKey(Integer id) throws Exception;
	   
	int insertSelective(IemEvaluateVO record) throws Exception ;
	
	IemEvaluateVO selectByPrimaryKey(Integer id) throws Exception;
	
	int updateByPrimaryKeySelective(IemEvaluateVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表  
	   * @param record
	   * @return
	   * @throws Exception
	   */
	List<IemEvaluateVO> findIemEvaluateList(IemEvaluateVO record) throws Exception;
	  
	  /**
	   * 根据实体传入条件查询列表   分页
	   * @param record
	   * @param reqDt
	   * @return
	   * @throws Exception
	   */
	DataTableRespVO<IemEvaluateVO> findIemEvaluatePage(IemEvaluateVO record, DataTableReqVO reqDt) throws Exception;

	/**
	 * 问卷调查 结果保存
	 * @param iemTemplateVO
	 * @param iemEvaluateVO
	 * @return
	 */
	int save(IemTemplateVO iemTemplateVO, IemEvaluateVO iemEvaluateVO)throws Exception;
	
	/**
	 * 
	 * @param tableName
	 * @return
	 */
	List<String> findColumsName(String tableName)throws Exception;
	
	/**
	 * 公共进行查数据
	 * @param tableName
	 * @param code
	 * @param name
	 * @param publicCode 
	 * @return
	 */
	
	List<PublicSelectVO> publicSelectList(String tableName, String code, String name, String desc, String subject,
			String address, String publicCode)throws Exception;

	/**
	 * 补充bfm_form 表的一个方法
	 * @param string
	 * @return
	 */
	BigDecimal selectFormIdByTableName(String string)throws Exception;

}
