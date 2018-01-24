package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.EtInterfaceInfo;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface EtInterfaceInfoService {

	Integer createEtInterfaceInfo(EtInterfaceInfo t);

	int modifyEtInterfaceInfo(EtInterfaceInfo t);

	int removeEtInterfaceInfo(EtInterfaceInfo t);

	EtInterfaceInfo getEtInterfaceInfo(EtInterfaceInfo t);

	List<EtInterfaceInfo> getEtInterfaceInfoList(EtInterfaceInfo t);

	Integer getEtInterfaceInfoCount(EtInterfaceInfo t);

	List<EtInterfaceInfo> getEtInterfaceInfoPaginatedList(EtInterfaceInfo t);

}