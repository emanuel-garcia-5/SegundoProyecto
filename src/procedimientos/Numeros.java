
package procedimientos;

//Constructor de la clase
public class Numeros {
    public Numeros(){
        //Se le asigna un  valor a las varibles llamando al metodo numR
         x = numR();
         y = numR();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

 //Variables de posicion del objetivo (el numero 9)
 private final int x;
 private final int y;
  private  int numR(){
int R = (int) (Math.random() * 8);
return R;
}
  //Este metodo devuelve una matriz con dos numeros 
  //1 es un numero fijo en la posicion 00 y 9 puede aparecer en cualquier posicion
  public int[][] llenar(){
    int matriz[][] = new int[8][8];
   
matriz[ getX()][getY()]=9;
matriz[0][0]=1;

    return matriz;
}
  //Metodo para imprimir una matriz, recibe una matriz
  //como parametro y la imprime
  public void imprimir(int matriz[][]){
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                int celda = matriz1[j];
                System.out.print(celda);
            }
            System.out.println();
        }
 }
}
