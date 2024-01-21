package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<NumerosInteiros> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }


    public void adicionarNumero(int numero) {
        NumerosInteiros nInteiros = new NumerosInteiros(numero);
        this.numerosInteiros.add(nInteiros);
    }

    public int calcularSoma() {
        int soma = 0;
        if(!numerosInteiros.isEmpty()) {
            for(NumerosInteiros ni : numerosInteiros) {
                soma += ni.getnumero();
            }
            
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        if(!numerosInteiros.isEmpty()) {
            for(NumerosInteiros ni : numerosInteiros) {
                int numeroAtual = ni.getnumero();
                if(numeroAtual > maiorNumero) {
                    maiorNumero = numeroAtual;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;

        if(!numerosInteiros.isEmpty()) {
            for(NumerosInteiros ni : numerosInteiros) {
                int numeroAtual = ni.getnumero();
                if(numeroAtual < menorNumero) {
                    menorNumero = numeroAtual;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        List<Integer> listaNumeroInteiros = new ArrayList<>();

        if(!numerosInteiros.isEmpty()) {
            for(NumerosInteiros ni : numerosInteiros) {
                listaNumeroInteiros.add(ni.getnumero());
            }
        }
        return listaNumeroInteiros;
    }

    public static void main(String[] args) {

        SomaNumeros sm = new SomaNumeros();

        sm.adicionarNumero(1);
        sm.adicionarNumero(5);
        sm.adicionarNumero(3);

        // Chama o método calcularSoma() e exibe o resultado
        int resultadoSoma = sm.calcularSoma();
        System.out.println("A soma dos números é: " + resultadoSoma);

        // Chama o método encontrarMaiorNumero() e exibe o resultado
        int resultadoMaiorNumero = sm.encontrarMaiorNumero();
        System.out.println("O maior número na lista é: " + resultadoMaiorNumero);

        // Chama o método encontrarMenorNumero() e exibe o resultado
        int resultadoMenorNumero = sm.encontrarMenorNumero();
        System.out.println("O menor número na lista é: " + sm.encontrarMenorNumero());

        System.out.println("Lista dos Números Inteiros: " + sm.exibirNumeros());
    }
}
