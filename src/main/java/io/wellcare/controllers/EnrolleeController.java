package io.wellcare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wellcare.model.Enrollee;
import io.wellcare.service.EnrolleeService;

import java.util.List;

@RestController
@RequestMapping("/Enrollee")
public class EnrolleeController {
	@Autowired
	EnrolleeService enrolleeService;
	
	@RequestMapping("/all")
	public List<Enrollee> retrieveAllEnrolles() {
		return enrolleeService.getEnrolless();
	}
	
	@PostMapping("/enrollee")
	public void add(@RequestBody Enrollee enrollee) {
		enrolleeService.addOrmodifyEnrollee(enrollee);
	}
	
}
