package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContoller {
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String Myname) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("name",Myname);
		mv.setViewName("home");
		return mv;
	}
}
