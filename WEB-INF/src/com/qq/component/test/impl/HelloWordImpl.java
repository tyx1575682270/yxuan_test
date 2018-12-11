package com.qq.component.test.impl;

import com.qq.component.test.share.hellosvr.HelloWordServant;

public class HelloWordImpl implements HelloWordServant {

	@Override
	public String sayHello() {
		return "Hello Word";
	}

}
