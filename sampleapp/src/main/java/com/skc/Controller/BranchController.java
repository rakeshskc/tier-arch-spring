package com.skc.Controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skc.Service.BranchService;

@RestController
@RequestMapping("api/service")

public class BranchController {

	@Autowired
	private BranchService branchService;

	@GetMapping("/branch")
	public @ResponseBody ArrayList<Map<String, String>> getBranch() {
		return branchService.getBranchList();
	}

}
