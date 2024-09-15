package ProjetoControleDeGastos;

import java.util.ArrayList;

public class Gastos {
    ArrayList<Gastos> gastos = new ArrayList<>();
    private double valor, salario;
    private String tipo;


    public Gastos() {

    }

    public Gastos(double valor, double salario, String tipo) {
        this.valor = valor;
        this.salario = salario;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Gastos> getGastos() {
        return gastos;
    }
}
