package com.qq.component.test;

import java.io.IOException;
import java.util.Properties;

import com.qq.cloud.taf.support.log.Logger;

public class HelloConst {

	private static final Logger LOGGER = Logger.getLogger("Const");
	
	private static void LoadConfig() {
		// 假设这里TestServer.conf为property格式文件
		final Properties ConfigProp = new Properties();
		try {
			ConfigProp.load(HelloConst.class.getClassLoader().getResourceAsStream("service.conf"));
		}
		catch (IOException e) {
			LOGGER.error("Invalid config file.", e);
			return;
		}

		// TODO:具体解析逻辑

	}
}
