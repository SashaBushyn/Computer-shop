package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComputerRepo extends JpaRepository<Computer, Long> {

}
