import javax.swing.JOptionPane;

public class Java{

    public static void main(String[] args) {
        
        /*   int nota = 20;
           int edad = 18;
           String nombre = "Esther";
           String resultado = (nota >= 10) ? "Aprobado" : "Reprobado";
           System.out.println("El resultado es; "+resultado);
        */


        int tam = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese tama"));
        int num[] = new int [tam];

        String valores="";
        String pares="";
        String impares="";
        String mayores_10="";
        String menores_10="";
        String positivos="";
        String negativos="";
        int suma_valores=0;
        int suma_pares=0;
        int suma_impares=0;
        int cant_valores=0;
        int cant_pares=0;
        int cant_impares=0;
        int promedio_impares=0;
        int promedio_pares=0;
        int raiz_cuadrada_suma = 0;

        for (int i = 0; i<num.length; i++) {
          num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor "+(i+1)));
          System.out.print("Posición: ["+i+"]="+num[i]);


          System.out.println();
          valores+=" "+num[i];
          suma_valores=suma_valores+num[i];
          if (num[i]%2==0) {
            pares+=" ["+num[i]+"] ";
            cant_pares++;
            suma_pares=suma_pares+num[i];
            promedio_pares=(suma_pares/tam);

          } else {
            impares+=" ["+num[i]+"] ";
            cant_impares++;
            suma_impares=suma_impares+num[i];
            promedio_impares=(suma_impares/tam);
          }
          if(num[i]>0){
            positivos+=" ["+num[i]+"] ";

          }else{
            negativos+=" ["+num[i]+"] ";
          
         }
         if(num[i] > 10){
            mayores_10+="["+num[i]+"]";
         }else{
            menores_10+="["+num[i]+"]";
         }
        }

        double raiz = Math.sqrt(suma_valores);
        System.out.println("Los valore son: "+valores);
        System.out.println("Cantidad de valores: "+tam);
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
        System.out.println("Cantidad de pares: "+cant_pares);
        System.out.println("Cantidad de impares: "+cant_impares);
        System.out.println("Suma de pares: "+suma_pares);
        System.out.println("Suma de impares: "+suma_impares);
        System.out.println("Suma total: "+suma_valores);
        System.out.println("Promedio de pares: "+promedio_pares);
        System.out.println("Promedio de impares: "+promedio_impares);
        System.out.println("Mayores a 10: "+mayores_10);
        System.out.println("Menores a 10: "+menores_10);
        System.out.println("Raiz cuadrada: "+raiz);


//Programación práctica
















































    }
}
