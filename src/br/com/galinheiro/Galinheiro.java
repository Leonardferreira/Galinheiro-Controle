package br.com.galinheiro;

import java.time.LocalDateTime;

public class Galinheiro implements Gerenciavel {
    private String nome;
    private int qtdGalinhas;
    private int ovosPorDiaPorGalinha;
    private LocalDateTime dataHoraCriacao;

    // Construtor
    public Galinheiro(String nome, int qtdGalinhas, int ovosPorDiaPorGalinha) {
        this.nome = nome;
        setQtdGalinhas(qtdGalinhas);
        setOvosPorDiaPorGalinha(ovosPorDiaPorGalinha);
        this.dataHoraCriacao = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdGalinhas() {
        return qtdGalinhas;
    }

    public void setQtdGalinhas(int qtdGalinhas) {
        if (qtdGalinhas < 0) {
            throw new IllegalArgumentException("Por favor não digite valores negativos!");
        }
        this.qtdGalinhas = qtdGalinhas;
    }

    public int getOvosPorDiaPorGalinha() {
        return ovosPorDiaPorGalinha;
    }

    public void setOvosPorDiaPorGalinha(int ovosPorDiaPorGalinha) {
        if (ovosPorDiaPorGalinha < 0) {
            throw new IllegalArgumentException("Por favor não digite valores negativos!");
        }
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    @Override
    public int calcularProducaoMensal() {
        return this.calcularProducaoDiaria() * 30;
    }

    @Override
    public int calcularProducaoDiaria() {
        return this.qtdGalinhas * this.ovosPorDiaPorGalinha;
    }

    public void mostrarInfo() {
        System.out.println("===============================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade de Galinhas " + this.qtdGalinhas);
        System.out.println("Quantidade de Ovos por Dia " + this.ovosPorDiaPorGalinha);
        System.out.println("Data e Hora da Criação " + this.dataHoraCriacao);
        System.out.println("Produção Diária de Ovos " + this.calcularProducaoDiaria() + " Ovos.");
        System.out.println("Produção Mensal de Ovos " + this.calcularProducaoMensal() + " Ovos.");
        System.out.println("===============================");
    }


}
