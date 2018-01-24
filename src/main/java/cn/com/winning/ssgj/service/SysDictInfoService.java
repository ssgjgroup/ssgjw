package cn.com.winning.ssgj.service;

import java.util.List;

import cn.com.winning.ssgj.domain.SysDictInfo;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
public interface SysDictInfoService {

	Integer createSysDictInfo(SysDictInfo t);

	int modifySysDictInfo(SysDictInfo t);

	int removeSysDictInfo(SysDictInfo t);

	SysDictInfo getSysDictInfo(SysDictInfo t);

	List<SysDictInfo> getSysDictInfoList(SysDictInfo t);

	Integer getSysDictInfoCount(SysDictInfo t);

	List<SysDictInfo> getSysDictInfoPaginatedList(SysDictInfo t);

}