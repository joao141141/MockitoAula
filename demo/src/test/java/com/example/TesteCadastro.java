package com.example;

import java.time.LocalDate;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class TesteCadastro {


    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadstrarPessoa;

    @Test
    void validarDadosDeCadastro(){
       Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(Mockito.anyString())).thenReturn(null);
       Pessoa carlos = CadastrarPessoa.cadastrarPessoa("Carlos", "123456789", LocalDate.of(1990, 1, 1), "12345678");


        assertEquals("Carlos", carlos.getNome());   
        assertEquals("123456789", carlos.getDocumento());
        assertEquals(LocalDate.of(1990, 1, 1), carlos.getNascimento());
        assertEquals(null, carlos.getEndereco());
    
    }



}
