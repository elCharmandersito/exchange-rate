package com.ppsoto.divisaexchange.controller;

import com.ppsoto.divisaexchange.service.ExchangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/exchange")
@CrossOrigin
public class ExchangeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExchangeController.class);

    @Autowired
    private ExchangeService exchangeService;

    @GetMapping(value = "/{countryCode}", produces = "application/json")
    public ResponseEntity<String> getExchangeForCountry(
            @PathVariable(name = "countryCode") String countryCode
    ) {
        LOGGER.info("Getting exhcange for : ", countryCode);

        String response = exchangeService.getExchangeForCountry(countryCode);

        return ResponseEntity.ok(response);
    }
}
