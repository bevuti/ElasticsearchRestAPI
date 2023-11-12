package com.example.elasticsearchrestapi.service;

import com.example.elasticsearchrestapi.entity.Observability;
import com.example.elasticsearchrestapi.repo.ObservabilityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObservabilityService {

    @Autowired
    private ObservabilityRepo observabilityRepo;
    public Iterable<Observability> getObservability() {
        return observabilityRepo.findAll();
    }
    public Observability insertObservability(Observability observability) {
        return observabilityRepo.save(observability);
    }
    public Observability updateObservability(Observability observability, int id) {
        Observability observability1 = observabilityRepo.findById(id).get();
        observability1.setMaturityLevel(observability.getMaturityLevel());
        observability1.setDescription(observability.getDescription());
        return observability1;
    }
    public void deleteObservability(int id) {
        observabilityRepo.deleteById(id);
    }

    public Observability getObservabilityById(int id) {
        Observability observabilityById = observabilityRepo.findById(id).get();
        return observabilityById;
    }
}
