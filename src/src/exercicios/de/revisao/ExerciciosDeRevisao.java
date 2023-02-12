
package exercicios.de.revisao;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class ExerciciosDeRevisao {
    
     public static void main(String[] args) {   
   
        
//         1. Crie um algoritmo que, dado um número informado pelo usuário, imprima a tabuada
//dele de 1 a 10. Use o formato de apresentação (considerando que o usuário informou
//o número 5):

//        int valor;
//        String sValor;
//                
//        sValor = JOptionPane.showInputDialog(null,"Digite o valor da tabuada: ");
//        valor = Integer.parseInt(sValor);
//        
//        for(int i = 0; i <= 10; i++){
//           JOptionPane.showMessageDialog(null,valor + " x " + i + " = " + (valor*i));
//   ------------------------------------------------------------------------------------------------------        
//        }
//        2. Modifique o algoritmo anterior, de maneira que o usuário também informe o início e o
////fim da tabuada. Por exemplo: usuário solicitando a tabuada do número 6, com início
////em 5 e fim em 8.

//       int valor;
//       String sValor;
//       
//       sValor = JOptionPane.showInputDialog(null,"Digite um valor: ");
//       valor = Integer.parseInt(sValor);
//       
//       for(int i = 5; i <= 8; i++){
//           JOptionPane.showMessageDialog(null, valor + " x " + i + " = " + (valor*i));
//       }
//
//------------------------------------------------------------------------------------------------------------------
//        3. Modifique o algoritmo do exercício 1, de maneira que sejam impressos somente as
// multiplicações da tabuada cujo resultado seja um número par.

//        int valor;
//        String sValor;
//                
//        sValor = JOptionPane.showInputDialog(null,"Digite o valor da tabuada: ");
//        valor = Integer.parseInt(sValor);
//        
//        for(int i = 0; i <= 10; i++){
//            valor = valor%2;
//            if(i%2 == 0){
//               JOptionPane.showMessageDialog(null,valor + " x " + i + " = " + (valor*i)); 
//            }         
//         }
            //Ñ terminei
 // ------------------------------------------------------------------------------------------------------

//       4. Agora modifique o exercício anterior, considerando agora somente os 
//        resultados que forem ímpares.

//------------------------------------------------------------------------------------------------------------
//       5. Construa um algoritmo que, dado o primeiro elemento e a razão de uma progressão
//aritmética (PA), imprima todos os n primeiros elementos da PA, onde n também é
//informado pelo usuário. Lembre-se que uma PA pode ser crescente ou decrescente.

    int elem1= 1 , razao, num_final, an_inicial = elem1;
    String sElem1, sNum_final, sRazao;
    
        sElem1 = JOptionPane.showInputDialog(null,"Digite o valor inicial: ");
        elem1 = Integer.parseInt(sElem1);
        sNum_final = JOptionPane.showInputDialog(null,"Digite o valor final: ");
        num_final = Integer.parseInt(sNum_final);
        sRazao = JOptionPane.showInputDialog(null,"Digite o valor da razão: ");
        razao = Integer.parseInt(sRazao);
        
        while(an_inicial <= num_final){
        JOptionPane.showMessageDialog(null,an_inicial);
        an_inicial += razao;
     }
        
// ---------------------------------------------------------------------------------------------------------------       
    }
}

        
         
         
        
        
        

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
                   

