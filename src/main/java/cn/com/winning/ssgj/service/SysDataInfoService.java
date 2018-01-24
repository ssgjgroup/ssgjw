package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.SysDataInfo;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface SysDataInfoService {

	Integer createSysDataInfo(SysDataInfo t);

	int modifySysDataInfo(SysDataInfo t);

	int removeSysDataInfo(SysDataInfo t);

	SysDataInfo getSysDataInfo(SysDataInfo t);

	List<SysDataInfo> getSysDataInfoList(SysDataInfo t);

	Integer getSysDataInfoCount(SysDataInfo t);

	List<SysDataInfo> getSysDataInfoPaginatedList(SysDataInfo t);

}