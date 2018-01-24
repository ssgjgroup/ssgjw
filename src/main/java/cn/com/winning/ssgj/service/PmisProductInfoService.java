package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.PmisProductInfo;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface PmisProductInfoService {

	Integer createPmisProductInfo(PmisProductInfo t);

	int modifyPmisProductInfo(PmisProductInfo t);

	int removePmisProductInfo(PmisProductInfo t);

	PmisProductInfo getPmisProductInfo(PmisProductInfo t);

	List<PmisProductInfo> getPmisProductInfoList(PmisProductInfo t);

	Integer getPmisProductInfoCount(PmisProductInfo t);

	List<PmisProductInfo> getPmisProductInfoPaginatedList(PmisProductInfo t);

}