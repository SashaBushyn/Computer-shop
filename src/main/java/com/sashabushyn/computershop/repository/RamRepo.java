package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Accessories.Ram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RamRepo extends JpaRepository<Ram, Long> {

}
