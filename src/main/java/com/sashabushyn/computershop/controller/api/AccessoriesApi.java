package com.sashabushyn.computershop.controller.api;

import com.sashabushyn.computershop.model.entity.Accessories.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/accessories")
public interface AccessoriesApi {

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    List<Accessories> getAllAccessories();

    // RAM
    @GetMapping("/ram")
    @ResponseStatus(HttpStatus.OK)
    List<Ram> getAllRam();

    @GetMapping("/ram/{id}")
    @ResponseStatus(HttpStatus.OK)
    Ram getRamById(@PathVariable Long id);

    @PutMapping("/ram")
    @ResponseStatus(HttpStatus.CREATED)
    Ram createRam(@RequestBody Ram ram);

    // GRAPHIC
    @GetMapping("/graphic")
    @ResponseStatus(HttpStatus.OK)
    List<Graphic> getAllGraphics();

    @GetMapping("/graphic/{id}")
    @ResponseStatus(HttpStatus.OK)
    Graphic getGraphicById(@PathVariable Long id);

    @PutMapping("/graphic")
    @ResponseStatus(HttpStatus.CREATED)
    Graphic createGraphic(@RequestBody Graphic graphic);

    // PROCESSOR
    @GetMapping("/processor")
    @ResponseStatus(HttpStatus.OK)
    List<Processor> getAllProcessors();

    @GetMapping("/processor/{id}")
    @ResponseStatus(HttpStatus.OK)
    Processor findProcessorById(@PathVariable Long id);

    @PutMapping("/processor")
    @ResponseStatus(HttpStatus.CREATED)
    Processor createProcessor(@RequestBody Processor processor);

    // STORAGE
    @GetMapping("/storage")
    @ResponseStatus(HttpStatus.OK)
    List<Storage> getAllStorage();

    @GetMapping("/storage/{id}")
    @ResponseStatus(HttpStatus.OK)
    Storage findStorageById(@PathVariable Long id);

    @PutMapping("/storage")
    @ResponseStatus(HttpStatus.CREATED)
    Storage createStorage(@RequestBody Storage storage);


}
