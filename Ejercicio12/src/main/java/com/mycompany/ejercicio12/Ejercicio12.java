package com.mycompany.ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        double horas_trabajadas, valor_hora;
        double retencion;
        double salario_bruto, salario_neto;
        valor_hora = 5000;
        horas_trabajadas = 48;
        salario_bruto = valor_hora * horas_trabajadas;
        retencion = salario_bruto * (12.5/100);
        salario_neto = salario_bruto - retencion;
        
        System.out.println("Horas trabajadas: " + horas_trabajadas);
        System.out.println("Valor por hora: " + valor_hora);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Retencion en la fuente: " + retencion);
        System.out.println("Salario neto: " + salario_neto);
    }
}
