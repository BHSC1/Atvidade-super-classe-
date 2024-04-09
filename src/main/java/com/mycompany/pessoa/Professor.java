package com.mycompany.pessoa;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {
    private double salario;
    private String titulo;
    
    public Professor (){
    }

    public Professor(String nome, int id, int idade, double salario, String titulo) {       
        super (id, nome , idade); 
        this.salario = salario;
        this.titulo = titulo;
        
    }
    public double getSalario() {
        return salario;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void calcularImposto(){
       double imposto = getSalario() * 0.15;
        JOptionPane.showMessageDialog(null, "O valor a pagar de imposto sera de: "+ imposto);
    }
}
