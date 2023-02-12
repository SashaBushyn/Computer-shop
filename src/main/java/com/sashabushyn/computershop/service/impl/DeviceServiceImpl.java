package com.sashabushyn.computershop.service.impl;

import com.sashabushyn.computershop.controller.dto.ComputerDto;
import com.sashabushyn.computershop.controller.dto.LaptopDto;
import com.sashabushyn.computershop.model.Exceptions.AccessoriesException;
import com.sashabushyn.computershop.model.Exceptions.DeviceException;
import com.sashabushyn.computershop.model.entity.Accessories.Graphic;
import com.sashabushyn.computershop.model.entity.Accessories.Processor;
import com.sashabushyn.computershop.model.entity.Accessories.Ram;
import com.sashabushyn.computershop.model.entity.Accessories.Storage;
import com.sashabushyn.computershop.model.entity.Brand;
import com.sashabushyn.computershop.model.entity.Computer;
import com.sashabushyn.computershop.model.entity.Laptop;
import com.sashabushyn.computershop.repository.*;
import com.sashabushyn.computershop.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {
    private final ComputerRepo computerRepo;
    private final GraphicRepo graphicRepo;
    private final ProcessorRepo processorRepo;
    private final RamRepo ramRepo;
    private final StorageRepo storageRepo;
    private final LaptopRepo laptopRepo;
    private final BrandRepo brandRepo;

    @Override
    public List<Computer> getAllDevices() {
        return computerRepo.findAll();
    }

    @Override
    public Computer createComputer(ComputerDto computerDto) {
        Computer computer = ComputerDtoToComputer(computerDto);
        return computerRepo.save(computer);
    }

    @Override
    public Computer updateComputer(ComputerDto computerDto) {
        Computer computer = computerRepo.findById(computerDto.getId())
                .orElseThrow(()->new DeviceException("computer with id:" + computerDto.getId() + "doesn` t exist"));
        computer.setPrice(computerDto.getPrice());
        computer.setItemQuantity(computerDto.getItem_quantity());
        return  computerRepo.save(computer);
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    @Override
    public Laptop createLaptop(LaptopDto laptopDto) {
        Laptop laptop = laptopDtoToLaptop(laptopDto);
        return computerRepo.save(laptop);
    }

    @Override
    public Laptop updateLaptop(LaptopDto laptopDto) {
        Laptop laptop = laptopRepo.findById(laptopDto.getId())
                .orElseThrow(()->new DeviceException("laptop with id:" + laptopDto.getId() + "doesn` t exist"));
        laptop.setPrice(laptopDto.getPrice());
        laptop.setItemQuantity(laptopDto.getItem_quantity());
        return  laptopRepo.save(laptop);
    }

    private Laptop laptopDtoToLaptop(LaptopDto laptopDto){
        Graphic graphic = graphicRepo.findById(laptopDto.getGraphic_id())
                .orElseThrow(() -> new AccessoriesException("graphic  with  id: " + laptopDto.getGraphic_id() + "doesn`t exist"));
        Processor processor = processorRepo.findById(laptopDto.getProcessor_id())
                .orElseThrow(() -> new AccessoriesException("processor with  id: " + laptopDto.getProcessor_id() + "doesn`t exist"));
        Ram ram = ramRepo.findById(laptopDto.getRam_id())
                .orElseThrow(() -> new AccessoriesException("ram with  id: " + laptopDto.getProcessor_id() + "doesn`t exist"));
        Storage storage = storageRepo.findById(laptopDto.getStorage_id())
                .orElseThrow(() -> new AccessoriesException("storage with  id: " + laptopDto.getStorage_id() + "doesn`t exist"));
        Brand brand = brandRepo.findById(laptopDto.getBrand_id())
                .orElseThrow(() -> new AccessoriesException("brand with  id: " + laptopDto.getBrand_id() + "doesn`t exist"));
        Laptop laptop = Laptop.laptopBuilder()
                .brand(brand)
                .diagonal(laptopDto.getDiagonal())
                .matrixType(laptopDto.getMatrixType())
                .description(laptopDto.getDescription())
                .graphic(graphic)
                .processor(processor)
                .ram(ram)
                .name(laptopDto.getName())
                .price(laptopDto.getPrice())
                .storage(storage)
                .itemQuantity(laptopDto.getItem_quantity())
                .build();
        return laptop;
    }
    private Computer ComputerDtoToComputer(ComputerDto computerDto){
        Graphic graphic = graphicRepo.findById(computerDto.getGraphic_id())
                .orElseThrow(() -> new AccessoriesException("graphic  with  id: " + computerDto.getGraphic_id() + "doesn`t exist"));
        Processor processor = processorRepo.findById(computerDto.getProcessor_id())
                .orElseThrow(() -> new AccessoriesException("processor with  id: " + computerDto.getProcessor_id() + "doesn`t exist"));
        Ram ram = ramRepo.findById(computerDto.getRam_id())
                .orElseThrow(() -> new AccessoriesException("ram with  id: " + computerDto.getProcessor_id() + "doesn`t exist"));
        Storage storage = storageRepo.findById(computerDto.getStorage_id())
                .orElseThrow(() -> new AccessoriesException("storage with  id: " + computerDto.getStorage_id() + "doesn`t exist"));
        Computer computer = Computer.builder()
                .description(computerDto.getDescription())
                .graphic(graphic)
                .processor(processor)
                .ram(ram)
                .name(computerDto.getName())
                .price(computerDto.getPrice())
                .storage(storage)
                .itemQuantity(computerDto.getItem_quantity())
                .build();
        return computer;
    }
}
