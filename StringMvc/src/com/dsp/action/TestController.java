package com.dsp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.think.main.Main;


@Scope("prototype")//单列模式
@Controller
@RequestMapping("/products")
public class TestController {
	@RequestMapping(value="/GetCheckingTheFormatNameYN/{openId}",method=RequestMethod.GET)
    public String getCheckingTheFormatNameYN(@PathVariable String openId, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.getCheckingTheFormatNameYN(openId);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/GetCreditOfOpenId/{openId}",method=RequestMethod.GET)
    public String getCreditOfOpenId(@PathVariable String openId, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.getCreditOfOpenId(openId);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/GetMemberAge/{openId}",method=RequestMethod.GET)
    public String getMemberAge(@PathVariable String openId, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.getMemberAge(openId);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/GetMemberForState/{openId}",method=RequestMethod.GET)
    public String getMemberForState(@PathVariable String openId, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.getMemberForState(openId);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/GetMemberName/{openId}",method=RequestMethod.GET)
    public String getMemberName(@PathVariable String openId, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.getMemberName(openId);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/GetMemberNoOfOpenId/{openId}",method=RequestMethod.GET)
    public String getMemberNoOfOpenId(@PathVariable String openId, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.getMemberNoOfOpenId(openId);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/Statistics/{openId}/{time}/{menuName}",method=RequestMethod.POST)
    public String statistics(@PathVariable String openId,@PathVariable String time,@PathVariable String menuName, HttpServletRequest request,HttpServletResponse response) throws Exception {
    
		Main main=new Main();
		String res=main.statistics(openId, time, menuName);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/AddCreditOfOpenId/{openId}/{newCreit}",method=RequestMethod.POST)
    public String addCreditOfOpenId(@PathVariable String openId,@PathVariable int newCreit, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.addCreditOfOpenId(openId, newCreit);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/AddMember/{openId}/{name}/{phone}/{age}/{check}",method=RequestMethod.POST)
    public String addMember(@PathVariable String openId,@PathVariable String name, @PathVariable String phone, @PathVariable String age, @PathVariable String check, 
    		HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.addMember(openId, name, phone, age, check);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/DelCreditOfOpenId/{openId}/{newCreit}",method=RequestMethod.DELETE)
    public String delCreditOfOpenId(@PathVariable String openId,@PathVariable int newCreit, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.delCreditOfOpenId(openId, newCreit);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
	
	@RequestMapping(value="/UpdateCreditOfopenId/{openId}/{newCreit}",method=RequestMethod.PUT)
    public String updateCreditOfopenId(@PathVariable String openId,@PathVariable int newCreit, HttpServletRequest request,HttpServletResponse response) throws Exception {
   
		Main main=new Main();
		String res=main.updateCreditOfopenId(openId, newCreit);
		System.out.println(res);
        request.setAttribute("name", res);
        return "../list";
    }
}
