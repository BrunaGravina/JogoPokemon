package org.example;

import java.util.Random;

public class Pokemon {
    private String nome, ataqueespecificonome;
    private int vida, defesa;


    public Pokemon(String nome, int vida, int defesa, String ataqueespecificonome) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
        this.ataqueespecificonome = ataqueespecificonome;
    }
    public static void desenhovitoriapokemon(){
        String asciivitoria = """
                
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢰⢿⣿⡻⣷⡦⡭⣍⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⣉⣥⣼⡜⣿⣇⠉⣴⡷⣸⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⡿⠟⣛⡻⢿⣿⣿⡿⠛⠉⡩⠀⠰⢈⣏⣡⣶⣶⡅⠸⣿⡆⣿⡇⢿⣴⡀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⠟⣛⣉⠥⠴⢺⣿⣿⣦⠄⢠⣴⢫⣤⣶⣾⣦⠈⣿⣏⠀⢻⣿⡄⢹⣿⡘⣿⣦⡙⣿⢀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⡇⠐⢊⣤⣤⣶⣷⠈⣿⣧⣶⣿⣦⡙⢿⣿⠁⠹⣿⡄⠸⣿⡌⠌⢿⣧⠈⠿⠗⣦⡍⠭⠛⡜⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⡇⢀⢸⡋⣿⣿⠀⣷⠸⣿⡇⠜⢿⣧⠘⢿⣦⣀⣿⣷⠀⠻⠇⢰⡄⠁⠚⡗⠀⠀⣀⣤⣤⣶⣿⣿⠿⠛⠛⣛⣛⠭⢍⣛⣛⠛⠛⠛⠛⠿⢿⡘⢿⡆⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣦⣄⢹⡘⣿⣆⢻⡆⢻⣧⡰⡘⣿⡇⢈⠛⠛⠉⠥⣴⡇⣤⡌⠀⢺⣧⡸⡈⠀⣿⣿⠛⡫⠄⢐⣉⣤⣤⣴⣶⣶⣶⣶⠶⠶⠤⢤⣬⡍⠓⢢⠈⠛⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⡀⢧⢹⣿⡄⣿⡌⠻⠃⣤⡌⠁⡚⠋⣤⣶⣾⣶⡄⢻⣷⡜⡜⣿⣇⢱⣷⠘⠐⢁⣴⣾⣿⠟⠛⠋⠁⠀⠀⠀⠀⣀⡤⠒⠋⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⡘⢤⣿⣥⡏⠀⠀⣤⣌⠃⢸⣿⠀⣿⣧⠠⢻⣷⡌⢿⣧⣀⣼⡟⢸⠟⠀⣤⡿⠛⠁⠀⠀⠀⠀⠀⢀⣠⠔⠛⠡⢐⣥⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣶⣤⣕⣩⡄⠢⠙⣿⣧⣸⣿⢠⠙⣿⣤⣀⣿⢃⣬⢙⣛⣋⠔⠛⠀⢾⠟⠀⠀⠀⠀⠀⢀⡀⠞⢋⠀⢒⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡱⣌⢻⣿⣿⢸⡷⠬⠙⢋⡤⢚⠅⢀⣀⡀⠀⠀⣾⠊⠀⠀⠀⢀⣠⠞⠋⠀⠌⠤⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣛⣭⡙⠿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡌⣷⣹⣿⢘⡇⠀⣤⣤⣤⣤⣾⣿⠟⠁⠀⣼⠃⠀⠀⠀⡴⠋⣡⣴⣿⣋⣀⣀⠀⠐⠆⠿⠿⠿⢿⣿⣿⣿⣿⣿⠧⠙⠛⠿⣷⣮⡙⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠸⣿⠋⠼⢓⠀⠾⢿⣿⣿⣿⠃⠀⡀⢸⢋⣴⣿⠄⢀⣤⣾⣿⣿⣿⣿⣿⣿⣶⡦⠉⢀⣀⣀⣒⠲⠭⠉⡛⠿⠰⠿⣶⣬⠢⢻⣷⡘⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣍⡈⢀⣴⡶⠀⣿⡿⠡⢀⣼⣇⣼⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⡙⠛⠿⠿⢿⣷⣶⣌⡑⠢⣐⠉⢿⣷⠀⣙⣃⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠏⢠⣿⠏⢀⣴⡆⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⠀⠀⠀⠀⠀⠈⠉⠻⢿⣶⣌⠢⡀⢶⣾⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠁⠂⠀⠀⠰⠀⣿⣿⠀⣾⡟⠀⡄⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠢⣀⠀⠀⠀⠀⠀⠀⠈⠻⣧⡈⠦⠻⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⠟⠁⢀⣡⣶⣇⡰⠁⢠⣶⡈⢿⠀⠙⠃⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢀⠉⠳⢦⣀⠀⠀⠀⠀⠀⠈⠻⣄⠲⡙⣿⣿⣿⣿
                ⣿⣿⣿⣿⠟⠁⢀⣴⣿⣿⣿⣿⡇⠀⢸⣿⣷⡶⠀⡀⠀⠔⠀⣿⣿⣿⣿⣿⠿⣿⣿⣿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠎⣾⣦⣐⡀⢉⠛⠶⢄⣀⠀⠀⠀⠙⣦⠑⡙⣿⣿⣿
                ⣿⣿⣿⠋⠀⣠⣿⣿⣿⣿⣿⣿⣧⠠⠸⠿⠉⢐⣠⣴⣶⣿⡆⠹⣿⣿⣿⣿⣄⠙⠻⠿⠛⢉⣿⣿⣿⣿⣿⡯⣉⡿⠋⠀⣾⣿⣿⣿⣿⣶⣦⣐⡂⠈⢉⠲⠦⣄⠈⣷⡐⠜⢿⣿
                ⣿⣿⢃⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣆⠁⠀⠴⣿⣿⣿⣿⣿⣿⡄⠹⣿⣿⣿⣿⣷⣶⣶⣾⣿⣿⣿⡿⠿⣿⣧⣈⣤⠀⠆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣦⣄⡀⠉⠛⠣⡐⠜⢿
                ⣿⡇⠀⣼⡏⣿⠿⣿⣿⣿⣿⣿⣿⣿⣧⠀⣩⣿⣿⣿⣿⣿⣿⣿⡆⠈⠛⢿⣿⣿⣿⣿⠈⠻⠿⠿⠷⢶⠿⢿⣿⡟⢀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣀⠠⣸⣸
                ⡿⠀⢠⣿⣿⣿⠀⣿⡏⠸⣿⢋⣽⣿⡏⢰⣿⣿⣿⣿⣿⣿⣿⠏⣰⣿⣶⣤⣉⠛⠛⢿⣿⣶⣶⣾⣷⣦⡴⠟⠋⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣾
                ⡇⠀⢸⣿⣿⣿⣄⠻⠇⣦⡙⢿⣿⣿⡇⠸⣿⣿⣿⣿⣿⣿⡏⢰⣿⣿⣿⣿⣿⣿⣿⣶⣤⣤⣤⣤⣤⣤⡀⠈⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⡇⠀⢸⣿⣿⣿⣿⣦⣴⣿⣿⣆⣿⣿⡇⢀⠙⣿⣿⣿⣿⣿⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⢸⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⣾⣷⡈⠻⡿⠻⡏⠈⡟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⢠⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⡆⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢀⣿⣿⣿⣦⣠⠀⠀⣄⠀⠸⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⡈⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣧⠘⣿⣿⣿⣿⣿⣍⠀⣿⣶⣆⠀⠙⣿⣿⣿⣿⣿⣿⡿⢿⡿⠏⠈⣱⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣦⡠⠈⠻⢿⣿⣿⣿⣿⣿⣿⡄⢹⣿⣿⣿⣿⣿⡆⠸⣿⣿⣷⡦⠀⠈⢿⣿⡿⠋⠀⠋⠠⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣦⣀⡠⠉⠛⠻⠿⠿⠿⠗⠀⠙⠿⠿⠿⠿⠿⠀⢻⣿⣿⣷⣶⠀⠀⢉⣤⣶⣿⠁⢢⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣭⣥⣤⣬⣵⣶⣀⠀⠀⢴⡆⢾⠇⡈⢻⣿⣿⣿⣇⠹⠿⣿⣿⠁⠂⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣮⣐⣒⣒⣒⡂⠀⠙⢿⣏⠻⡅⠀⠹⠁⠂⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣥⣤⣍⠄⠤⠀⢀⠀⠁⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                """;
        System.out.println(asciivitoria);
    }
    public Pokemon() {

    }

    protected int ataque() {
        Random gerador = new Random();
        return gerador.nextInt(10) + 1;

    }

    protected int danotomado(int ataque) {
        if (ataque > defesa) {
            int danotomado = ataque - defesa;
            vida -= danotomado;
        }
        if (vida < 0) {
            return 0;
        }
        return vida;
    }
    protected int ataqueespecifico() {
        Random gerador = new Random();
        return gerador.nextInt(5) + 10;
    }
    protected int danotomadoespecifico(int ataqueespecifico) {
        if (ataqueespecifico > defesa) {
            int danotomado = ataqueespecifico - defesa;
            vida -= danotomado;
        }
        if (vida < 0) {
            return 0;
        }
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public String getAtacEspecNom(){
        return ataqueespecificonome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtacEspecNom(String choqueDoTrovão) {
        this.ataqueespecificonome = ataqueespecificonome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
