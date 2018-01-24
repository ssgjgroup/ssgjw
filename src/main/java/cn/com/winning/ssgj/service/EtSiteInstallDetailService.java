package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.EtSiteInstallDetail;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface EtSiteInstallDetailService {

	Integer createEtSiteInstallDetail(EtSiteInstallDetail t);

	int modifyEtSiteInstallDetail(EtSiteInstallDetail t);

	int removeEtSiteInstallDetail(EtSiteInstallDetail t);

	EtSiteInstallDetail getEtSiteInstallDetail(EtSiteInstallDetail t);

	List<EtSiteInstallDetail> getEtSiteInstallDetailList(EtSiteInstallDetail t);

	Integer getEtSiteInstallDetailCount(EtSiteInstallDetail t);

	List<EtSiteInstallDetail> getEtSiteInstallDetailPaginatedList(EtSiteInstallDetail t);

}