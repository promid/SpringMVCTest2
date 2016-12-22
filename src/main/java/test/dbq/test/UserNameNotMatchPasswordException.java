package test.dbq.test;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.FORBIDDEN, reason="用户名和密码不匹配!") // 可以在类上注入, 也可以放在方法上, 放在方法上会在执行方法后进入错误页面, 放在类上会在初始化类时再进入错误页面
public class UserNameNotMatchPasswordException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
