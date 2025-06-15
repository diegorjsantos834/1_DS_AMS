S
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswing2;
import javax.swing.*;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class JavaSwing2 {

    public static void main(String[] args) {
        
        //exercicio 1, leia a idade em dias
        //variaveis e entrada de dados
       int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade de anos: "));
       int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quanto tempo foi seu aniversario em meses: "));
       int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quanto tempo foi seu aniversario em dias: "));
       int re = (ano*365)+(mes*30)+ dia;
        JOptionPane.showMessageDialog(null, "O resultado é: " + re +", ou seja, " + ano + " anos, " + mes + " meses e " + dia + "  dias."); //resultado da idade em dias
        
        //Exercicio 2, média aritmetica
        //variaveis
        int nota1 = 8, nota2= 9, nota3=7;
        int nota4 = 4, nota5= 5, nota6=6;
        
        //media 1
        int media1 = (nota1+nota2+nota3)/3;
        //media 2
        int media2= (nota4+nota5+nota6)/3;
        //soma das média
        int r = media1 + media2;
        //média das médias
        int r2 = r/2;
        //resultado        
        JOptionPane.showMessageDialog(null, "O resultado da soma das duas medias: " + r +"\nA média da média: " + r2);  

        //exercicio 3, Informar um saldo e reajustar o valor com 1%
        //variaveis e entrada de dados
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saldo: ")); //uso da variavel double por o saldo ser um valor monetário
        double taxaReajuste = saldo * 0.01; // 1% de reajuste
        double saldoFinal = saldo + taxaReajuste; // saldo reajustado
        //resultado
        JOptionPane.showMessageDialog(null, "O valor do saldo reajustado é: " + saldoFinal); //resultado do saldo reajustado
        

        //exercicio 4, Cálculo de peças com IPI
        //variaveis e entrada de dados
        //valor do IPi
        int IPI = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da IPI: \nOBS: apenas o valor sem o % "));
         //codigo da peça1
        int codigoP = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da peça: "));
        //valor da peça1
        double PrecoP = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça: ")); //uso da variavel double por o valor ser um valor monetário
        //quantidade de peça1
        double QuantidadeP = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peças: "));
        //Peças 2
         //codigo da peça2
        int codigoS = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da  2 peça: "));
        //valor da peça2
        double PrecoS = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2 peça: ")); //uso da variavel double por o valor ser um valor monetário
        //quantidade de peça2
        double QuantidadeS = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade das 2 peças: "));
        //calculo
        double totalPeca1 = PrecoP * QuantidadeP; //total da peça 1
        double totalPeca2 = PrecoS * QuantidadeS; //total da peça 2SS
        double totalComIPI1 = totalPeca1 * (1 + IPI / 100); //total da peça 1 com IPI
        double totalComIPI2 = totalPeca2 * (1 + IPI / 100); //total da peça 2 com IPI
        double totalGeral = (PrecoP * QuantidadeP + PrecoS * QuantidadeS) * (IPI / 100 +1); //total geral com IPI
        //resultado
        JOptionPane.showMessageDialog(null, "Total da peça 1 (código " + codigoP + "): R$ " + totalComIPI1 + "\nTotal da peça 2 (código " + codigoS + "): R$ " + totalComIPI2 + "\nTotal geral com IPI: R$ " + totalGeral); //resultado do total das peças com IPI

       //exercicio 5, Quantos salarios minimos vc ganha?
         double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salário: " + "\n OBS: digite o valor sem ponto apenas o numero cajo o valor seja inteiro ex: 2000 ou 2750")); //uso da variavel double por o salario ser um valor monetário
         double salarioMinimo = 1000; //o valor do salário mínimo
         double QuantoSalario = salario / salarioMinimo; //quantidade de salários mínimos
        JOptionPane.showMessageDialog(null, "Você ganha " + QuantoSalario + " salários mínimos."); //resultado da quantidade de salários mínimos
        //exercicio 6, antecessor e sucessor de um número
        //entrada de dados
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int antecessor = num1 - 1; //cálculo do antecessor
        int sucessor = num1 + 1; //cálculo do sucessor
        //resultado
        JOptionPane.showMessageDialog(null, "O antecessor de " + num1 + " é: " + antecessor + "\nO sucessor de " + num1 + " é: " + sucessor); //resultado do antecessor e sucessor
    }
}
