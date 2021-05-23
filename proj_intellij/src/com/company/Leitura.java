package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Leitura {

    public static void main(String[] args) {
        String linhas[] = new String[1000];
        int numLinhas = 0;
        int numPaginas = 1;

        Path path_java = Paths.get("C:\\Users\\ramir\\Documents\\GitHub\\PUCRS\\2021-1\\ALEST\\AlestTrab1\\Arquivos Auxiliares\\Livros\\java.txt");// java.txt
        Path path_alice = Paths.get("C:\\Users\\ramir\\Documents\\GitHub\\PUCRS\\2021-1\\ALEST\\AlestTrab1\\Arquivos Auxiliares\\Livros\\alice.txt");// alice.txt
        Path path_cocoaandchocolate = Paths.get("C:\\Users\\ramir\\Documents\\GitHub\\PUCRS\\2021-1\\ALEST\\AlestTrab1\\Arquivos Auxiliares\\Livros\\cocoaandchocolate.txt");// cocoaandchocolate.txt
        Path path_fiveweeksinaballoon = Paths.get("C:\\Users\\ramir\\Documents\\GitHub\\PUCRS\\2021-1\\ALEST\\AlestTrab1\\Arquivos Auxiliares\\Livros\\fiveweeksinaballoon.txt");// fiveweeksinaballoon.txt

        try (BufferedReader reader = Files.newBufferedReader(path_java, Charset.defaultCharset())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                linhas[numLinhas] = line;
                numLinhas++;
                if (numLinhas % 40 == 0) {
                    numPaginas++;
                }
            }
        } catch (IOException e) {
            System.err.format("Erro na leitura do arquivo: ", e);
        }

        int n = 0;
        for (int i = 1; i <= numPaginas; i++) {
            System.out.println("--------------------- Pagina " + i + " ---------------------");
            for (int j = 0; j < 40 && n < numLinhas; j++, n++) {
                System.out.println(linhas[n]);
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nPalavras da linha " + i + ": ");
            linhas[i-1] = linhas[i-1].replaceAll("\\t"," "); // substitui tab por espaco em branco
            linhas[i-1] = linhas[i-1].replaceAll(",",""); // para remover vírgulas
            String[] tokens = linhas[i-1].split(" "); // divide a string pelo espaco em branco
            for (String s : tokens) {
                s = s.toLowerCase();
                System.out.println("->" + s);
            }
        }
    }
}
