package com.think;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;


public class AddCreditOfOpenId extends Tool{
	public String addCreditOfOpenId(String openId, int newCreit){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId´íÎó");
		}
		if(!this.chacknewCreit(newCreit)){
			return this.sysout(400, "newCreit´íÎó");
		}
		return y.addCreditOfOpenId(openId, newCreit)>0?"²Ù×÷³É¹¦":"²Ù×÷Ê§°Ü";
	}
	
}
