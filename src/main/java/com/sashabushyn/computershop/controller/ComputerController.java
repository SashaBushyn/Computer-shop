package com.sashabushyn.computershop.controller;

import com.sashabushyn.computershop.controller.api.ComputerApi;
import com.sashabushyn.computershop.controller.dto.ComputerDto;
import com.sashabushyn.computershop.controller.dto.LaptopDto;
import com.sashabushyn.computershop.model.entity.Computer;
import com.sashabushyn.computershop.model.entity.Laptop;
import com.sashabushyn.computershop.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ComputerController implements ComputerApi {
    private final DeviceService service;


    @Override
    public Computer createComputer(ComputerDto computerDto) {
        return service.createComputer(computerDto);
    }

    @Override
    public List<Computer> getAllComputers() {

        return service.getAllDevices();
    }

    @Override
    public Computer updateComputer(ComputerDto computerDto) {
        return service.updateComputer(computerDto);
    }

    @Override
    public Laptop createLaptop(LaptopDto laptopDto) {
        return service.createLaptop(laptopDto);
    }

    @Override
    public List<Laptop> getAllLaptops() {

        return service.getAllLaptops();
    }

    @Override
    public Computer updateLaptop(LaptopDto laptopDto) {

        return service.updateLaptop(laptopDto);
    }
}
