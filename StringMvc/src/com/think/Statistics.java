package com.think;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class Statistics extends Tool{
	public String statistics(String openId, String time, String menuName){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId����");
		}
		if(!this.checkTime(time)){
			return this.sysout(400, "time����");
		}
		if(!this.checkMenuName(menuName)){
			return this.sysout(400, "menuName����");
		}
		y.statistics(openId, time, menuName);
		return "��ӳɹ�";
	}
}
