package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId) {
        Random generator = new Random();
        return new BigDecimal(generator.nextInt(100000 / 100));
    }
}
