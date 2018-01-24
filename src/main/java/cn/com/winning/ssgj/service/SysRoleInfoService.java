package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.SysRoleInfo;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface SysRoleInfoService {

	Integer createSysRoleInfo(SysRoleInfo t);

	int modifySysRoleInfo(SysRoleInfo t);

	int removeSysRoleInfo(SysRoleInfo t);

	SysRoleInfo getSysRoleInfo(SysRoleInfo t);

	List<SysRoleInfo> getSysRoleInfoList(SysRoleInfo t);

	Integer getSysRoleInfoCount(SysRoleInfo t);

	List<SysRoleInfo> getSysRoleInfoPaginatedList(SysRoleInfo t);

}