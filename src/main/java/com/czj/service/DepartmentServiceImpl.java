package com.czj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czj.bean.Department;
import com.czj.bean.Message;
import com.czj.dao.DepartmentMapper;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
    private DepartmentMapper departmentMapper;
	
	@Override
	public Message getAllDepts() {
		List<Department> departments=departmentMapper.selectByExample(null);
		return Message.success().add("depts",departments);
	}
}
