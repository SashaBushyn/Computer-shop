package com.sashabushyn.computershop.service;

import com.sashabushyn.computershop.controller.dto.ComputerDto;
import com.sashabushyn.computershop.controller.dto.LaptopDto;
import com.sashabushyn.computershop.model.entity.Computer;
import com.sashabushyn.computershop.model.entity.Laptop;

import java.util.List;

public interface DeviceService {
    List<Computer> getAllDevices();

    Computer createComputer(ComputerDto computerDto);

    Computer updateComputer(ComputerDto computerDto);

    List<Laptop> getAllLaptops();

    Laptop createLaptop(LaptopDto laptopDto);

    Laptop updateLaptop(LaptopDto laptopDto);

}
