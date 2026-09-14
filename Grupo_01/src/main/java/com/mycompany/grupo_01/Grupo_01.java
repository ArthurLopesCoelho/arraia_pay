package com.mycompany.grupo_01;
import java.util.Scanner;

public class Grupo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SISTEMA DE CARTOES");
        System.out.println("1 - Cadastrar cartao");
        System.out.println("2 - Consultar cartao");
        System.out.println("3 - Bloquear cartao");
        System.out.println("4 - Sair");
        
        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("Cadastrar cartao");
                break;
                
            case 2:
                System.out.println("Consultar cartao");
                break;
                
            case 3:
                System.out.println("Bloquear cartao");
                break;
                
            case 4:
                System.out.println("Saindo... ");
                break;
                
            default :
                System.out.println("Opcao Invalida");
                break;
        }
        scanner.close();
        
        Cartao cartao = new Cartao("CARTAO_01");
        System.out.println(cartao.getCartao());
        System.out.println(cartao.isAtivo());
    }
}
