package org.example;
import java.util.Random;

public class Haunter extends Pokemon {
    private int vida;
    private int defesa;
    private String nome, AtacEspecNom;

    public Haunter() {

    }

    public Haunter(String nome, int vida, int defesa, String AtacEspecNom) {
        super(nome, vida, defesa, AtacEspecNom);
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void desenhohaunter() {
        String asciihaunter = """
                ⠀⠀⠀⠀⠀⠀⠀⢢⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⢀⣀⣠⣤⣶⣶⡟⠁⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣷⣶⣦⣤⣀⡀⠀⠀⠀⠀⢀⣀⣤⣴⣶⣶⣶⣶⣶⣶⣦⣤⣀⡀⢀⣀⣠⣤⣴⣶⣾⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⠁⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠸⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠐⢶⣶⣶⣶⣶⣶⣶⣾⣿⣿⣿⣿⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣾⠟⠁⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠠⣶⡆⠈⠻⣿⣿⣿⣿⣿⠋⠠⣶⡆⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⣦⣤⣤⣶⣶⣶⣾⡿⢿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⡛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢀⣾⣿⣿⣿⣿⣯⣤⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠶⣶⣶⣾⣿⣿⣿⣿⣧⠀⠛⠁⠀⠈⠿⠋⠉⠉⠉⠉⠻⠋⠀⠀⠈⠁⢠⣾⣿⣿⣿⣿⣿⣿⣿⣷⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⢠⣤⣤⣤⣀⠀⠈⠻⢿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⠟⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣷⣦⡀⠀⠙⠿⣿⣿⣿⣿⣿⣦⣀⣠⣀⣴⡀⣠⡀⣠⡀⣴⣄⣠⣾⣿⣿⣿⣿⣿⣿⡿⠋⠀⣼⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣋⣀⣠⣾⣿⣿⣿⣿⣿⣿⣷⣶⣶⣤⣄⠀
                ⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷
                ⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠛⠻⣿⣿⣿⡿⠟⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿
                ⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠿⠿⠿⠛⠁⣿⣿⠃⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⠁⠀⠀⠀⠀⠀⠹⡇⠀⠀⠀⠈⠙⠛⠋⠁⣸⡿⠃
                ⠸⣿⣿⡟⠉⠉⠉⠉⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠛⠁⠀⠀⠀⠀⠙⣧⠙⣿⣿⣿⣿⣿⣿⣿⣿⠘⡏⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠁⠀
                ⠀⢻⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠣⠈⠻⣿⡿⢿⣿⣿⣿⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⠈⢻⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """;
        System.out.println(ANSI_PURPLE + asciihaunter + ANSI_RESET);
    }
    @Override
    protected int ataque() {
        return super.ataque();
    }

    protected int ataqueespecifico() {
        Random gerador = new Random();
        return gerador.nextInt(5) + 10;
    }

    @Override
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

    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAtacEspecNom(String atacEspecNom) {
        this.AtacEspecNom = atacEspecNom;
    }
    public String getAtacEspecNom() {
        return AtacEspecNom;
    }
}

