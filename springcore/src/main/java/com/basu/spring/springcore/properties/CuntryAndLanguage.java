package com.basu.spring.springcore.properties;

import java.util.Properties;

public class CuntryAndLanguage {
	private Properties cuntryAndLangs;

	public Properties getCuntryAndLangs() {
		return cuntryAndLangs;
	}

	public void setCuntryAndLangs(Properties cuntryAndLangs) {
		this.cuntryAndLangs = cuntryAndLangs;
	}

	@Override
	public String toString() {
		return "CuntryAndLanguage [cuntryAndLangs=" + cuntryAndLangs + "]";
	}

}
