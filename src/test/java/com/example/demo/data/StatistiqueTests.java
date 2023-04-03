package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

public class StatistiqueTests {
    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    public void (){
        when(voitureRepository.findAll())
    }
}
