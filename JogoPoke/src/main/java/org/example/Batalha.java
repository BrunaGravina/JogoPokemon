package org.example;
import java.util.Random;
import java.util.Scanner;
public class Batalha {

    public Batalha() {
    }

    public static void batalhar(Pokemon pokemon, String AtacEspecNom, String treinadornome, Meowth meowth) throws InterruptedException {
        Scanner e = new Scanner(System.in);
        System.out.println(treinadornome + ": " + pokemon.getNome() + ", eu escolho você!\n");
        while (pokemon.getVida() > 0 && meowth.getVida() > 0) {
            Thread.sleep(1000);
            System.out.println("Deseja usar:\n1- Ataque Rapido\n2- " + AtacEspecNom + "\n3- Esquiva");
            int ataqueescolhido = e.nextInt();
            if (ataqueescolhido == 1) {
                int ataque = pokemon.ataque();
                meowth.danotomado(ataque);
                Thread.sleep(1000);
                if (meowth.getVida() <= 0) {
                    System.out.println("\n" + pokemon.getNome() + " atacou Meowth com ataque rápido! E deu " + ataque + " de dano, " + "Meowth morreu.\n");
                    System.out.println("Parabéns! Você derrotou a equipe Rocket.");
                    Thread.sleep(1000);
                    System.out.println("Obrigado por salvar os Pokemon.\n");
                    Thread.sleep(1000);
                    Pokemon.desenhovitoriapokemon();
                    break;
                } else {
                    System.out.println("\n" + pokemon.getNome() + " atacou Meowth com ataque rápido! E deu " + ataque + " de dano, " + "Meowth ficou com " + meowth.getVida() + " de vida");
                }
                ataque = meowth.ataque();
                pokemon.setVida(pokemon.danotomado(ataque));
                Thread.sleep(1000);
                System.out.println("\nMeowth atacou " + pokemon.getNome() + " e deu " + ataque + " de dano, " + pokemon.getNome() + " ficou com " + pokemon.getVida() + " de vida\n");
            } else if (ataqueescolhido == 2) {
                int ataqueespecifico = pokemon.ataqueespecifico();
                meowth.danotomadoespecifico(ataqueespecifico);
                Thread.sleep(1000);
                if (meowth.getVida() <= 0) {
                    System.out.println("\n" + pokemon.getNome() + " atacou Meowth com " + AtacEspecNom + "! E deu " + ataqueespecifico + " de dano, " + "Meowth morreu.\n");
                    System.out.println("Parabéns! Você derrotou a equipe Rocket.");
                    Thread.sleep(1000);
                    System.out.println("Obrigado por salvar os Pokemon.\n");
                    Thread.sleep(1000);
                    Pokemon.desenhovitoriapokemon();
                    break;
                }
                    else {
                    System.out.println("\n" + pokemon.getNome() + " atacou Meowth com " + AtacEspecNom + "! E deu " + ataqueespecifico + " de dano, " + "Meowth ficou com " + meowth.getVida()+ " de vida");
                }
                ataqueespecifico = meowth.ataque();
                pokemon.setVida(pokemon.danotomado(ataqueespecifico));
                Thread.sleep(1000);
                System.out.println("\nMeowth atacou " + pokemon.getNome() + " e deu " + ataqueespecifico + " de dano, " + pokemon.getNome() + " ficou com " + pokemon.getVida() + " de vida\n");
            }
            else if (ataqueescolhido == 3){
                    Random random = new Random();
                    int chance = random.nextInt(20);
                    int chanceEsq = pokemon.getDefesa() * 2;

                    if (chance < chanceEsq) {
                        System.out.println(pokemon.getNome() + " esquivou do ataque!");
                    } else {
                       int ataque = meowth.ataque();
                        pokemon.setVida(pokemon.danotomado(ataque));
                        System.out.println(pokemon.getNome() + " foi atingido e recebeu "+ ataque +" de dano e ficou com "+ pokemon.getVida() +" de vida!");
                    }
            }
        }

        if (pokemon.getVida() <= 0) {
            System.out.println("Você morreu, muito ruim kkkkk\n");
            Thread.sleep(1000);
            Rocket.desenhovitoria();
        }
    }
}