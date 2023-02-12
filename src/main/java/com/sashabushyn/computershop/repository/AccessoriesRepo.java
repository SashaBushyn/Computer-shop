package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Accessories.Accessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoriesRepo extends JpaRepository<Accessories, Long> {

}