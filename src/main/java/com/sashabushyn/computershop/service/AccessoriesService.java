package com.sashabushyn.computershop.service;

import com.sashabushyn.computershop.model.entity.Accessories.*;

import java.util.List;

public interface AccessoriesService {

    List<Accessories> getAllAccessories();
    // Ram
    Ram createRam(Ram ram);

    List<Ram> getAllRam();

    Ram getByIdRam(Long id);

    Ram updateRam(Ram ram);

    void deleteRam(Long id);

    // Graphic
    Graphic createGraphic(Graphic graphic);

    List<Graphic> getAllGraphics();

    Graphic getGraphicById(Long id);

    Graphic updateGraphic(Graphic graphic);

    // Storage
    Storage createStorage(Storage storage);

    List<Storage> getAllStorages();

    Storage getByIdStorage(Long id);

    Storage updateStorage(Storage storage);

    void deleteStorage(Long id);

    // Processor
    Processor createProcessor(Processor processor);

    List<Processor> getAllProcessors();

    Processor getByIdProcessor(Long id);

    Processor updateProcessor(Processor processor);

    void deleteProcessor(Long id);

}
