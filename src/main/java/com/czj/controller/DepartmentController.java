package com.czj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czj.bean.Message;
import com.czj.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;

	/**
	 * 查询所有部门
	 * @return depts
	 */
	@GetMapping(value = "/depts")
	@ResponseBody
	public Message getAllDepts() {
		return Message.success().add("depts", departmentService.getAllDepts());
	}
}
