package com.think;

import org.json.JSONObject;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class GetMemberNoOfOpenId extends Tool{
	public String getMemberNoOfOpenId(String openId){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId´íÎó");
		}
		j=y.getMemberNoOfOpenId(openId);
	//	if(j.length()<0){
			return this.sysout(j.equals("")?400:200, j);
	//	}
	//	return "";
	}
}
