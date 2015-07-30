package com.think.main;

import com.think.*;

public class Main{
	public String addCreditOfOpenId(String openId, int newCreit){//AddCreditOfOpenId
		AddCreditOfOpenId x=new AddCreditOfOpenId();
		return x.addCreditOfOpenId(openId, newCreit);
	}
	
	public String addMember(String openId, String name, String phone, String age, String check){
		AddMember x=new AddMember();
		return x.addMember(openId, name, phone, age, check);
	}
	
	public String delCreditOfOpenId(String openId, int newCreit){
		DelCreditOfOpenId x=new DelCreditOfOpenId();
		return x.delCreditOfOpenId(openId, newCreit);
	}
	
	public String getCheckingTheFormatNameYN(String openId){
		GetCheckingTheFormatNameYN x=new GetCheckingTheFormatNameYN();
		return x.getCheckingTheFormatNameYN(openId);
	}
	
	public String getCreditOfOpenId(String openId){
		GetCreditOfOpenId x=new GetCreditOfOpenId();
		return x.getCreditOfOpenId(openId);
	}
	
	public String getMemberAge(String openId){
		GetMemberAge x=new GetMemberAge();
		return x.getMemberAge(openId);
	}
	
	public String getMemberForState(String openId){
		GetMemberForState x=new GetMemberForState();
		return x.getMemberForState(openId);
	}
	
	public String getMemberName(String openId){
		GetMemberName x=new GetMemberName();
		return x.getMemberName(openId);
	}
	
	public String getMemberNoOfOpenId(String openId){
		GetMemberNoOfOpenId x=new GetMemberNoOfOpenId();
		return x.getMemberNoOfOpenId(openId);
	}
	
	public String statistics(String openId, String time, String menuName){
		Statistics x=new Statistics();
		return x.statistics(openId, time, menuName);
	}
	
	public String updateCreditOfopenId(String openId, int newCreit){
		UpdateCreditOfopenId x=new UpdateCreditOfopenId();
		return x.updateCreditOfopenId(openId, newCreit);
	}
}
