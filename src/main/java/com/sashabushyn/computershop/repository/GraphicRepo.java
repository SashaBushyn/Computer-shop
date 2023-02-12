package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Accessories.Graphic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraphicRepo extends JpaRepository<Graphic, Long> {
}
