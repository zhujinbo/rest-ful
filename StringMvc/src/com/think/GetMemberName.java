package com.think;

import org.json.JSONObject;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class GetMemberName extends GetCreditOfOpenId{
	 
	public String getMemberName(String openId){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId´íÎó");
		}
		j=y.getMemberName(openId);
		return this.sysout(j.equals("")?400:200,j);
	}
}
