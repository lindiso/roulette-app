package com.lindiso.roulette.rouletteapp.controller;

import com.lindiso.roulette.rouletteapp.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("roulette")
@RestController
public class RouletteController {

     @Autowired
     private RouletteService rouletteService;

    @RequestMapping(value = "/conversions/ktoc")
    public float getConvertKelvinToCelsius(@RequestParam("kelvin") float kelvin){
        if (rouletteService != null){
            return rouletteService.convertKelvinToCelsius(kelvin);
        }
        return  new Float(0);
    }

    @RequestMapping(value = "/conversions/ctok")
    public float getConvertCelsiusToKelvin(@RequestParam("celsius") float celsius){
        if (rouletteService != null){
            return rouletteService.convertCelsiusToKelvin(celsius);
        }
        return  new Float(0);
    }

    @RequestMapping(value = "/conversions/mtok")
    public double getConvertMilesToKilometers(@RequestParam("miles") double miles){
        if (rouletteService != null){
            return rouletteService.convertMilesToKilometers(miles);
        }
        return  new Double(0);
    }

    @RequestMapping(value = "/conversions/ktom")
    public double getConvertKilometersToMiles(@RequestParam("kilometers") double kilometers){
        if (rouletteService != null){
            return rouletteService.convertKilometersToMiles(kilometers);
        }
        return  new Double(0);
    }
}
