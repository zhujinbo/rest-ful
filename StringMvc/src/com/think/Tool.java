package com.think;

import org.json.JSONObject;

import com.coke.webservice.Credit;
import com.coke.webservice.CreditService;

public class Tool {
	
	CreditService x=new CreditService();
	Credit y=x.getCreditPort();
	int i=-1;//检测int返回值是否被改变
	String j="";//检测String返回值是否被改变
	String getCheckingTheFormatNameYN="";//接收值个代表什么
	
	public String sysout(int ret,String data){//ret—200 or 400，data—值
		JSONObject json=new JSONObject();
		json.put("ret", ret);
		json.put("data", data);
		return json.toString();
	}
	
	public String sysout(int ret,int data){//ret—200 or 400，data—值
		JSONObject json=new JSONObject();
		json.put("ret", ret);
		json.put("data", data);
		return json.toString();
	}
	
	public boolean checkopenId(String openId){
		return (openId.length()>0 && openId.length()<=30);
	}
	public boolean chacknewCreit(int newCreit){
		return (newCreit>0);
	}
	public boolean checkName(String name){
		return (name.length()>0 && name.length()<=50);
	}
	public boolean checkPhone(String phone){
		return (phone.length()>0 && phone.length()<=12);
	}
	public boolean checkAge(String age){
		return (age.length()>0 && age.length()<=20);
	}
	public boolean checkCheck(String check){
		return (check.length()>0 && check.length()<=20);
	}
	public boolean checkTime(String time){
		return (time.length()>0 && time.length()<=50);
	}
	public boolean checkMenuName(String menuName){
		return (menuName.length()>0 && menuName.length()<=50);
	}
}