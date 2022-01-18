package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.collections4.map.HashedMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@RestController
public class Helloworld implements Controller {

//    @Override
	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(req.getParameter("a"));
		int b=Integer.parseInt(req.getParameter("b"));
		Map map=new HashedMap();
		map.put("sum", "the sum value is : "+(a+b));
		ModelAndView modelAndView=new ModelAndView("success", map);
		return modelAndView;
	}

}
