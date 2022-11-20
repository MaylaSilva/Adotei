package br.com.ada.adotei.modelo;

import java.util.List;

public class ImprimeCadastro <T>{
    public void imprimeCadastro(List<T> t){
        for (T obj: t) {
            System.out.println(t);
        }
    }
}
