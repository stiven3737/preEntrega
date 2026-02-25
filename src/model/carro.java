package model;

public class Carro {
    private String color;
    private int numPuertas;
    private String modelo;
    private int numAsientos;
    private String marca;
    private int numLLantas;

    public Carro(String color, int numPuertas, String modelo, int numAsientos, String marca, int numLLantas) {
        this.color = color;
        this.numPuertas = numPuertas;
        this.modelo = modelo;
        this.numAsientos = numAsientos;
        this.marca = marca;
        this.numLLantas = numLLantas;
    }

    public int getNumLLantas() {
        return numLLantas;
    }

    public void setNumLLantas(int numLLantas) {
        this.numLLantas = numLLantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumPuertas() {
        return numPuertas;
    }


    public void setNumPuertas(String numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(String numAsientos) {
        this.numAsientos = numAsientos;
    }


    public String getMarca() {
        return marca;
    }       

    public void setMarca(String marca) {
        this.marca = marca;
    }


}