🐔 Sistema de Gerenciamento de Galinheiros (Java & POO)

Este projeto foi desenvolvido como parte dos meus estudos práticos de Programação Orientada a Objetos (POO) em Java. O sistema modela um "Galinheiro", aplicando conceitos fundamentais de desenvolvimento de software limpo, segurança de dados e contratos de comportamento.

🚀 Conceitos Aplicados no Projeto

O código reflete a prática dos seguintes pilares e conceitos de POO estudados:

Encapsulamento: Todos os atributos da classe Galinheiro (nome, qtdGalinhas, ovosPorDiaPorGalinha, dataHoraCriacao) são privados (private), garantindo que o estado interno do objeto não seja alterado de forma livre ou indevida por classes externas.

Métodos Modificadores (Getters e Setters) com Validação: Os setters foram implementados com regras defensivas (condicionais if) que lançam exceções (IllegalArgumentException) caso sejam atribuídos valores negativos, protegendo o objeto contra estados inválidos.

Construtores Robustos: O construtor da classe reutiliza os métodos setters para validar os parâmetros de entrada logo no momento da instanciação (quando o operador new é executado), garantindo que nenhum objeto nasça com dados corrompidos.

Interfaces (Contratos): A interface Gerenciavel define o contrato obrigatório para os cálculos de produção diária e mensal, separando o quê deve ser feito de como é implementado.

Manipulação de Datas: Utilização da API moderna de datas do Java (java.time.LocalDateTime) para registrar automaticamente a data e hora de criação de cada galinheiro.

📂 Estrutura do Projeto

O código está organizado dentro do pacote br.com.galinheiro:

Gerenciavel.java (Interface): Define os métodos abstratos de cálculo (calcularProducaoDiaria() e calcularProducaoMensal()).

Galinheiro.java (Classe Principal): Implementa a interface Gerenciavel, gerencia os atributos privados, aplica as validações de segurança nos construtores/setters e exibe as informações formatadas (mostrarInfo()).

Main.java (Classe de Execução): Instancia os objetos a partir do modelo e simula a execução do sistema.

💻 Exemplo de Código (Galinheiro.java)

package br.com.galinheiro;

import java.time.LocalDateTime;

public class Galinheiro implements Gerenciavel {
    private String nome;
    private int qtdGalinhas;
    private int ovosPorDiaPorGalinha;
    private LocalDateTime dataHoraCriacao;

    public Galinheiro(String nome, int qtdGalinhas, int ovosPorDiaPorGalinha) {
        this.nome = nome;
        setQtdGalinhas(qtdGalinhas);
        setOvosPorDiaPorGalinha(ovosPorDiaPorGalinha);
        this.dataHoraCriacao = LocalDateTime.now();
    }

    public void setQtdGalinhas(int qtdGalinhas) {
        if (qtdGalinhas < 0) {
            throw new IllegalArgumentException("Por favor não digite valores negativos!");
        }
        this.qtdGalinhas = qtdGalinhas;
    }

    // Demais getters, setters e métodos de negócio...
}
