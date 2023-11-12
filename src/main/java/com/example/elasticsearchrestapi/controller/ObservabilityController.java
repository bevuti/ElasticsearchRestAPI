package com.example.elasticsearchrestapi.controller;

import com.example.elasticsearchrestapi.entity.Observability;
import com.example.elasticsearchrestapi.service.ObservabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ObservabilityController {
    @Autowired
    private ObservabilityService observabilityService;

    @GetMapping("/findAll")
    Iterable<Observability> findAll(){
        return observabilityService.getObservability();
    }
    @GetMapping("/findById")
   public Observability findById(@org.jetbrains.annotations.NotNull @RequestBody Observability observability){
        return observabilityService.getObservabilityById(observability.getId());
    }
    @PostMapping("/insert")
    public Observability insertObservability(@RequestBody Observability observability){
        return observabilityService.insertObservability(observability);
    }
    @PutMapping("/update")
    public Observability updateObservability(@RequestBody Observability observability){
        return observabilityService.updateObservability(observability, observability.getId());
    }
    @DeleteMapping("/delete")
    public void deleteObservability(@RequestBody Observability observability){
        observabilityService.deleteObservability(observability.getId());
    }
}
