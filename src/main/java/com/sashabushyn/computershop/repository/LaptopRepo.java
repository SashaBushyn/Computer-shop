package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Long> {

}
