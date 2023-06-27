package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner tc = new Scanner(System.in);
        Batalha Batalha = new Batalha();
        System.out.println("Olá, bem vindo(a) ao centro pokemon da cidade de Vermilion! Qual o seu nome? ");
        Thread.sleep(1000);
        String treinadorNome = tc.nextLine();
        System.out.println("Bem vindo(a) Treinador(a) " + treinadorNome + " vamos iniciar sua jornada pokemon!\nEstes são os iniciais da região, escolha um número!");
        System.out.println(" 1- Pikachu \n 2- Haunter \n 3- Eevee \n 4- Squirtle \n 5- Charmeleon");
        int escolhido = tc.nextInt();

        Pikachu pikachu = new Pikachu();
        pikachu.setNome("Pikachu");
        pikachu.setVida(25);
        pikachu.setDefesa(5);
        pikachu.setAtacEspecNom("Choque do trovão");

        Haunter haunter = new Haunter();
        haunter.setNome("Haunter");
        haunter.setVida(20);
        haunter.setDefesa(6);
        haunter.setAtacEspecNom("Bola das Sombras");

        Eevee eevee = new Eevee();
        eevee.setNome("Eevee");
        eevee.setVida(16);
        eevee.setDefesa(3);
        eevee.setAtacEspecNom("Arranhão");

        Squirtle squirtle = new Squirtle();
        squirtle.setNome("Squirtle");
        squirtle.setVida(15);
        squirtle.setDefesa(8);
        squirtle.setAtacEspecNom("Jato d'água");

        Charmeleon charmeleon = new Charmeleon();
        charmeleon.setNome("Charmeleon");
        charmeleon.setVida(17);
        charmeleon.setDefesa(3);
        charmeleon.setAtacEspecNom("Sopro flamejante");

        Meowth meowth = new Meowth();
        meowth.setNome("Meowth");
        meowth.setVida(30);
        meowth.setDefesa(5);


        switch (escolhido) {
            case 1:
                System.out.println("Parabéns! Você escolheu Pikachu.");
                Thread.sleep(1000);
                Pikachu.desenhopikachu();
                Thread.sleep(1000);
                System.out.println("\nEstas são suas estatísticas: \nVida: \n" + pikachu.getVida() + "\nDefesa: \n" + pikachu.getDefesa());
                break;
            case 2:
                System.out.println("Parabéns! Você escolheu Haunter.");
                Thread.sleep(1000);
                Haunter.desenhohaunter();
                Thread.sleep(1000);
                System.out.println("\nEstas são suas estatísticas: \nVida: \n" + haunter.getVida() + "\nDefesa: \n" + haunter.getDefesa());
                break;
            case 3:
                System.out.println("Parabéns! Você escolheu Eevee.");
                Thread.sleep(1000);
                Eevee.desenhoeevee();
                Thread.sleep(1000);
                System.out.println("\nEstas são suas estatísticas: \nVida: \n" + eevee.getVida() + "\nDefesa: \n" + eevee.getDefesa());
                break;
            case 4:
                System.out.println("Parabéns! Você escolheu Squirtle.");
                Thread.sleep(1000);
                Squirtle.desenhosquirtle();
                Thread.sleep(1000);
                System.out.println("\nEstas são suas estatísticas: \nVida: \n" + squirtle.getVida() + "\nDefesa: \n" + squirtle.getDefesa());
                break;
            case 5:
                System.out.println("Parabéns! Você escolheu Charmeleon.");
                Thread.sleep(1000);
                Charmeleon.desenhocharmeleon();
                Thread.sleep(1000);
                System.out.println("\nEstas são suas estatísticas: \nVida: \n" + charmeleon.getVida() + "\nDefesa: \n" + charmeleon.getDefesa());
                break;
        }
        Thread.sleep(2000);
        System.out.println("\nTenho certeza que serão grandes amigos!\n");
        Thread.sleep(1000);
        System.out.println("Sempre que precisar de ajuda venha para cá...\n");
        Thread.sleep(2000);
        System.out.println("Que barulho foi esse?\n");
        Thread.sleep(1000);
        System.out.println("*explosões*\n");
        Thread.sleep(3000);
        System.out.println("ESSA NÃO! A EQUIPE ROCKET ESTÁ AQUI PARA ROUBAR POKEMON!!\n");

        Rocket.comunicar();

        Thread.sleep(1000);
        System.out.println("\nDeseja lutar?(Sim/Nao)");
        String opcao = tc.next();

        if (opcao.equalsIgnoreCase("Sim")) {
            if (escolhido == 1) {
                Batalha.batalhar(pikachu, pikachu.getAtacEspecNom(), treinadorNome, meowth);
            } else if (escolhido == 2) {
                Batalha.batalhar(haunter, haunter.getAtacEspecNom(), treinadorNome, meowth);
            } else if (escolhido == 3) {
                Batalha.batalhar(eevee, eevee.getAtacEspecNom(),  treinadorNome, meowth);
            } else if (escolhido == 4) {
                Batalha.batalhar(squirtle, squirtle.getAtacEspecNom(), treinadorNome, meowth);
            } else if (escolhido == 5) {
                Batalha.batalhar(charmeleon, charmeleon.getAtacEspecNom(), treinadorNome, meowth);
            }
        }
            else if (opcao.equalsIgnoreCase("Nao")) {
                System.out.println("Você fugiu, a Equipe Rocket roubou todos os Pokemons! :(");
            }
    }
}