package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Long> {
}
