package com.think;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class GetCheckingTheFormatNameYN extends Tool{
	public String getCheckingTheFormatNameYN(String openId){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId����");
		}
		i=y.getCheckingTheFormatNameYN(openId);
		switch (i){
			case 0: getCheckingTheFormatNameYN="�Ϸ�";
				break;
			case 1: getCheckingTheFormatNameYN="�Ƿ�";
				break;
			case 2: getCheckingTheFormatNameYN="δע��";
				break;
		}
		return this.sysout(i==-1?400:200,getCheckingTheFormatNameYN);
	}
}
