/**  

* Write a description of class arr2 here.  

*   

* @author (your name)   

* @version (a version number or a date)  

*/  

import java.util.*;  

public class arr2_2  

{  

    Scanner s = new Scanner(System.in);  

    static int fil;  

    static int col;  

    int t;  

    int [][]array2d;  

    int cantidadobj;  

    int [] arrayn;  

    int menor;  

    int mayor;  

public void setarr2_2 (int fil,int col, int t, int [][]array2d, int cantidadobj, int [] arrayn, int menor, int mayor) {  

    this.fil = fil;  

    this.col = col;  

    this.t = t;  

    this.array2d = array2d;  

    this.cantidadobj=cantidadobj;  

    this.arrayn = arrayn;  

    this.menor = menor;  

    this.mayor=mayor; 
}  

public int getfil(){return fil;}  

public int getcol(){return col;}  

public int gett(){return t;}  

public int getcantidadobj(){return cantidadobj;}  

public int getmenor(){return menor;}  

public int getmayor(){return mayor;}  

public int [] arrayn(){return arrayn;}  

  

public int[][] Inicio()  

    {  
     System.out.println("Cuantas filas y columnas desea?");  

     System.out.println("Filas:");  

     int fil=s.nextInt();  

     System.out.println("Columnas:");  

     int col=s.nextInt();  

    int [][] array2d = new int [fil][col];  

      for(int fi1 = 0; fi1<array2d.length; fi1++)  

     {  

         for(int ci1 = 0; ci1<array2d.length; ci1++)  

         {  

             array2d[fi1][ci1]=(int)(Math.random()*30);  

         }  

     }  
      /*for(int fi1 = 0; fi1<array2d.length; fi1++)  

     {  

         for(int ci1 = 0; ci1<array2d.length; ci1++)  

         {  

             System.out.println(+array2d[fi1][ci1]);

         }  

     }  */ System.out.println(Arrays.deepToString(array2d).replace("],","]\n"));

     return array2d;  

     

   

    }  

      

   public void sumar (){  

        

   int t = 0;  

    for(int fa1 = 0; fa1<fil-1; fa1++){  

    for(int ca1 = 0; ca1<col-1; ca1++){  

    t =+ array2d[fa1][ca1];  

    }}  

    System.out.println("Suma = "+t);  

    }  

      

    public void obtenermayor(int[][] array2D)   

    {  

        int mayor = array2D[0][0];  

   

        for (int f7 = 0; f7 < array2D.length; f7++) {  

            for (int c7 = 0; c7 < array2D[f7].length; c7++) {  

                if (array2D[f7][c7] > mayor) {  

                    mayor = array2D[f7][c7];  

   

                }  

            }  

        }  

          

        System.out.println("El elemento mayor es:" + mayor);  

    }  

    public void obtenermenor(int[][] array2D)  

    {  

      int menor = array2D[0][0];  

        

     for (int f7 = 0; f7 < array2D.length; f7++) {  

            for (int c7 = 0; c7 < array2D[f7].length; c7++) {  

                if (array2D[f7][c7] < menor) {  

                    menor = array2D[f7][c7];  

   

                }  

            }  

        }  

      System.out.println("Elemento menor ="+menor);  

      

    }   

      

    public void promedio (int[][] array2d)  
    
    {  
       List<Integer> tempList = new ArrayList <Integer>(); 
       
       for (int i = 0; i < array2d.length; i++ )
       {
           for(int j = 0; j < array2d[i].length; j++)
           {
               tempList.add(array2d[i][j]);
           }
        }
     
      double suma = 0;
     for(int i = 0; i < tempList.size(); i++)
     {
         suma = suma + tempList.get(i);
     }        
        
       double promedio = suma/tempList.size();;  

        System.out.println("Promedio = "+promedio);  

        

    }   

     

   public void mediana(int[][] array2d)
   {  
       int size = 0;
       size = (array2d.length * array2d[0].length);
       int [] arrayn = new int [size];
       int x = 0;
          for (int i = 0; i < array2d.length; i++ )
       {
           for(int j = 0; j < array2d[i].length; j++)
           {
               arrayn[x] = array2d[i][j];
               x++;
           }
        }

    Arrays.sort(arrayn);  

    if(arrayn.length % 2 == 0 ){  

        int middle = (int) (arrayn.length / 2);
        double middle2 = arrayn[middle]/arrayn[middle-1];

    System.out.println("La mediana es igual a " + middle2);  

    }  

    else {  

        System.out.println("La mediana es igual a "+arrayn[arrayn.length/2]);  

    }  

      

    }  

    

      

    public void moda(){  

    Arrays.sort(arrayn);  

    int maxVecesQueSeRepite = 0;  

int moda = 0;  

for(int i=0; i<arrayn.length; i++){  

int vecesQueSeRepite = 0;  

for(int j=0; j<arrayn.length; j++){  

if(arrayn[i] == arrayn[j])  

vecesQueSeRepite++;  

}  

if(vecesQueSeRepite > maxVecesQueSeRepite){  

moda = arrayn[i];  

maxVecesQueSeRepite = vecesQueSeRepite;}}  

  

System.out.println("La moda es "+moda+" y se repitió "+maxVecesQueSeRepite+" veces.");  

  }  

    

public void imprimir ()  

{  

    for(int ii = 0; ii<arrayn.length;ii++)  

    {  

        System.out.println(+arrayn[ii]);  

    }  

}  

      

      

  public static void main(String[] args) {  

        

         

       arr2_2 ma = new arr2_2();  

               

        int [][] array2D = ma.Inicio();  

        //ma.sumar();  

        ma.obtenermenor(array2D);  

       ma.obtenermayor(array2D);  

        ma.promedio(array2D);  

        //ma.moda();  
        ma.mediana(array2D); 

        //ma.imprimir();  

         

          

         

    }  

}  