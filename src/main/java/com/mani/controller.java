package com.mani;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class controller {
	@GetMapping("/get")
	public String getname() {
		return "manikandan";
	}
	@GetMapping("/getting")
	public String getMethodName() {
		return "getting";
	}
	

}
