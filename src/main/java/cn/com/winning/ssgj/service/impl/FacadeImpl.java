package cn.com.winning.ssgj.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.com.winning.ssgj.service.Facade;

import cn.com.winning.ssgj.service.EtCustomerDetailService;
import cn.com.winning.ssgj.service.EtDataCheckService;
import cn.com.winning.ssgj.service.EtDevEnvHardwareService;
import cn.com.winning.ssgj.service.EtEasyDataCheckService;
import cn.com.winning.ssgj.service.EtEasyDataCheckDetailService;
import cn.com.winning.ssgj.service.EtFloorQuestionInfoService;
import cn.com.winning.ssgj.service.EtFlowSurveyService;
import cn.com.winning.ssgj.service.EtInterfaceInfoService;
import cn.com.winning.ssgj.service.EtOnlineFileService;
import cn.com.winning.ssgj.service.EtOnlineUserService;
import cn.com.winning.ssgj.service.EtProcessManagerService;
import cn.com.winning.ssgj.service.EtReportService;
import cn.com.winning.ssgj.service.EtSimulateRecordService;
import cn.com.winning.ssgj.service.EtSiteInstallService;
import cn.com.winning.ssgj.service.EtSiteInstallDetailService;
import cn.com.winning.ssgj.service.EtSiteQuestionInfoService;
import cn.com.winning.ssgj.service.EtSoftHardwareService;
import cn.com.winning.ssgj.service.EtThirdIntterfaceService;
import cn.com.winning.ssgj.service.EtTrainViedoListService;
import cn.com.winning.ssgj.service.EtTrainViedoRecordService;
import cn.com.winning.ssgj.service.EtUserInfoService;
import cn.com.winning.ssgj.service.PmisContractInfoService;
import cn.com.winning.ssgj.service.PmisContractProductInfoService;
import cn.com.winning.ssgj.service.PmisCustomerInformationService;
import cn.com.winning.ssgj.service.PmisProductInfoService;
import cn.com.winning.ssgj.service.PmisProductLineInfoService;
import cn.com.winning.ssgj.service.PmisProjctUserService;
import cn.com.winning.ssgj.service.PmisProjectBasicInfoService;
import cn.com.winning.ssgj.service.SysDataInfoService;
import cn.com.winning.ssgj.service.SysDataPopedomService;
import cn.com.winning.ssgj.service.SysDictInfoService;
import cn.com.winning.ssgj.service.SysFlowAnswerService;
import cn.com.winning.ssgj.service.SysFlowInfoService;
import cn.com.winning.ssgj.service.SysFlowQuestionService;
import cn.com.winning.ssgj.service.SysFunService;
import cn.com.winning.ssgj.service.SysLogService;
import cn.com.winning.ssgj.service.SysModFunService;
import cn.com.winning.ssgj.service.SysModPopedomService;
import cn.com.winning.ssgj.service.SysModuleService;
import cn.com.winning.ssgj.service.SysOrganizationService;
import cn.com.winning.ssgj.service.SysParamsService;
import cn.com.winning.ssgj.service.SysProductDataInfoService;
import cn.com.winning.ssgj.service.SysProductFlowInfoService;
import cn.com.winning.ssgj.service.SysProductInterfaceInfoService;
import cn.com.winning.ssgj.service.SysProductPaperInfoService;
import cn.com.winning.ssgj.service.SysProductShInfoService;
import cn.com.winning.ssgj.service.SysReportInfoService;
import cn.com.winning.ssgj.service.SysRoleInfoService;
import cn.com.winning.ssgj.service.SysRoleUserService;
import cn.com.winning.ssgj.service.SysSoftHardwareInfoService;
import cn.com.winning.ssgj.service.SysThirdInterfaceInfoService;
import cn.com.winning.ssgj.service.SysUserInfoService;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:48
 */
@Component("facade")
public class FacadeImpl implements Facade {

	@Resource

	EtCustomerDetailService etCustomerDetailService;
	
	@Resource
	EtDataCheckService etDataCheckService;
	
	@Resource
	EtDevEnvHardwareService etDevEnvHardwareService;
	
	@Resource
	EtEasyDataCheckService etEasyDataCheckService;
	
	@Resource
	EtEasyDataCheckDetailService etEasyDataCheckDetailService;
	
	@Resource
	EtFloorQuestionInfoService etFloorQuestionInfoService;
	
	@Resource
	EtFlowSurveyService etFlowSurveyService;
	
	@Resource
	EtInterfaceInfoService etInterfaceInfoService;
	
	@Resource
	EtOnlineFileService etOnlineFileService;
	
	@Resource
	EtOnlineUserService etOnlineUserService;
	
	@Resource
	EtProcessManagerService etProcessManagerService;
	
	@Resource
	EtReportService etReportService;
	
	@Resource
	EtSimulateRecordService etSimulateRecordService;
	
	@Resource
	EtSiteInstallService etSiteInstallService;
	
	@Resource
	EtSiteInstallDetailService etSiteInstallDetailService;
	
	@Resource
	EtSiteQuestionInfoService etSiteQuestionInfoService;
	
	@Resource
	EtSoftHardwareService etSoftHardwareService;
	
	@Resource
	EtThirdIntterfaceService etThirdIntterfaceService;
	
	@Resource
	EtTrainViedoListService etTrainViedoListService;
	
	@Resource
	EtTrainViedoRecordService etTrainViedoRecordService;
	
	@Resource
	EtUserInfoService etUserInfoService;
	
	@Resource
	PmisContractInfoService pmisContractInfoService;
	
	@Resource
	PmisContractProductInfoService pmisContractProductInfoService;
	
	@Resource
	PmisCustomerInformationService pmisCustomerInformationService;
	
	@Resource
	PmisProductInfoService pmisProductInfoService;
	
	@Resource
	PmisProductLineInfoService pmisProductLineInfoService;
	
	@Resource
	PmisProjctUserService pmisProjctUserService;
	
	@Resource
	PmisProjectBasicInfoService pmisProjectBasicInfoService;
	
	@Resource
	SysDataInfoService sysDataInfoService;
	
	@Resource
	SysDataPopedomService sysDataPopedomService;
	
	@Resource
	SysDictInfoService sysDictInfoService;
	
	@Resource
	SysFlowAnswerService sysFlowAnswerService;
	
	@Resource
	SysFlowInfoService sysFlowInfoService;
	
	@Resource
	SysFlowQuestionService sysFlowQuestionService;
	
	@Resource
	SysFunService sysFunService;
	
	@Resource
	SysLogService sysLogService;
	
	@Resource
	SysModFunService sysModFunService;
	
	@Resource
	SysModPopedomService sysModPopedomService;
	
	@Resource
	SysModuleService sysModuleService;
	
	@Resource
	SysOrganizationService sysOrganizationService;
	
	@Resource
	SysParamsService sysParamsService;
	
	@Resource
	SysProductDataInfoService sysProductDataInfoService;
	
	@Resource
	SysProductFlowInfoService sysProductFlowInfoService;
	
	@Resource
	SysProductInterfaceInfoService sysProductInterfaceInfoService;
	
	@Resource
	SysProductPaperInfoService sysProductPaperInfoService;
	
	@Resource
	SysProductShInfoService sysProductShInfoService;
	
	@Resource
	SysReportInfoService sysReportInfoService;
	
	@Resource
	SysRoleInfoService sysRoleInfoService;
	
	@Resource
	SysRoleUserService sysRoleUserService;
	
	@Resource
	SysSoftHardwareInfoService sysSoftHardwareInfoService;
	
	@Resource
	SysThirdInterfaceInfoService sysThirdInterfaceInfoService;
	
	@Resource
	SysUserInfoService sysUserInfoService;
	
	public EtCustomerDetailService getEtCustomerDetailService() {
		return etCustomerDetailService;
	}
	
	public EtDataCheckService getEtDataCheckService() {
		return etDataCheckService;
	}
	
	public EtDevEnvHardwareService getEtDevEnvHardwareService() {
		return etDevEnvHardwareService;
	}
	
	public EtEasyDataCheckService getEtEasyDataCheckService() {
		return etEasyDataCheckService;
	}
	
	public EtEasyDataCheckDetailService getEtEasyDataCheckDetailService() {
		return etEasyDataCheckDetailService;
	}
	
	public EtFloorQuestionInfoService getEtFloorQuestionInfoService() {
		return etFloorQuestionInfoService;
	}
	
	public EtFlowSurveyService getEtFlowSurveyService() {
		return etFlowSurveyService;
	}
	
	public EtInterfaceInfoService getEtInterfaceInfoService() {
		return etInterfaceInfoService;
	}
	
	public EtOnlineFileService getEtOnlineFileService() {
		return etOnlineFileService;
	}
	
	public EtOnlineUserService getEtOnlineUserService() {
		return etOnlineUserService;
	}
	
	public EtProcessManagerService getEtProcessManagerService() {
		return etProcessManagerService;
	}
	
	public EtReportService getEtReportService() {
		return etReportService;
	}
	
	public EtSimulateRecordService getEtSimulateRecordService() {
		return etSimulateRecordService;
	}
	
	public EtSiteInstallService getEtSiteInstallService() {
		return etSiteInstallService;
	}
	
	public EtSiteInstallDetailService getEtSiteInstallDetailService() {
		return etSiteInstallDetailService;
	}
	
	public EtSiteQuestionInfoService getEtSiteQuestionInfoService() {
		return etSiteQuestionInfoService;
	}
	
	public EtSoftHardwareService getEtSoftHardwareService() {
		return etSoftHardwareService;
	}
	
	public EtThirdIntterfaceService getEtThirdIntterfaceService() {
		return etThirdIntterfaceService;
	}
	
	public EtTrainViedoListService getEtTrainViedoListService() {
		return etTrainViedoListService;
	}
	
	public EtTrainViedoRecordService getEtTrainViedoRecordService() {
		return etTrainViedoRecordService;
	}
	
	public EtUserInfoService getEtUserInfoService() {
		return etUserInfoService;
	}
	
	public PmisContractInfoService getPmisContractInfoService() {
		return pmisContractInfoService;
	}
	
	public PmisContractProductInfoService getPmisContractProductInfoService() {
		return pmisContractProductInfoService;
	}
	
	public PmisCustomerInformationService getPmisCustomerInformationService() {
		return pmisCustomerInformationService;
	}
	
	public PmisProductInfoService getPmisProductInfoService() {
		return pmisProductInfoService;
	}
	
	public PmisProductLineInfoService getPmisProductLineInfoService() {
		return pmisProductLineInfoService;
	}
	
	public PmisProjctUserService getPmisProjctUserService() {
		return pmisProjctUserService;
	}
	
	public PmisProjectBasicInfoService getPmisProjectBasicInfoService() {
		return pmisProjectBasicInfoService;
	}
	
	public SysDataInfoService getSysDataInfoService() {
		return sysDataInfoService;
	}
	
	public SysDataPopedomService getSysDataPopedomService() {
		return sysDataPopedomService;
	}
	
	public SysDictInfoService getSysDictInfoService() {
		return sysDictInfoService;
	}
	
	public SysFlowAnswerService getSysFlowAnswerService() {
		return sysFlowAnswerService;
	}
	
	public SysFlowInfoService getSysFlowInfoService() {
		return sysFlowInfoService;
	}
	
	public SysFlowQuestionService getSysFlowQuestionService() {
		return sysFlowQuestionService;
	}
	
	public SysFunService getSysFunService() {
		return sysFunService;
	}
	
	public SysLogService getSysLogService() {
		return sysLogService;
	}
	
	public SysModFunService getSysModFunService() {
		return sysModFunService;
	}
	
	public SysModPopedomService getSysModPopedomService() {
		return sysModPopedomService;
	}
	
	public SysModuleService getSysModuleService() {
		return sysModuleService;
	}
	
	public SysOrganizationService getSysOrganizationService() {
		return sysOrganizationService;
	}
	
	public SysParamsService getSysParamsService() {
		return sysParamsService;
	}
	
	public SysProductDataInfoService getSysProductDataInfoService() {
		return sysProductDataInfoService;
	}
	
	public SysProductFlowInfoService getSysProductFlowInfoService() {
		return sysProductFlowInfoService;
	}
	
	public SysProductInterfaceInfoService getSysProductInterfaceInfoService() {
		return sysProductInterfaceInfoService;
	}
	
	public SysProductPaperInfoService getSysProductPaperInfoService() {
		return sysProductPaperInfoService;
	}
	
	public SysProductShInfoService getSysProductShInfoService() {
		return sysProductShInfoService;
	}
	
	public SysReportInfoService getSysReportInfoService() {
		return sysReportInfoService;
	}
	
	public SysRoleInfoService getSysRoleInfoService() {
		return sysRoleInfoService;
	}
	
	public SysRoleUserService getSysRoleUserService() {
		return sysRoleUserService;
	}
	
	public SysSoftHardwareInfoService getSysSoftHardwareInfoService() {
		return sysSoftHardwareInfoService;
	}
	
	public SysThirdInterfaceInfoService getSysThirdInterfaceInfoService() {
		return sysThirdInterfaceInfoService;
	}
	
	public SysUserInfoService getSysUserInfoService() {
		return sysUserInfoService;
	}
	
}
