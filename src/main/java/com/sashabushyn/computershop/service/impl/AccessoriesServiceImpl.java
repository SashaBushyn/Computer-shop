package com.sashabushyn.computershop.service.impl;

import com.sashabushyn.computershop.model.Exceptions.AccessoriesException;
import com.sashabushyn.computershop.model.entity.Accessories.*;
import com.sashabushyn.computershop.repository.*;
import com.sashabushyn.computershop.service.AccessoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccessoriesServiceImpl implements AccessoriesService {
    private final AccessoriesRepo accessoriesRepo;
    private final RamRepo ramRepo;
    private final GraphicRepo graphicRepo;
    private final ProcessorRepo processorRepo;
    private final StorageRepo storageRepo;

    @Override
    public List<Accessories> getAllAccessories() {
        return accessoriesRepo.findAll();
    }

    @Override
    public Ram createRam(Ram ram) {
        return ramRepo.save(ram);
    }

    @Override
    public List<Ram> getAllRam() {
        return ramRepo.findAll();
    }

    @Override
    public Ram getByIdRam(Long id) {
        Ram ram = ramRepo.findById(id)
                .orElseThrow(() -> new AccessoriesException("Ram with id " + id + " is not found"));
        return ram;
    }

    @Override
    public Ram updateRam(Ram ram) {
        return null;
    }

    @Override
    public void deleteRam(Long id) {

    }

    @Override
    public Graphic createGraphic(Graphic graphic) {
        return graphicRepo.save(graphic);
    }

    @Override
    public List<Graphic> getAllGraphics() {
        return graphicRepo.findAll();
    }

    @Override
    public Graphic getGraphicById(Long id) {
        return graphicRepo.findById(id)
                .orElseThrow(() -> new AccessoriesException("Graphic with id " + id + " is not found"));
    }

    @Override
    public Graphic updateGraphic(Graphic graphic) {
        return null;
    }

    @Override
    public Storage createStorage(Storage storage) {
        return storageRepo.save(storage);
    }

    @Override
    public List<Storage> getAllStorages() {
        return storageRepo.findAll();
    }

    @Override
    public Storage getByIdStorage(Long id) {
        return storageRepo.findById(id)
                .orElseThrow(() -> new AccessoriesException("Storage with id " + id + " is not found"));
    }

    @Override
    public Storage updateStorage(Storage storage) {
        return null;
    }

    @Override
    public void deleteStorage(Long id) {

    }

    @Override
    public Processor createProcessor(Processor processor) {
        return processorRepo.save(processor);
    }

    @Override
    public List<Processor> getAllProcessors() {
        return processorRepo.findAll();
    }

    @Override
    public Processor getByIdProcessor(Long id) {
        return processorRepo.findById(id)
                .orElseThrow(() -> new AccessoriesException("Processor with id " + id + " is not found"));
    }

    @Override
    public Processor updateProcessor(Processor processor) {
        return null;
    }

    @Override
    public void deleteProcessor(Long id) {

    }
}

