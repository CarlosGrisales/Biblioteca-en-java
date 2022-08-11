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
public class Cuaderno extends FisicosEstanteria {

    public Cuaderno(String cubierta, String color, int cantidadHojas, String tipoHojas, String tamaño) {
        super(cubierta, color, cantidadHojas, tipoHojas, tamaño);
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
        return ("\n cubierta: " + cubierta + "\n color: " + color + "\n cantidad de hojas: " + cantidadHojas + "\n tipo de hojas: " + tipoHojas + "\n tamaño: " + tamaño);
    }

}
