package com.ppsoto.divisaexchange.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {
    private static final Logger LOOGER = LoggerFactory.getLogger(ExchangeService.class);

    public String getExchangeForCountry(String countryCode) {
        LOOGER.info("Getting exchange for country code :", countryCode);
        return countryCode;
    }
}
