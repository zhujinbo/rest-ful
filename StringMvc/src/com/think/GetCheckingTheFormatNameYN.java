package com.think;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class GetCheckingTheFormatNameYN extends Tool{
	public String getCheckingTheFormatNameYN(String openId){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId错误");
		}
		i=y.getCheckingTheFormatNameYN(openId);
		switch (i){
			case 0: getCheckingTheFormatNameYN="合法";
				break;
			case 1: getCheckingTheFormatNameYN="非法";
				break;
			case 2: getCheckingTheFormatNameYN="未注册";
				break;
		}
		return this.sysout(i==-1?400:200,getCheckingTheFormatNameYN);
	}
}
