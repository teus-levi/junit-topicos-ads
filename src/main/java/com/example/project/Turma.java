package com.example.project;
import java.util.Linkedlist;

public class Turma {
    LinkedList<Double> notas = new LinkedList<Double>();
    double media = 0;

    public void addNota(double nota) {
        notas.add(nota);
    }

    public int getQuantidadeNotas() {
        return notas.size;
    }

    public double getMediaDasNotas() {
        double soma = 0;
        for(Double nota : notas){
            soma += nota;
        }
        media = soma / notas.size;
        return media;
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        int maior = 0;
        for(Double nota : notas){
            if(nota > media) {
                maior++;
            }
        }
        return maior;
    }
}
