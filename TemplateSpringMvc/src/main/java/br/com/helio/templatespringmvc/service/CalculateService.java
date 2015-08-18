package br.com.helio.templatespringmvc.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Hélio
 */
@Service
public class CalculateService {

    public Integer addTwoNumbers(Integer a, Integer b) {
        return a + b;
    }
}
