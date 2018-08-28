package hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hw.model.Test;
import hw.service.TestService;

@Controller
public class TestController {
	private TestService testService;
	
	
	@Autowired
	public TestController(TestService testService) {
		this.testService = testService;
	}



	@RequestMapping(method=RequestMethod.GET,value="/test/test")
	public String test(Model model){
		List<Test> test=testService.finAll();
		System.out.println("测试");
		for(Test t:test){
			System.out.println("有："+t.getId());
		}
		model.addAttribute("test", test);
		return"test";
	}	
}
