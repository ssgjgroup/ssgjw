package cn.com.winning.ssgj.domain;

import java.io.Serializable;
import org.apache.ibatis.type.Alias;
import cn.com.winning.ssgj.domain.BaseDomain;

/**
 * Coder AutoGenerator generate.
 *
 * @author Coder AutoGenerator
 * @date 2018-01-18 10:11:46
 */
 
@Alias("sysModule")
public class SysModule extends BaseDomain implements Serializable {

	private static final long serialVersionUID = -1L;

	private Long modId;
	
	private Long parId;
	
	private String modName;
	
	private String modDesc;
	
	private Integer modLevel;
	
	private String modUrl;
	
	private String iconPath;
	
	private Integer isLeaf;
	
	private Integer isManager;
	
	private Integer orderValue;
	
	private Integer isDel;
	
	public SysModule() {

	}

	public Long getModId() {
		return modId;
	}
	
	public void setModId(Long modId) {
		this.modId = modId;
	}
	
	public Long getParId() {
		return parId;
	}
	
	public void setParId(Long parId) {
		this.parId = parId;
	}
	
	public String getModName() {
		return modName;
	}
	
	public void setModName(String modName) {
		this.modName = modName;
	}
	
	public String getModDesc() {
		return modDesc;
	}
	
	public void setModDesc(String modDesc) {
		this.modDesc = modDesc;
	}
	
	public Integer getModLevel() {
		return modLevel;
	}
	
	public void setModLevel(Integer modLevel) {
		this.modLevel = modLevel;
	}
	
	public String getModUrl() {
		return modUrl;
	}
	
	public void setModUrl(String modUrl) {
		this.modUrl = modUrl;
	}
	
	public String getIconPath() {
		return iconPath;
	}
	
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
	
	public Integer getIsLeaf() {
		return isLeaf;
	}
	
	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}
	
	public Integer getIsManager() {
		return isManager;
	}
	
	public void setIsManager(Integer isManager) {
		this.isManager = isManager;
	}
	
	public Integer getOrderValue() {
		return orderValue;
	}
	
	public void setOrderValue(Integer orderValue) {
		this.orderValue = orderValue;
	}
	
	public Integer getIsDel() {
		return isDel;
	}
	
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	
}