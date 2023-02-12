package com.sashabushyn.computershop.controller.api;

import com.sashabushyn.computershop.controller.dto.ComputerDto;
import com.sashabushyn.computershop.controller.dto.LaptopDto;
import com.sashabushyn.computershop.model.entity.Computer;
import com.sashabushyn.computershop.model.entity.Laptop;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/devices")
public interface ComputerApi {
    @PutMapping("/computer")
    @ResponseStatus(HttpStatus.CREATED)
    Computer createComputer(@RequestBody ComputerDto computerDto);

    @GetMapping("/computer")
    @ResponseStatus(HttpStatus.OK)
    List<Computer> getAllComputers();

    @PostMapping("/computer")
    @ResponseStatus(HttpStatus.OK)
    Computer updateComputer(@RequestBody ComputerDto computerDto);

    @PutMapping("/laptop")
    @ResponseStatus(HttpStatus.CREATED)
    Laptop createLaptop(@RequestBody LaptopDto laptopDto);

    @GetMapping("/laptop")
    @ResponseStatus(HttpStatus.OK)
    List<Laptop> getAllLaptops();

    @PostMapping("/laptop")
    @ResponseStatus(HttpStatus.OK)
    Computer updateLaptop(@RequestBody LaptopDto laptopDto);

}

