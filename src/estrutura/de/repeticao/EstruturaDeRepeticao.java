
package estrutura.de.repeticao;
import javax.swing.JOptionPane;
import java.util.Random;
public class EstruturaDeRepeticao {

    public static void main(String[] args) {
      
//        // While(Enquanto Faça)

//        int contador = 400;
//        while(contador >= 300){
//          JOptionPane.showMessageDialog(null,contador);
//                contador++
//        }
//        
//        // Do While(Repita Até)
//        
//        int contador = 400;
//        do{
//           JOptionPane.showMessageDialog(null,contador);
//                contador--; 
//        }while(contador >= 300);
//        

//        // For(Para x de 1 ate 10 faca)
//do 1 ao 100
//        int contador = 1;
//        
//        for(contador=1; contador<=100; contador++){ //ou for(int contador = 1; contador <= 100; contador++)
//            JOptionPane.showMessageDialog(null,contador);
//        }
        //se quiser diminuir de 2 em 2: contador=1; contador<=100; contador -= 2
        //se quiser multiplicar por 10: contador=1; contador<=100; contador *= 10 
//        
//        // Para parar a estrutura de repetição usa o break;
//        
//        for(int x = 0; x <= 10; x++)
//        {
//            JOptionPane.showInputDialog(null,"");
//            if(x == 5){
//                break;
//            }
//        }
//        
//        //Para pular para a próxima interação em qualquer estrutura, usa o continue;
//        
//        for(int x = 0; x <= 10; x++){
//            JOptionPane.showInputDialog(null,"");
//            Integer.parseInt(s);
//            if( x == 5){
//                continue;
//            }
//            JOptionPane.showMessageDialog(null,"");
//        }
        
        
//       Informar todos os números de 1000 a 1999 que
//quando divididos por 11 obtemos resto = 5.
            
//            for(int i = 1000; i <= 1999; i++){
//                if(i%11 == 5){
//                  JOptionPane.showMessageDialog(null,i);  
//                } 
//            }
 
//Exibir uma mensagem 5x
//    int contador=0;
//    while(contador<3){
//        JOptionPane.showMessageDialog(null,"Olá, Mundo!");
//                contador = contador + 1; // ou contador++;
//    }
//Imprimir um número de 1 até 100
//        int contador = 1;
//        while(contador <= 10){
//           JOptionPane.showMessageDialog(null,contador);
//               contador = contador + 1; 
//        }
//        


// Como gerar números aleatórios

//double dado6faces = Math.random(); //double dentro do int
//JOptionPane.showMessageDialog(null, dado6faces);
////toda vez q executa ele gera um número aleatório

//Imprima um número entre 1 e 2
//double dado6faces = 1 + Math.random() * 2;
//JOptionPane.showMessageDialog(null, dado6faces);
// 1 e 6
//int dado6faces = 1 + (int)(Math.random() * 6);
//JOptionPane.showMessageDialog(null, dado6faces);

//Outra forma de criar esses números é com a classe Random
//1 e 6
//    int dado6faces = 1 + (int)(Math.random() * 6);
//    
//    Random gerador = new Random();
//    int num = gerador.nextInt(6) + 1; //6 é o maior número, e 1 valor mínimo
//    JOptionPane.showMessageDialog(null,num);


//Usuando seeds para testar programas

//Random gerador = new Random();
//String facesString = JOptionPane.showInputDialog(null,"Quantas faces tem o dado? ");
//int facesDados = Integer.parseInt(facesString);
//
//int resultado = 1 + gerador.nextInt(facesDados);
//
//JOptionPane.showMessageDialog(null, "Você tirou " + resultado + " no dado");



//  Colocar estas duas linhas iniciais no método Main():
//Random rnd = new Random(); //Inicia Aleatório
//int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)

//1. Faça um laço de repetição que solicite ao usuário digitar
//um número;
//2. O laço encerra quando o usuário acertar o número;
//3. Se o número do usuário for menor que o oculto,
//escrever: “MAIOR”, se o número do usuário for maior que
//o oculto, escrever: “MENOR”     

//para usar o Random:   
//        Random gerador = new Random();
//        int numero = 1 + gerador.nextInt(4); //ele quer gerar um número de 1 a 4
//        while(numero != 3){ //quer ficar girando nesse numero ate achar o numero 3
//           JOptionPane.showMessageDialog(null,"Gerou o número " + numero);
//           numero = 1 + gerador.nextInt(4); //então aqui ele vai receber todo numero aleatorio
//        }
//        JOptionPane.showMessageDialog(null,"Gerou o número 3!!");

//        Random gerador = new Random();
//
//            int num = 1 + gerador.nextInt(100);
//            
//            while(num != 3){
//                JOptionPane.showInputDialog(null,"Digite um número: ");
//                
//               JOptionPane.showMessageDialog(null,"Gerou o número " + num);
//                num = 1 + gerador.nextInt(4);
//            }
//            JOptionPane.showMessageDialog(null, "Gerou o número 3!");
//            

    }   
}

