/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividades;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividades {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       
        System.out.println("Operações matemáticas");
        
       //Variaveis basicas
       int Faren1 = 32; //Número para mltiplicar os celsius
       int Numt1= 9;
       int Numt2= 5;

       //atividade 1, Operações matemáticas
         //operações
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        //soma, subtração, multiplicação, divisão
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        
        //resultados
        System.out.println("resultado das operações");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
       
       //Atividade 2, conversão de temperatura
      System.out.println("Conversão de temperatura");
      
      //Celsius para fahrenheit
       System.out.print("Digite o valor em Grau Celsius: ");
        double Grau =scanner.nextDouble();
        //Conta
        double Conversao= (Grau*Numt1/Numt2)+Faren1;
        
        //Resultado
        System.out.println("Valor em Fahrenheit: " + Conversao);
        
        //Fahreiht para kelvin
       System.out.print("Digite o valor em farenheit: ");
        double Fah =scanner.nextDouble();
        //Conta
        double Conversao2= (Fah - Faren1)*Numt2/Numt1 + 273.15;
        
        //Resultado
        System.out.println("Valor em Kelvin: " + Conversao2);
        
        //atividade 3, primo ou não
        System.out.println("Verificação de número primo");
        
        //Entrada de dados
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo && numero > 1) {
            System.out.println(numero + ":É primo.");
        } else {
            System.out.println(numero + ":Não é primo." );
        }
        
        //ativadade 4,Calculadora de média dos alunos
        System.out.println("Média do aluno");
        
        //entrada de dados
        System.out.print("Digite a primeira nota!: ");
        int nota1 = scanner.nextInt();
        
        System.out.print("Digite a segunda nota!: ");
        int nota2 = scanner.nextInt();

        System.out.print("Digite a terceira nota nota!: ");
        int nota3 = scanner.nextInt();

        System.out.print("Digite a quarta nota!: ");
        int nota4 = scanner.nextInt();
        
        //Calcular a média
         
        int Media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Média do aluno: " + Media);
        
        //ativiade 5, tabuada do número
        System.out.println("Tabuada");
        
        System.out.print("Digite o número: ");
        double tab = scanner.nextDouble();
        scanner.nextLine();
        
        //Resultado
        System.out.println("Tabuada: ");
        for ( int i = 1; i<=10; i++){
            System.out.println(tab+"X"+ i + "=" + i*tab);
        }
        
        //ativadade 6, dados do usuario
        System.out.println("Digite os dados solicitados: ");
        
        //Entrada de dados
        //Nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        //Data de nascimento
         System.out.print("Digite sua data de nascimento: ");
        String nasc = scanner.nextLine();
        //Curso
         System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();
        //Série
         System.out.print("Digite sua série: ");
        int serie = scanner.nextInt();
        //Altura
         System.out.print("Digite suu altura: ");
        double altura = scanner.nextDouble();
        //Peso
         System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        
        //Exibir os dados
        System.out.println("Olá!, seja bem-vindo "+ nome + " cursando " + serie +" " + curso);
        System.out.println("Informações pessoais: ");
        System.out.println("Data de nascimento: "+ nasc);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        
        
        scanner.close();
    }
}
