package cn.com.winning.ssgj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.winning.ssgj.dao.SysReportInfoDao;
import cn.com.winning.ssgj.domain.SysReportInfo;
import cn.com.winning.ssgj.service.SysReportInfoService;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
@Service
public class SysReportInfoServiceImpl implements SysReportInfoService {

	@Resource
	private SysReportInfoDao sysReportInfoDao;
	

	public Integer createSysReportInfo(SysReportInfo t) {
		return this.sysReportInfoDao.insertEntity(t);
	}

	public SysReportInfo getSysReportInfo(SysReportInfo t) {
		return this.sysReportInfoDao.selectEntity(t);
	}

	public Integer getSysReportInfoCount(SysReportInfo t) {
		return (Integer) this.sysReportInfoDao.selectEntityCount(t);
	}

	public List<SysReportInfo> getSysReportInfoList(SysReportInfo t) {
		return this.sysReportInfoDao.selectEntityList(t);
	}

	public int modifySysReportInfo(SysReportInfo t) {
		return this.sysReportInfoDao.updateEntity(t);
	}

	public int removeSysReportInfo(SysReportInfo t) {
		return this.sysReportInfoDao.deleteEntity(t);
	}

	public List<SysReportInfo> getSysReportInfoPaginatedList(SysReportInfo t) {
		return this.sysReportInfoDao.selectEntityPaginatedList(t);
	}

}
