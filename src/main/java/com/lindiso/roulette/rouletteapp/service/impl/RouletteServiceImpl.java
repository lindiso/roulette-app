package com.lindiso.roulette.rouletteapp.service.impl;


import com.lindiso.roulette.rouletteapp.service.RouletteService;
import org.springframework.stereotype.Component;

@Component
public class RouletteServiceImpl implements RouletteService {

    @Override
    public float convertKelvinToCelsius(float kelvin) {
        float celsius = kelvin - 273.15F;
       return celsius;
    }
}
