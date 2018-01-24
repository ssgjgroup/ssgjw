package cn.com.winning.ssgj.base;

public class Constants {

	public static final String SUCCESS = "success";
	public static final String USER_TYPE = "userType";
	public static final String USER_SEX = "sex";
	
	public class User {
		/**
		 * 用户状态  正常
		 */
		public static final String USER_STATUS_NORMAL = "0";
		/**
		 * 用户状态  注销
		 */
		public static final String USER_STATUS_CANCEL = "1";
		/**
		 * 用户状态  锁定
		 */
		public static final String USER_STATUS_LOCKED = "2";
		/**
		 * 用户性别  男 
		 */
		public static final String USER_SEX_MALE = "0";
		/**
		 * 用户性别  女
		 */
		public static final String USER_SEX_FEMALE = "1";
		/**
		 * 用户类型  公司
		 */
		public static final String USER_TYPE_COMPANY = "0";
		/**
		 * 用户类型  医院
		 */
		public static final String USER_TYPE_HOSPITAL = "1";
	}
	
	public class Role {
		/**
		 * 角色类型  管理员
		 */
		public static final String ROLE_TYPE_ADMIN = "0";
		/**
		 * 角色类型 公司
		 */
		public static final String ROLE_TYPE_COMPANY = "1";
		/**
		 * 角色类型 医院
		 */
		public static final String ROLE_TYPE_HOSPITAL = "2";
	}
}
