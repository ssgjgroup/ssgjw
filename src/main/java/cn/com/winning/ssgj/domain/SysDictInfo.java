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
 
@Alias("sysDictInfo")
public class SysDictInfo extends BaseDomain implements Serializable {

	private static final long serialVersionUID = -1L;

	private String dictCode;
	
	private String dictValue;
	
	private String dictLabel;
	
	private String dictSort;
	
	public SysDictInfo() {

	}

	public String getDictCode() {
		return dictCode;
	}
	
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
	
	public String getDictValue() {
		return dictValue;
	}
	
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	
	public String getDictLabel() {
		return dictLabel;
	}
	
	public void setDictLabel(String dictLabel) {
		this.dictLabel = dictLabel;
	}
	
	public String getDictSort() {
		return dictSort;
	}
	
	public void setDictSort(String dictSort) {
		this.dictSort = dictSort;
	}
	
}