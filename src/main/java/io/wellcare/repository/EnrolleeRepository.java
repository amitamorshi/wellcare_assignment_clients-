package io.wellcare.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.wellcare.model.Enrollee;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
@Transactional
public interface EnrolleeRepository extends JpaRepository<Enrollee, Long> {

}

