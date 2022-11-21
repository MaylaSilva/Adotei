package br.com.ada.adotei.modelo;

import br.com.ada.adotei.modelo.Endereco;
import br.com.ada.adotei.modelo.Ong;

import java.util.Scanner;

public class CadastraOng extends Ong{

    Scanner sc = new Scanner(System.in);
    public CadastraOng (String nome, String CNPJ, Endereco endereco, Integer dataAbertura, String telefone, String email, String site) {
        super(nome, CNPJ, endereco, dataAbertura, telefone, email, site);
    }

   // public static void CadastroOng(Scanner sc, )
}

