package com.example.elasticsearchrestapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "indextest")
public class Observability {
    private int id;

    private String maturityLevel;

    private String description;

}
