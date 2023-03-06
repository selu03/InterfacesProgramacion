package Tema7.Interfaces;
import java.util.Arrays;
import java.util.Scanner;
public class Lista implements Cola{
int tabla[];

    public Lista(){
 tabla=new int[0];
    }
    
   public  void encolar() {
       Scanner sc = new Scanner(System.in);
    int z=sc.nextInt();
        while(z>=0){
        this.insertarFinal(z);
        z=sc.nextInt();
        }
       
    }

    public void desencolar(){
        while (tabla.length>0)
        eliminar(0);
        System.out.println(Arrays.toString(tabla));
    }
    
   void insertarPrincipio(Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
      tabla[0] = nuevo;
   }

   void insertarFinal(Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      tabla[tabla.length - 1] = nuevo;
   }

   void insertarFinal(Lista otraLista) {
      int tamIni = tabla.length;
      tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
      System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
   }

   void insertar(int posicion, Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      System.arraycopy(tabla, posicion, tabla, posicion + 1,
         tabla.length - posicion - 1);
      tabla[posicion] = nuevo;
   }

   Integer eliminar(int indice) {
      Integer eliminado = null;
      if (indice >= 0 && indice < tabla.length) {
         eliminado = tabla[indice];
         for (int i = indice + 1; i < tabla.length; i++) {
            tabla[i - 1] = tabla[i];
         }
         tabla = Arrays.copyOf(tabla, tabla.length - 1);
      }
      return eliminado;
   }

   Integer get(int indice) {
      Integer resultado = null;
      if (indice >= 0 && indice < tabla.length) {
         resultado = tabla[indice];
      }
      return resultado;
   }

   int buscar(Integer claveBusqueda) {
      int indice = -1;
      int otro = (int) claveBusqueda;
      for (int i = 0; i < tabla.length && indice == -1; i++) {
         if (tabla[i]==(otro)) {
            indice = i;
         } else {
         }
      }
      return indice;
   }

   public int numeroElementos() {
      return tabla.length;
   }

   public void mostrar() {
      System.out.println("Lista: " + Arrays.toString(tabla));
   }
}
