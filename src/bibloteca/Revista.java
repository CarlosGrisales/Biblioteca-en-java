/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibloteca;

/**
 *
 * @author SSSA
 */
public class Revista extends  FisicosEstanteria {

    private String marca;
    private String contenido;

    public Revista(String marca, String contenido, String cubierta, String color, int cantidadHojas, String tipoHojas, String tamaño) {
        super(cubierta, color, cantidadHojas, tipoHojas, tamaño);
        this.marca = marca;
        this.contenido = contenido;
    }

  

    public String getMarca() {
        return marca;
    }
      public String getContenido() {
        return contenido;
    }

    @Override
    public String getCubierta() {
        return cubierta;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getCantidadHojas() {
        return cantidadHojas;
    }

    @Override
    public String getTipoHojas() {
        return tipoHojas;
    }

    @Override
    public String getTamaño() {
        return tamaño;
    }


    public String mostrar() {
        return ("\n cubierta: " + cubierta + "\n color: " + color + "\n cantidad de hojas: " + cantidadHojas + "\n tipo de hojas: " + tipoHojas + "\n tamaño: " + tamaño + "\n marca: " + marca + "\n contenido: " + contenido);

    }
}
