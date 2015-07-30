package com.think;

import org.json.JSONObject;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class GetMemberAge extends Tool{
	public String getMemberAge(String openId){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId´íÎó");
		}
		j=y.getMemberAge(openId);
		return this.sysout(j.equals("")?400:200, j);
	}
}
