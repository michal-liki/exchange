package com.assignment.backend.exchange.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

interface ExchangeRateRepository extends MongoRepository<ExchangeRateDocument, String> {

}
