package com.kratos;

public class ItBean {

	private KratosBean kratosBean;

	public void setKratosBean(KratosBean kratosBean) {
		this.kratosBean = kratosBean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}
}
