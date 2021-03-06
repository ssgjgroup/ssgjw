package cn.com.winning.ssgj.base.aspect;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.com.winning.ssgj.base.annoation.ILog;
import cn.com.winning.ssgj.base.Constants;

@Aspect
@Component
public class LogAspect {

	/*
	 * @Resource private LogService logService;
	 */

	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

	// Controller层切点，这里如果需要配置多个切入点用“||”
	@Pointcut("execution(* cn.com.winning.ssgj.*.web.*.login(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.save*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.add*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.insert*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.del*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.remove*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.new*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.edit*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.update*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.query*(..))"
			+ "||execution(* cn.com.winning.ssgj.*.web.*.exists*(..))")
	public void controllerAspect() {
	}

	/**
	 * 前置通知 用于拦截Controller层记录用户的操作
	 * 
	 * @param joinPoint
	 *            切点
	 */
	//@Before("controllerAspect()")
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("==========执行controller前置通知===============");
		if (logger.isInfoEnabled()) {
			logger.info("before " + joinPoint);
		}
	}

	// 配置controller环绕通知,使用在方法aspect()上注册的切入点
	//@Around("controllerAspect()")
	public void around(JoinPoint joinPoint) {
		System.out.println("==========开始执行controller环绕通知===============");
		long start = System.currentTimeMillis();
		try {
			((ProceedingJoinPoint) joinPoint).proceed();
			long end = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms!");
			}
			System.out.println("==========结束执行controller环绕通知===============");
		} catch (Throwable e) {
			long end = System.currentTimeMillis();
			if (logger.isInfoEnabled()) {
				logger.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms with exception : "
						+ e.getMessage());
			}
		}
	}

	/**
	 * 后置通知 用于拦截Controller层记录用户的操作
	 * @param joinPoint 切点
	 */
	@After("controllerAspect()")
	public void after(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		// 请求的IP
		String ip = request.getRemoteAddr();
		try {
			String targetName = joinPoint.getTarget().getClass().getName();
			String methodName = joinPoint.getSignature().getName();
			Object[] arguments = joinPoint.getArgs();
			Class targetClass = Class.forName(targetName);
			Method[] methods = targetClass.getMethods();
			String operationType = "";
			String operationName = "";
			for (Method method : methods) {
				if (method.getName().equals(methodName)) {
					Class[] clazzs = method.getParameterTypes();
					if (clazzs.length == arguments.length) {
						operationType = method.getAnnotation(ILog.class).operationType();
						operationName = method.getAnnotation(ILog.class).operationName();
						break;
					}
				}
			}
			// *========控制台输出=========*//
			System.out.println("=====controller后置通知开始=====");
			System.out.println("请求方法:"
					+ (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()")
					+ "." + operationType);
			System.out.println("方法描述:" + operationName);
			System.out.println("请求人:"  /*+operator*/);
			System.out.println("请求IP:" + ip);
			// *========数据库日志=========*//
			/*Log log = new Log();
			log.setDescription(operationName);
			log.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()")
					+ "." + operationType);
			log.setLogtype("INFO");
			log.setRequestip(ip);
			log.setExceptioncode(null);
			log.setExceptiondetail(null);
			log.setParams(null);*/
			// 保存数据库
			//logService.save(log);
			System.out.println("=====controller后置通知结束=====");
		} catch (Exception e) {
			// 记录本地异常日志
			logger.error("==后置通知异常==");
			logger.error("异常信息:{}", e.getMessage());
		}
	}

	// 配置后置返回通知,使用在方法aspect()上注册的切入点
	//@AfterReturning("controllerAspect()")
	public void afterReturn(JoinPoint joinPoint) {
		System.out.println("=====执行controller后置返回通知=====");
		if (logger.isInfoEnabled()) {
			logger.info("afterReturn " + joinPoint);
		}
	}

	/**
	 * 异常通知 用于拦截记录异常日志
	 * 
	 * @param joinPoint
	 * @param e
	 */
	//@AfterThrowing(pointcut = "controllerAspect()", throwing = "e")
	public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		HttpSession session = request.getSession();
		// 读取session中的用户
		String userType = (String) session.getAttribute(Constants.USER_TYPE);
		/*Teacher teacher = null;
		JwStudentInfo student = null;
		if ("1".equals(userType)) {
			teacher = (Teacher) session.getAttribute(Constants.LOGINUSER);
		} else if ("2".equals(userType)) {
			student = (JwStudentInfo) session.getAttribute(Constants.LOGINUSER);
		}*/
		// 请求的IP
		String ip = request.getRemoteAddr();
		// 获取用户请求方法的参数并序列化为JSON格式字符串

		String params = "";
		if (joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
			for (int i = 0; i < joinPoint.getArgs().length; i++) {
				// params += JsonUtil.getJsonStr(joinPoint.getArgs()[i]) + ";";
			}
		}
		try {

			String targetName = joinPoint.getTarget().getClass().getName();
			String methodName = joinPoint.getSignature().getName();
			Object[] arguments = joinPoint.getArgs();
			Class targetClass = Class.forName(targetName);
			Method[] methods = targetClass.getMethods();
			String operationType = "";
			String operationName = "";
			/*String operator = teacher != null ? teacher.getTeacherName()
					: (student != null ? student.getStudentName()
							: (String) session.getAttribute(Constants.SUPERADMIN));*/
			for (Method method : methods) {
				if (method.getName().equals(methodName)) {
					Class[] clazzs = method.getParameterTypes();
					if (clazzs.length == arguments.length) {
						operationType = method.getAnnotation(ILog.class).operationType();
						operationName = method.getAnnotation(ILog.class).operationName();
						break;
					}
				}
			}
			/* ========控制台输出========= */
			System.out.println("=====异常通知开始=====");
			System.out.println("异常代码:" + e.getClass().getName());
			System.out.println("异常信息:" + e.getMessage());
			System.out.println("异常方法:"
					+ (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()")
					+ "." + operationType);
			System.out.println("方法描述:" + operationName);
			System.out.println("请求人:" /*+ operator*/);
			System.out.println("请求IP:" + ip);
			System.out.println("请求参数:" + params);
			/* ==========数据库日志========= */
			/*Log log = new Log();
			log.setDescription(operationName);
			log.setExceptioncode(e.getClass().getName());
			log.setLogtype("ERROR");
			log.setExceptiondetail(e.getMessage());
			log.setMethod(
					(joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
			log.setParams(params);
			log.setRequestip(ip);*/
			// 保存数据库
//			logService.save(log);
			System.out.println("=====异常通知结束=====");
		} catch (Exception ex) {
			// 记录本地异常日志
			logger.error("==异常通知异常==");
			logger.error("异常信息:{}", ex.getMessage());
		}
		/* ==========记录本地异常日志========== */
		logger.error("异常方法:{}异常代码:{}异常信息:{}参数:{}",
				new Object[] { joinPoint.getTarget().getClass().getName() + joinPoint.getSignature().getName(),
						e.getClass().getName(), e.getMessage(), params });
	}
}
