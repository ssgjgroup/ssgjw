package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.SysParams;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface SysParamsService {

	Integer createSysParams(SysParams t);

	int modifySysParams(SysParams t);

	int removeSysParams(SysParams t);

	SysParams getSysParams(SysParams t);

	List<SysParams> getSysParamsList(SysParams t);

	Integer getSysParamsCount(SysParams t);

	List<SysParams> getSysParamsPaginatedList(SysParams t);

}