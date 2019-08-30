
package segundoproyecto;


import java.util.Scanner;
import procedimientos.Numeros;


public class SegundoProyecto {
    //Variables para moverse dentro de la matris
   static int x,y,aux;
   //instanci del objeto de la clase Numeros para usar los metodos
  static Numeros l = new Numeros();
  //llamada al metodo llenar para llenar la matriz
       static int[][] matriz = l.llenar();  
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opt;
       boolean t = true;
      
      do{
      
       l.imprimir(matriz);
       opt = s.nextInt();
       switch(opt){
          case 1:
              moverD();
            break;
          case 2:
              moverA();
                break;
                   case 3:
              moverI();
                break;
   case 4:
              moverAR();
                break;

                
          default:
              break;
      };
      if(matriz[l.getX()][l.getY()]==1) {
             t = false;
               l.imprimir(matriz);
         }
      }while(t);
      
      System.out.print("FELICIDADES GANASTE!!");
    }
    static public void moverD(){
        if(y<matriz.length-1){
    int rob = matriz[x][y];
    matriz[x][y]=aux;
    y++;
    matriz[x][y]=rob;
        }
    }
   static public void moverA(){
       if(x<matriz.length-1){
    int rob = matriz[x][y];
    matriz[x][y]=aux;
    x++;
    matriz[x][y]=rob;
    }}
   static public void moverI(){
       if(y>0){
    int rob = matriz[x][y];
    matriz[x][y]=aux;
    y--;
    matriz[x][y]=rob;
    }
   }
   static public void moverAR(){
       if(x>0){
    int rob = matriz[x][y];
    matriz[x][y]=aux;
    x--;
    matriz[x][y]=rob;
    }}
}
