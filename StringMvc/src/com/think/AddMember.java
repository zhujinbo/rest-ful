package com.think;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class AddMember extends Tool{
	public String addMember(String openId,String name,String phone,String age,String check){
		if(!this.checkopenId(openId)){
			return this.sysout(400, "openId´íÎó");
		}
		if(!this.checkName(name)){
			return this.sysout(400, "name´íÎó");
		}
		if(!this.checkPhone(phone)){
			return this.sysout(400, "phone´íÎó");
		}
		if(!this.checkAge(age)){
			return this.sysout(400, "age´íÎó");
		}
		if(!this.checkCheck(check)){
			return this.sysout(400, "check´íÎó");
		}
		int i=y.addMember(openId, name, phone, age, check);
		return i>0?"²Ù×÷³É¹¦":"²Ù×÷Ê§°Ü";
	}
}
