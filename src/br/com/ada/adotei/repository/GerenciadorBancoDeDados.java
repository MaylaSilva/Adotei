package br.com.ada.adotei.repository;

import br.com.ada.adotei.modelo.pessoa.CadastroPJ;
import br.com.ada.adotei.modelo.pessoa.Pessoa;

import java.io.*;
import java.nio.file.Path;

public class GerenciadorBancoDeDados <T> {

//    public  void writeFile(T t, String fileName) {
//        Path testePath = Path.of("src/resources/" + fileName + ".txt");
//        File arquivo = testePath.toFile();
//
//        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(arquivo)))) {
//
//
//            out.write(t.toString());
//            out.newLine();
//
//
//        } catch (
//                IOException e) {
//            System.out.println("error:" + e.getMessage());
//        }
//
//    }
//
//    public static void readFile (String path) {
//        try (BufferedReader file = new BufferedReader(new FileReader(path))) {
//            String row = file.readLine();
//            System.out.println(row);
//            while (row != null) {
//                row = file.readLine();
//                if(row != null) {
//                    System.out.println(row);
//                }
//            }
//
//
//        } catch (
//                IOException e) {
//            System.out.println("error:" + e.getMessage());
//        }
//    }
}
