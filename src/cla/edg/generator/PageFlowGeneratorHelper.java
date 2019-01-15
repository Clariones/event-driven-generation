package cla.edg.generator;

import java.util.ArrayList;
import java.util.List;

import cla.edg.pageflow.Branch;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.Request;

public class PageFlowGeneratorHelper {
	public boolean isRequestHasBranch(Request req) {
		if (req.getBranches() == null || req.getBranches().size() <= 1) {
			return false;
		}
		return true;
	}
	public Branch getDefaultBranch(Request req) {
		if (req.getBranches().size() == 1) {
			return req.getBranches().get(0);
		}
		for(Branch bch : req.getBranches()) {
			if (bch.getName().equals("by default")) {
				return bch;
			}
		}
		return req.getBranches().get(0);
	}
	public List<Branch> getAllOtherBranches(Request req){
		if (req.getBranches().size() == 1) {
			System.out.printf("request [%s] has only one branch\n", req.getName());
			return new ArrayList<>();
		}
		boolean foundDefault = false;
		List<Branch> result = new ArrayList<>();
		for(Branch bch : req.getBranches()) {
			if (bch.getName().equals("by default")) {
				foundDefault = true;
				continue;
			}
			result.add(bch);
		}
		if (foundDefault) {
			System.out.printf("request [%s] has %d branch(es) besides default\n", req.getName(), result.size());
			return result;
		}
		System.out.printf("request [%s] has %d branch(es), will return %d\n", req.getName(), result.size(), result.size()-1);
		result.remove(0);
		return result;
	}
	public List<String> getAllBrachNames(PageFlowScript script){
		List<String> result = new ArrayList<>();
		result.add("by default");
		for(Request req : script.getRequests()) {
//			System.out.println("check request " + req.getName());
			for(Branch bch : req.getBranches()) {
				if (result.contains(bch.getName())) {
					continue;
				}
				result.add(bch.getName());
			}
		}
		return result;
	}
}
