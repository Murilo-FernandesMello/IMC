package br.ulbra.classes;

import java.util.Scanner;

/**
 *
 * @author Murilo Fernandes Mello inicio do projeto: 19/03/2022 - 21:49
 * fim do projeto: 20/03/2022 - 14:25
 */
public class CalculadoraIMC {

    private double peso;
    private double altura;
    private double imc;

    public CalculadoraIMC() {

    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setImc(double imc) {
        this.imc = imc;

    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public double calcularIMC() {
        imc = peso / (altura * altura);
        return imc;
    }

    public void resultadoIMC() {
        double imc = this.imc;
        if (this.imc < 18.5) {
            System.out.println("Você está abaixo do seu peso recomendado.");
        } else if (this.imc >= 18.5 && (this.imc <= 24.9)) {
            System.out.println("Você está no seu peso recomendado.");
        } else if (this.imc >= 25.0 && (this.imc <= 29.9)) {
            System.out.println("Você está acima do seu peso recomendado.");
        } else if (this.imc >= 30.0 && (this.imc <= 34.9)) {
            System.out.println("Você está classificado(a) em obesidade grau 1.");
        } else if (this.imc >= 35.0 && (this.imc <= 39.9)) {
            System.out.println("Você está classificado(a) em obesidade grau 2.");
        } else {
            System.out.println("Você está classificado(a)em obesidade grau 3.");
        }
    }

    @Override
    public String toString() {
        return "Seu peso: " + this.getPeso()
                + "\nSua altura: "
                + this.getAltura()
                + "\nSeu IMC é: "
                + this.getImc();

    }

    public static void main(String[] args) {
        CalculadoraIMC resposta = new CalculadoraIMC();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        resposta.setPeso(ler.nextDouble());
        System.out.println("Digite sua altura: ");
        resposta.setAltura(ler.nextDouble());
        resposta.calcularIMC();
      
        System.out.println(resposta.toString());
  resposta.resultadoIMC();
    }
}
