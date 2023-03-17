/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Telecomunicaciones;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Llamada implements Comparable{
    String numero_telefono;
    String numero_interlocutor;
    boolean saliente;
    Date fecha;
    LocalDateTime inicio_llamada;
    LocalDateTime finaly;
    int zona;
    Double [] tarifa={0.5,0.3,0.2,0.1};

    public Llamada(String numero_telefono, String numero_interlocutor, boolean saliente, LocalDateTime inicio_llamada, LocalDateTime finaly, int zona) {
        this.numero_telefono = numero_telefono;
        this.numero_interlocutor = numero_interlocutor;
        this.saliente = saliente;
        this.fecha = fecha;
        this.inicio_llamada = inicio_llamada;
        this.finaly = finaly;
        this.zona = zona;
    }

   @Override
    public int compareTo(Object ob) {
        int res = numero_telefono.compareTo(((Llamada) ob).numero_telefono);
        if (res == 0) {
            res = fecha.compareTo(((Llamada) ob).fecha);
        }
        return res;
    }
    int duracion() {
        return (int) inicio_llamada.until(finaly, ChronoUnit.MINUTES);
    }
    Double CosteLlamada() {
        double coste=0;
        
       if(saliente==true){
            switch (zona) {
                case 1:
                    coste=duracion()*tarifa[0];
                    break;
                case 2:
                    coste=duracion()*tarifa[1];
                    break;
                case 3:
                    coste=duracion()*tarifa[2];
                    break;
                case 4:
                    coste=duracion()*tarifa[3];
                    break;
                case 5:
                    coste=duracion()*tarifa[4];
                    break;
                default:
                    break;
            }
            }else{
                coste=0;
            }
        return coste; 
    }
        
    }
    @Override
    public String toString() {
        return "\n" + "En la llamada el telefono del cliente fue " + numero_telefono + "  el del interlocutor " + numero_interlocutor + ", la llamada comenzo" + inicio_llamada + "  la duracion fue de " +duracion()+ " y la llamada tuvo un coste de " + CosteLlamada() ;
    }
}
