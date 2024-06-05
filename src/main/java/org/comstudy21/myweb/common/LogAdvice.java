package org.comstudy21.myweb.common;

import org.springframework.stereotype.Component;

//@Component("logAdvice")
public class LogAdvice {
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행전 동작");
	}
}
