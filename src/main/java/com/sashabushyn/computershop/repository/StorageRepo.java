package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Accessories.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepo extends JpaRepository<Storage, Long> {
}
