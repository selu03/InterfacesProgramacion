/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Telecomunicaciones;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class TestLlamada {
   public static void main(String[] args) {
        LocalDateTime a= LocalDateTime.of(2019, Month.JUNE, 13, 12, 20);
        LocalDateTime b=LocalDateTime.of(2018, Month.JUNE, 21, 13, 15);
        LocalDateTime c= LocalDateTime.of(2020, Month.JUNE, 21, 11, 30);
        Llamada l1= new Llamada("123456789", "987654321", false, a, b, 1);
        Llamada l2= new Llamada("123456789", "987654321", false, c, b, 2);
        Llamada l3= new Llamada("123456789", "987654321", true, c, a, 2);
        Llamada []t = new Llamada[]{l1,l2,l3};
        System.out.println(Arrays.toString(t));
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        
        
    }  
}
