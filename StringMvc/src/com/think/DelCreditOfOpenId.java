package com.think;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class DelCreditOfOpenId extends Tool{
	public String delCreditOfOpenId(String openId, int newCreit){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId����");
		}
		if(!this.chacknewCreit(newCreit)){
			return this.sysout(400, "newCreit����");
		}
		return y.delCreditOfOpenId(openId, newCreit)>0?"�����ɹ�":"����ʧ��";
	}
}
