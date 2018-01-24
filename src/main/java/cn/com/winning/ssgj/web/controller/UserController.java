package cn.com.winning.ssgj.web.controller;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.com.winning.ssgj.base.annoation.ILog;
import cn.com.winning.ssgj.base.util.RequestUtil;
import cn.com.winning.ssgj.base.Constants;
import cn.com.winning.ssgj.base.helper.SSGJHelper;
/**
 * 用户信息处理Controller
 * @author thinkpad
 * @date 2018-01-04
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {
/*
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUserService userServiceImpl;
	@Autowired
	private SSGJHelper ssgjHelper;

	*//**
	 * 添加用户
	 * @param request
	 * @param response
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 *//*
	@RequestMapping("/addUser.do")
	@ResponseBody
	@Transactional
	@ILog(operationName="添加用户",operationType="addUser")
	public Map<String, Object> addUser(HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException, NoSuchAlgorithmException, UnsupportedEncodingException {
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		logger.info("addUser or ModifyUser");
		SysUser user = new SysUser();
		BeanUtils.copyProperties(user,params);
		logger.info(user.toString());
		user.setUserId(Integer.valueOf(ssgjHelper.getUserId()+""));
		user.setLastUpdateTime(new Date());
		user.setPassword(SSGJHelper.encodePassword(user.getUserCard(), 32));
		System.out.println(user);
		//TODO 添加操作人
		userServiceImpl.addUser(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", Constants.SUCCESS);
		return map;
	}
	*//**
	 * 修改用户信息
	 * @param request
	 * @param response
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 *//*
	@RequestMapping("/updateUser.do")
	@ResponseBody
	@Transactional
	@ILog(operationName="修改用户信息",operationType="updateUser")
	public Map<String, Object> updateUser(HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		logger.info("ModifyUser");
		SysUser user = new SysUser();
		BeanUtils.copyProperties(user,params);
		user.setLastUpdateTime(new Date());
		logger.info(user.toString());
		//TODO 添加操作人
		userServiceImpl.updateUser(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", Constants.SUCCESS);
		return map;
	}

	*//**
	 * 用户信息列表
	 * @param request
	 * @param response
	 * @return
	 *//*
	@RequestMapping("/listUser.do")
	@ResponseBody
	@ILog(operationName="用户信息列表",operationType="list")
	public Map<String, Object> list(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		String sortColumn = params.get("sort").toString();
		String orderType = params.get("sortOrder").toString();
		int pageNo = Integer.valueOf(params.get("page").toString());
		int rows = Integer.valueOf(params.get("rows").toString());
		System.out.println(sortColumn+"-"+orderType+"-"+pageNo+"-"+rows);
		logger.info("listUser");
		PageInfo<SysUser> pageInfo = userServiceImpl.listUserByPageHelper(pageNo, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(pageInfo.getList().size());
		map.put("rows", pageInfo.getList());
		map.put("total", pageInfo.getTotal());
		map.put("status", Constants.SUCCESS);
		return map;
	}
	*//**
	 * 通过用户ID查询用户信息
	 * @param request
	 * @return
	 *//*
	@RequestMapping("/getUserById.do")
	@ResponseBody
	@ILog(operationName="通过用户ID查询用户信息",operationType="getUserByUserId")
	public  Map<String, Object> getUserByUserId(HttpServletRequest request){
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		int userId = Integer.valueOf(params.get("userId").toString());
		SysUser user = userServiceImpl.getSysUserByUserId(userId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", user);
		map.put("status", Constants.SUCCESS);
		return map;
	}
	*//**
	 * 通过用户ID删除用户信息
	 * @param request
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 *//*
	@RequestMapping("/deleteUserById.do")
	@ResponseBody
	@Transactional
	@ILog(operationName="通过用户ID删除用户信息",operationType="deleteUserById")
	public  Map<String, Object> deleteUserById(HttpServletRequest request) throws IllegalAccessException, InvocationTargetException{
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		SysUser user = new SysUser();
		BeanUtils.copyProperties(user,params);
		System.out.println(user);
		logger.info(user.toString());
		//TODO 添加操作人,记录历史
		userServiceImpl.deleteUser(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", Constants.SUCCESS);
		return map;
	}
	
	@RequestMapping("/validateUserCard.do")
	@ResponseBody
	@ILog(operationName="验证员工号是否存在",operationType="validateUserCard")
	public Map<String, Object> validateUserCard(HttpServletRequest request){
		Map<String, Object>  params = RequestUtil.getRequestParams(request);
		System.out.println(params);
		String userCard = params.get("userCard").toString();
		boolean valid = userServiceImpl.validateUserCardExists(userCard);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("valid", valid);
		result.put("status", Constants.SUCCESS);
		return result;
	}*//*
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUserService userServiceImpl;
	@Autowired
	private SSGJHelper ssgjHelper;

	*//**
	 * 添加用户
	 * @param request
	 * @param response
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 *//*
	@RequestMapping("/addUser.do")
	@ResponseBody
	@Transactional
	@ILog(operationName="添加用户",operationType="addUser")
	public Map<String, Object> addUser(HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException, NoSuchAlgorithmException, UnsupportedEncodingException {
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		logger.info("addUser or ModifyUser");
		SysUser user = new SysUser();
		BeanUtils.copyProperties(user,params);
		logger.info(user.toString());
		user.setUserId(Integer.valueOf(ssgjHelper.getUserId()+""));
		user.setLastUpdateTime(new Date());
		user.setPassword(SSGJHelper.encodePassword(user.getUserCard(), 32));
		System.out.println(user);
		//TODO 添加操作人
		userServiceImpl.addUser(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", Constants.SUCCESS);
		return map;
	}
	*//**
	 * 修改用户信息
	 * @param request
	 * @param response
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 *//*
	@RequestMapping("/updateUser.do")
	@ResponseBody
	@Transactional
	@ILog(operationName="修改用户信息",operationType="updateUser")
	public Map<String, Object> updateUser(HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		logger.info("ModifyUser");
		SysUser user = new SysUser();
		BeanUtils.copyProperties(user,params);
		user.setLastUpdateTime(new Date());
		logger.info(user.toString());
		//TODO 添加操作人
		userServiceImpl.updateUser(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", Constants.SUCCESS);
		return map;
	}

	*//**
	 * 用户信息列表
	 * @param request
	 * @param response
	 * @return
	 *//*
	@RequestMapping("/listUser.do")
	@ResponseBody
	@ILog(operationName="用户信息列表",operationType="list")
	public Map<String, Object> list(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		String sortColumn = params.get("sort").toString();
		String orderType = params.get("sortOrder").toString();
		int pageNo = Integer.valueOf(params.get("page").toString());
		int rows = Integer.valueOf(params.get("rows").toString());
		System.out.println(sortColumn+"-"+orderType+"-"+pageNo+"-"+rows);
		logger.info("listUser");
		PageInfo<SysUser> pageInfo = userServiceImpl.listUserByPageHelper(pageNo, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(pageInfo.getList().size());
		map.put("rows", pageInfo.getList());
		map.put("total", pageInfo.getTotal());
		map.put("status", Constants.SUCCESS);
		return map;
	}
	*//**
	 * 通过用户ID查询用户信息
	 * @param request
	 * @return
	 *//*
	@RequestMapping("/getUserById.do")
	@ResponseBody
	@ILog(operationName="通过用户ID查询用户信息",operationType="getUserByUserId")
	public  Map<String, Object> getUserByUserId(HttpServletRequest request){
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		int userId = Integer.valueOf(params.get("userId").toString());
		SysUser user = userServiceImpl.getSysUserByUserId(userId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", user);
		map.put("status", Constants.SUCCESS);
		return map;
	}
	*//**
	 * 通过用户ID删除用户信息
	 * @param request
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 *//*
	@RequestMapping("/deleteUserById.do")
	@ResponseBody
	@Transactional
	@ILog(operationName="通过用户ID删除用户信息",operationType="deleteUserById")
	public  Map<String, Object> deleteUserById(HttpServletRequest request) throws IllegalAccessException, InvocationTargetException{
		Map<String, Object> params = RequestUtil.getRequestParams(request);
		SysUser user = new SysUser();
		BeanUtils.copyProperties(user,params);
		System.out.println(user);
		logger.info(user.toString());
		//TODO 添加操作人,记录历史
		userServiceImpl.deleteUser(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", Constants.SUCCESS);
		return map;
	}

	@RequestMapping("/validateUserCard.do")
	@ResponseBody
	@ILog(operationName="验证员工号是否存在",operationType="validateUserCard")
	public Map<String, Object> validateUserCard(HttpServletRequest request){
		Map<String, Object>  params = RequestUtil.getRequestParams(request);
		System.out.println(params);
		String userCard = params.get("userCard").toString();
		boolean valid = userServiceImpl.validateUserCardExists(userCard);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("valid", valid);
		result.put("status", Constants.SUCCESS);
		return result;
	}*/
}
