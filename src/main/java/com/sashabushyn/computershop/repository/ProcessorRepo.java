package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Accessories.Processor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessorRepo extends JpaRepository<Processor, Long> {
}
