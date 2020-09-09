package io.wellcare.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.wellcare.model.Dependent;
import io.wellcare.model.Enrollee;
import io.wellcare.repository.DependentRepository;
//import io.wellcare.repository.EnrolleeRepository;
import io.wellcare.repository.EnrolleeRepository;



@Service
@Transactional
public class EnrolleeService {
	
	@Autowired
	public EnrolleeRepository enrollRepository;
	@Autowired
	public DependentRepository depRepository;
	
	
	
	public List<Enrollee> getEnrolless() {
		List<Enrollee> enrollees = enrollRepository.findAll();
		return enrollees;
		
	}
	
	public void addOrmodifyEnrollee(Enrollee enrollee) {	
		enrollRepository.save(enrollee);
	}

	public void modifyEnrollee(Enrollee enrollee) {

	}

	public void removeEnrollee(Enrollee enrollee) {

	}

	public void addDependentEnrollee(Enrollee enrollee) {

	}

	public void removeDependentEnrollee(Enrollee enrollee) {

	}

	public void modifyDependentEnrollee(Enrollee enrollee) {

	}



}
