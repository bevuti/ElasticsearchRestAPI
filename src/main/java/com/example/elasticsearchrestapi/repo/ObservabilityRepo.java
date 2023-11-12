package com.example.elasticsearchrestapi.repo;

import com.example.elasticsearchrestapi.entity.Observability;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ObservabilityRepo extends ElasticsearchRepository<Observability, Integer> {
}
