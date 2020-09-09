package io.wellcare.repository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.wellcare.model.Dependent;


import org.springframework.data.jpa.repository.JpaRepository;


@Repository
@Transactional
public interface DependentRepository extends JpaRepository<Dependent, Long> {

}

