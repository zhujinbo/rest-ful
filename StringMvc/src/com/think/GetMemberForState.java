package com.think;

import org.json.JSONObject;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class GetMemberForState extends Tool{
	public String getMemberForState(String openId){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId����");
		}
		i=y.getMemberForState(openId);
		return this.sysout(i==-1?400:200,(i==0)?"δ����ʾע��":"�Ѱ�");
	}
}
