package com.example.project;

import java.util.ArrayList;

public class Turma {
    ArrayList<Double> notas = new ArrayList();

    double soma;
    double media;
    int quantMedia;

    public void addNota(double nota) {
        notas.add(nota);

        soma += nota;
        media = soma / notas.size();
    }

    public int getQuantidadeNotas() {
        return notas.size();
    }

    public double getMediaDasNotas() {
        return media;
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > media) {
                quantMedia += 1;
            }
        }
        return quantMedia;
    }
}