package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository sr;
	
	@Override
	public void add(Teacher s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
