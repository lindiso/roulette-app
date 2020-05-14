package com.lindiso.roulette.rouletteapp.service.impl;


import com.lindiso.roulette.rouletteapp.service.RouletteService;
import org.springframework.stereotype.Component;

@Component
public class RouletteServiceImpl implements RouletteService {

    private static double MILES_CONST_AMOUNT = 1.60934;
    private static double KILOMETERS_CONST_AMOUNT = 0.621371;

    @Override
    public float convertKelvinToCelsius(float kelvin) {
        float celsius = kelvin - 273.15F;
       return celsius;
    }
    @Override
    public float convertCelsiusToKelvin(float celsius) {
        float kelvin = celsius + 273.15F;
        return kelvin;
    }
    @Override
    public double convertMilesToKilometers(double miles) {
        double kilometers = miles * MILES_CONST_AMOUNT ;
        return kilometers;
    }
    @Override
    public double convertKilometersToMiles(double kilometers) {
        double miles = kilometers * KILOMETERS_CONST_AMOUNT ;
        return miles;
    }

}
