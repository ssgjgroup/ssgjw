package cn.com.winning.ssgj.base.helper;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.com.winning.ssgj.base.id.StepSequenceFactory;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

@Component
public class SSGJHelper {

	@Autowired
	@Qualifier("userIdService")
	private StepSequenceFactory userIdService;
	@Autowired
	@Qualifier("roleIdService")
	private StepSequenceFactory roleIdService;
	@Autowired
	@Qualifier("funcIdService")
	private StepSequenceFactory funcIdService;
	@Autowired
	@Qualifier("roleaCodeService")
	private StepSequenceFactory roleaCodeService;
	@Autowired
	@Qualifier("rolecCodeService")
	private StepSequenceFactory rolecCodeService;
	@Autowired
	@Qualifier("rolehCodeService")
	private StepSequenceFactory rolehCodeService;

	/**
	 * 获取用户ID信息
	 * @return userId
	 */
	public long getUserId() {
		return (long) userIdService.create();
	}
	/**
	 * 获取角色ID信息
	 * @return roleId
	 */
	public long getRoleId() {
		return (long) roleIdService.create();
	}
	/**
	 * 获取功能ID信息
	 * @return funcId
	 */
	public long getFuncId() {
		return (long) funcIdService.create();
	}
	/**
	 * 获取管理员角色代码
	 * @return roleCode
	 */
	public String getRoleCodeForAdmin() {
		return roleaCodeService.create().toString();
	}
	/**
	 * 获取公司角色代码
	 * @return roleCode
	 */
	public String getRoleCodeForCompany() {
		return rolecCodeService.create().toString();
	}
	/**
	 * 获取医院角色代码
	 * @return roleCode
	 */
	public String getRoleCodeForHospital() {
		return rolehCodeService.create().toString();
	}
	/**
	 * 密码加密
	 * @param password 明文密码
	 * @param length  密码长度
	 * @return MD5 加密后的密码
	 * @throws NoSuchAlgorithmException 没有上述加密的算法
	 * @throws UnsupportedEncodingException 不支持上述解码的编码集
	 */
	public static String encodePassword(String password,int length) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest messageDigest = null;
		String md5 = null ;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(password.getBytes("UTF-8"));
			md5=new BigInteger(1, messageDigest.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException caught!");
			throw e;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw e;
		}
		return fillMD5(md5, length);
		
	}
	
	 private static String fillMD5(String md5,int length){
	  return md5.length()==length?md5:fillMD5("0"+md5,length);
	}
	 
	 /** 
	     * 将文字转为汉语拼音
	     * @param chineselanguage 要转成拼音的中文
	     */
	    public  static String toLoginName(String ChineseLanguage){
	        char[] cl_chars = ChineseLanguage.trim().toCharArray();
	        String hanyupinyin = "";
	        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
	        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);// 输出拼音全部小写
	        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);// 不带声调
	        defaultFormat.setVCharType(HanyuPinyinVCharType.WITH_V) ;
	        try {
	            for (int i=0; i<cl_chars.length; i++){
	                if (String.valueOf(cl_chars[i]).matches("[\u4e00-\u9fa5]+")){// 如果字符是中文,则将中文转为汉语拼音
	                    hanyupinyin += PinyinHelper.toHanyuPinyinStringArray(cl_chars[i], defaultFormat)[0];
	                } else {// 如果字符不是中文,则不转换
	                    hanyupinyin += cl_chars[i];
	                }
	            }
	        } catch (BadHanyuPinyinOutputFormatCombination e) {
	            System.out.println("字符不能转成汉语拼音");
	        }
	        return hanyupinyin;
	    }
	    
	public static void main(String[] args) {
		try {
			System.out.println(encodePassword("123456", 32));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	
}
