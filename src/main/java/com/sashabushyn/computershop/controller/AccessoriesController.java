package com.sashabushyn.computershop.controller;

import com.sashabushyn.computershop.controller.api.AccessoriesApi;
import com.sashabushyn.computershop.model.entity.Accessories.*;
import com.sashabushyn.computershop.service.AccessoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccessoriesController implements AccessoriesApi {
    private final AccessoriesService accessoriesService;

    @Override
    public List<Accessories> getAllAccessories() {
        return accessoriesService.getAllAccessories();
    }

    // RAM
    @Override
    public List<Ram> getAllRam() {
        return accessoriesService.getAllRam();
    }

    @Override
    public Ram getRamById(Long id) {
        return accessoriesService.getByIdRam(id);
    }

    @Override
    public Ram createRam(Ram ram) {
        return accessoriesService.createRam(ram);
    }

    //Graphic
    @Override
    public List<Graphic> getAllGraphics() {
        return accessoriesService.getAllGraphics();
    }

    @Override
    public Graphic getGraphicById(Long id) {
        return accessoriesService.getGraphicById(id);
    }

    @Override
    public Graphic createGraphic(Graphic graphic) {
        return accessoriesService.createGraphic(graphic);
    }

    // Processor
    @Override
    public List<Processor> getAllProcessors() {
        return accessoriesService.getAllProcessors();
    }

    @Override
    public Processor findProcessorById(Long id) {
        return accessoriesService.getByIdProcessor(id);
    }

    @Override
    public Processor createProcessor(Processor processor) {
        return accessoriesService.createProcessor(processor);
    }

    // Storage
    @Override
    public List<Storage> getAllStorage() {
        return accessoriesService.getAllStorages();
    }

    @Override
    public Storage findStorageById(Long id) {
        return accessoriesService.getByIdStorage(id);
    }

    @Override
    public Storage createStorage(Storage storage) {
        return accessoriesService.createStorage(storage);
    }
}
