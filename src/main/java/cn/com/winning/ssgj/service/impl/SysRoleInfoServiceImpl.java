package cn.com.winning.ssgj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.winning.ssgj.dao.SysRoleInfoDao;
import cn.com.winning.ssgj.domain.SysRoleInfo;
import cn.com.winning.ssgj.service.SysRoleInfoService;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
@Service
public class SysRoleInfoServiceImpl implements SysRoleInfoService {

	@Resource
	private SysRoleInfoDao sysRoleInfoDao;
	

	public Integer createSysRoleInfo(SysRoleInfo t) {
		return this.sysRoleInfoDao.insertEntity(t);
	}

	public SysRoleInfo getSysRoleInfo(SysRoleInfo t) {
		return this.sysRoleInfoDao.selectEntity(t);
	}

	public Integer getSysRoleInfoCount(SysRoleInfo t) {
		return (Integer) this.sysRoleInfoDao.selectEntityCount(t);
	}

	public List<SysRoleInfo> getSysRoleInfoList(SysRoleInfo t) {
		return this.sysRoleInfoDao.selectEntityList(t);
	}

	public int modifySysRoleInfo(SysRoleInfo t) {
		return this.sysRoleInfoDao.updateEntity(t);
	}

	public int removeSysRoleInfo(SysRoleInfo t) {
		return this.sysRoleInfoDao.deleteEntity(t);
	}

	public List<SysRoleInfo> getSysRoleInfoPaginatedList(SysRoleInfo t) {
		return this.sysRoleInfoDao.selectEntityPaginatedList(t);
	}

}
