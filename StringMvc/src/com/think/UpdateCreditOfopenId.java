package com.think;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class UpdateCreditOfopenId extends Tool{
	public String updateCreditOfopenId(String openId,int newCreit){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId����");
		}
		if(!this.chacknewCreit(newCreit)){
			return this.sysout(400, "newCreit����");
		}
		i=y.updateCreditOfopenId(openId, newCreit);
		return this.sysout(i==-1?400:200, i);
	}
}
