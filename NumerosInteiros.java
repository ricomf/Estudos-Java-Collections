package main.java.list.OperacoesBasicas;

public class NumerosInteiros {
   private int numero;

public NumerosInteiros(int numero) {
    this.numero = numero;
}

public int getnumero() {
    return numero;
}

public void setnumero(int numero) {
    this.numero = numero;
}

@Override
public String toString() {
    return "NumerosInteiros [numero=" + numero + "]";
} 

   
}
