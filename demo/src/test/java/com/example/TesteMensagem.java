package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

public class TesteMensagem {


    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);


        Mensagem mensagem = new Mensagem("Hello World!");

        enviarMensagem.adicionarMensagem(mensagem);

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);
    }
}
