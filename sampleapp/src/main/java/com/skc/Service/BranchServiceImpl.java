package com.skc.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService{

	private static ArrayList<Map<String, String>> branchList = 
			new ArrayList<>();
	static final Map<String, String> branches = new HashMap<String, String>() {
		{
			put("branchName", "Wakad");
			put("branchCode", "23232");
		}
	};

	public ArrayList<Map<String,String>> getBranchList(){
		if(branchList==null) {
			
		}
		branchList = new ArrayList<>();
		branchList.add(branches);
		return branchList;
	}

}
