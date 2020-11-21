package com.infoasset.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

	@RequestMapping({ "/init" })
	public String firstPage() {
		return "Init app...";
	}

}