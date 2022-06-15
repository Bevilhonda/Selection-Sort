import java.util.Arrays;

public class Exemplo_Selecao {

    public static void main(String[] args) {
        int[] numeros = {8,6,1,9,4,26,10,2,0,5,19,12,};
        int menor_numero = 0 ;
        int incice_de_comparacao = 0;

        for (int i = 0 ; i < numeros.length;i++){
            menor_numero = numeros[i];
            incice_de_comparacao = i ;

           for ( int j = i+1 ; j < numeros.length;j++){

               if (numeros[j] < menor_numero){
                   menor_numero = numeros[j];
                   incice_de_comparacao = j;
               }
           }
           numeros[incice_de_comparacao]= numeros[i];
           numeros[i] = menor_numero;
        }
        Arrays.stream(numeros).forEach(System.out::println);
    }
}
