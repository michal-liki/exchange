package com.assignment.backend.exchange.domain;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
class ExchangeRateDocument {

  @Id
  private String name;
  private Map<String, Double> rate;
}
