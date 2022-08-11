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
public class FisicosEstanteria {

   protected String cubierta;
   protected String color;
   protected int cantidadHojas;
   protected String tipoHojas;
   protected String tamaño;

    public FisicosEstanteria() {
    }

    public FisicosEstanteria(String cubierta, String color, int cantidadHojas, String tipoHojas, String tamaño) {
        this.cubierta = cubierta;
        this.color = color;
        this.cantidadHojas = cantidadHojas;
        this.tipoHojas = tipoHojas;
        this.tamaño = tamaño;

    }

    public String getCubierta() {
        return cubierta;
    }

    public String getColor() {
        return color;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String mostrar() {
        return ("\n cubierta: " + cubierta + "\n color: " + color + "\n cantidad de hojas: " + cantidadHojas + "\n tipo de hojas: " + tipoHojas + "\n tamaño: " + tamaño);
    }

}
