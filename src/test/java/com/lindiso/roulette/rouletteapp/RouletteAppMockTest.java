package com.lindiso.roulette.rouletteapp;

import com.lindiso.roulette.rouletteapp.controller.RouletteController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@PowerMockIgnore("jdk.internal.reflect.*")
@RunWith(PowerMockRunner.class)
public class RouletteAppMockTest {

    private MockMvc mockMvc;

    @InjectMocks
    private RouletteController restController;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(restController).build();
    }

    @Test
    public void convertKelvinToCelsiusTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("/roulette/conversions/ktoc").accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.parseMediaType("application/json"))
                .param("kelvin", "10.0"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
