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
public class Bibloteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FisicosEstanteria fisico[] = new FisicosEstanteria[3];
        fisico[0] = new Libro("Literatura", "RafaelPombo", "PastaDura", "blancas", 350, "Blanca", "Grande");
        fisico[1] = new Cuaderno ("PastaDelgada", "Amarillo", 100, "cuadriculada", "Mediano");
        fisico[2] = new Revista("semana", "Noticias", "Delgada", "Verde", 25, "papelfotografia","pequeña");
        
       // fisico[1] = new Cuaderno("Pastadelgada", "Gris", 50, "cuadriculada"):
        // TODO code application logic here
        
        System.out.println(fisico[0].mostrar());
        System.out.println("-----------------");
        System.out.println(fisico[1].mostrar());
        System.out.println("-----------------");
        System.out.println(fisico[2].mostrar());
        
        
    }
    
}
