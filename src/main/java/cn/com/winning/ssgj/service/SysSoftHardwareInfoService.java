package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.SysSoftHardwareInfo;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface SysSoftHardwareInfoService {

	Integer createSysSoftHardwareInfo(SysSoftHardwareInfo t);

	int modifySysSoftHardwareInfo(SysSoftHardwareInfo t);

	int removeSysSoftHardwareInfo(SysSoftHardwareInfo t);

	SysSoftHardwareInfo getSysSoftHardwareInfo(SysSoftHardwareInfo t);

	List<SysSoftHardwareInfo> getSysSoftHardwareInfoList(SysSoftHardwareInfo t);

	Integer getSysSoftHardwareInfoCount(SysSoftHardwareInfo t);

	List<SysSoftHardwareInfo> getSysSoftHardwareInfoPaginatedList(SysSoftHardwareInfo t);

}