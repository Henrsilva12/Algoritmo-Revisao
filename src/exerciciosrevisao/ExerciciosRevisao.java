
package exerciciosrevisao;
import javax.swing.JOptionPane;
public class ExerciciosRevisao {

    public static void main(String[] args) {
        // Crie um algoritmo que leia a nota de um aluno e 
        // mostre se ele está: aprovado (acima de 60), em
        // recuperação (abaixo de 60) ou reprovado por
        // média (abaixo de 20).
        
//        double nota1, nota2, nota3, media;
//        String sNota1, sNota2, sNota3;
//        
//        sNota1 = JOptionPane.showInputDialog(null,"Digite a 1º nota");
//        nota1 = Double.parseDouble(sNota1);
//        sNota2 = JOptionPane.showInputDialog(null,"Digite a 2º nota");
//        nota2 = Double.parseDouble(sNota2);
//        sNota3 = JOptionPane.showInputDialog(null,"Digite a 3º nota");
//        nota3 = Double.parseDouble(sNota3);
//        media = nota1 + nota2 + nota3 / 3;
//        
//        if(media >= 60) {
//            JOptionPane.showMessageDialog(null,"APROVADO!");
//        }
//        else if((media >= 60) && (media < 60)){
//            JOptionPane.showMessageDialog(null,"Recuperação");
//        }
//        else {
//            JOptionPane.showMessageDialog(null,"Reprovado por média");
//        }
     

//            Ler 3 números fracionários do teclado e
//            informar se o primeiro é maior do que a soma
//            dos dois últimos;

//            double n1, n2, n3, soma;
//            String sN1, sN2, sN3;
//            
//            sN1 = JOptionPane.showInputDialog(null,"Digite o 1º número: ");
//            sN2 = JOptionPane.showInputDialog(null,"Digite o 2º número: ");
//            sN3 = JOptionPane.showInputDialog(null,"Digite o 2º número: ");
//            
//            n1 = Double.parseDouble(sN1);
//            n2 = Double.parseDouble(sN2);
//            n3 = Double.parseDouble(sN3);
//            
//            soma = n1 + n2 + n3;
//            
//            if(n1 > n2 + n3){
//                JOptionPane.showMessageDialog(null,"O primmeiro número é maior que a soma dos dois últimos números");
//            }
//            else {
//                JOptionPane.showMessageDialog(null,"Não é maior");
//            }
            

       // Calcular a multa: Leia a velocidade de um carro e a velocidade máxima para a rua:
       //Informe 50 reais se estiver até 10Km/h acima;
       //Informe 100 reais se estiver entre 11Km/h e 30Km/h acima;
       //Informe 300 reais se etiver acima de 31km/h acima;
       
//       double veloc_carro, tempo,dista, veloc_rua;
//       String sTempo, sDista, sVeloc_rua;
//       
//       sDista = JOptionPane.showInputDialog(null,"Digite a distância percorrida: ");
//       sTempo = JOptionPane.showInputDialog(null,"Digite o tempo percorrido: ");
//       sVeloc_rua = JOptionPane.showInputDialog(null,"Digite a velocidade máxima da rua: ");
//       
//       dista = Double.parseDouble(sDista);
//       tempo = Double.parseDouble(sTempo);
//       veloc_rua = Double.parseDouble(sVeloc_rua);
//       
//       veloc_carro = dista / tempo;
//       
//       if((veloc_rua <= 10) && (veloc_carro > 10)) {
//           JOptionPane.showMessageDialog(null,"Você ultrapassou a velocidade de 10Km/h e vai levar uma multa de R$50,00 reais");     
//       }
//       else if((((veloc_rua >= 11) || (veloc_rua <=30) && (veloc_carro > 30) || (veloc_carro < 31)))){
//           JOptionPane.showMessageDialog(null,"Você ultrapassou a velocidade entre 11Km/h e 30Km/h e vai levar uma multa de R$100,00 reais");
//       }
//       else {
//           JOptionPane.showMessageDialog(null,"Você ultrapassou a velocidade de 31Km/h e vai ser multado com R$300,00 reais");
//       }
       
       //ñ sei se está certo
       
       
       //
            
            
    //Ler 3 valores em qualquer ordem e escrever elesem ordem crescente;
    
//    int v1, v2, v3;
//    String sV1, sV2, sV3;
//    
//            sV1 = JOptionPane.showInputDialog(null,"Digite o 1º valor: ");
//            sV2 = JOptionPane.showInputDialog(null,"Digite o 2º valor: ");
//            sV3 = JOptionPane.showInputDialog(null,"Digite o 2º valor: ");
//           
//            v1 = Integer.parseInt(sV1);
//            v2 = Integer.parseInt(sV2);
//            v3 = Integer.parseInt(sV3);
//            
//            if(((v1 <= v2) && (v1 <= v3) && (v2 <= v3))){
//            JOptionPane.showMessageDialog(null,"A ordem crescente é: " + v1 + ", " + v2 + ", " + v3);
//            }
//            else if (((v1 <= v2) && (v1 <= v3) && (v3 <= v2))){
//               JOptionPane.showMessageDialog(null,"A ordem crescente é: " + v1 + ", " + v3 + ", " + v2); 
//            }
//            else if (((v2 <= v1) && (v2 <= v3) && (v1 <= v2))){
//               JOptionPane.showMessageDialog(null,"A ordem crescente é: " + v2 + ", " + v1 + ", " + v3); 
//            }
//            else if (((v2 <= v1) && (v2 <= v3) && (v3 <= v1))){
//               JOptionPane.showMessageDialog(null,"A ordem crescente é: " + v2 + ", " + v3 + ", " + v1); 
//            }
//            else if (((v3 <= v1) && (v3 <= v1) && (v1 <= v2))){
//               JOptionPane.showMessageDialog(null,"A ordem crescente é: " + v3 + ", " + v1 + ", " + v2); 
//            }
//            else if (((v3 <= v1) && (v3 <= v2) && (v2 <= v1))){
//               JOptionPane.showMessageDialog(null,"A ordem crescente é: " + v3 + ", " + v2 + ", " + v1); 
//            }
//            else{
//                JOptionPane.showMessageDialog(null,"Os números " + v1 + ", " + v2 + ", " + v3 + " não estão em ordem crescente");
//            }
//            
// Escrever se um ano informado pelo usuário é
//bissexto ou não. Um ano é bissexto quando é
//(divisível por 400) ou é (divisível por 4 e não por
//100);
        
//        int ano;
//        String sAno;
//        
//        sAno = JOptionPane.showInputDialog(null, "Digite o ano: ");
//        ano = Integer.parseInt(sAno);
//        
//       
//        if(((ano/4==0) && (ano/100!=0) || (ano/400==0))){
//        //if(((ano / 400 == 0) && (ano / 4 == 0) || (ano / 100!= 0))){
//            JOptionPane.showMessageDialog(null,"Ano Bissexto");
//        }
//        else {
//            JOptionPane.showMessageDialog(null,"Não é Bissexto");
//        }
//   

//    Ler 2 valores fracionários e perguntar qual
//operação aritmética o usuário quer fazer com
//eles. Usar switch..case. Informar o resultado da
//operação.

//    double num1, num2, operac_arit, adc, sub, mult, div;
//    String sNum1, sNum2, sOperac_arit;
//    
//    sNum1 = JOptionPane.showInputDialog(null,"Digite o 1º número fracionário: ");
//    sNum2 = JOptionPane.showInputDialog(null,"Digite o 2º número fracionário: ");
//    sOperac_arit = JOptionPane.showInputDialog(null,"Digite 1(Adição), 2(Subtração), 3(Multiplicação), 4(Divisão)");
//    
//    num1 = Double.parseDouble(sNum1);
//    num2 = Double.parseDouble(sNum2);
//    operac_arit = Double.parseDouble(sOperac_arit);
//    
//    
//    if(operac_arit == 1){
//        adc = num1 + num2;
//        JOptionPane.showMessageDialog(null,"A soma de " + num1 + " + " + num2 + " = " + adc);
//    }
//    else if(operac_arit == 2){
//        sub = num1 - num2;
//        JOptionPane.showMessageDialog(null,"A subtração de " + num1 + " - " + num2 + " = " + sub);
//    }
//     else if(operac_arit == 3){
//        mult = num1 * num2;
//        JOptionPane.showMessageDialog(null,"A multiplicação de " + num1 + " * " + num2 + " = " + mult);
//    }
//     else if(operac_arit == 4){
//        div = num1 / num2;
//        JOptionPane.showMessageDialog(null,"A divisão de " + num1 + " / " + num2 + " = " + div);
//    }
//     else{
//         JOptionPane.showMessageDialog(null,"Você não digitou os números determinados no enunciado");
//     }

//    double num1, num2, adc, sub, mult, div;
//    int operacao;
//    String sNum1, sNum2, sOperacao;
//    
//    sNum1 = JOptionPane.showInputDialog(null,"Digite o 1º número fracionário: ");
//    sNum2 = JOptionPane.showInputDialog(null,"Digite o 2º número fracionário: ");
//    sOperacao = JOptionPane.showInputDialog(null,"Digite 1(Adição), 2(Subtração), 3(Multiplicação), 4(Divisão): ");
//    
//    num1 = Double.parseDouble(sNum1);
//    num2 = Double.parseDouble(sNum2);
//    operacao = Integer.parseInt (sOperacao);
//
//    switch (operacao){
//        case 1:
//            adc = num1 + num2;
//            JOptionPane.showMessageDialog(null,"A soma de " + num1 + " + " + num2 + " = " + adc);
//        break;
//        
//        case 2:
//            sub = num1 - num2;
//            JOptionPane.showMessageDialog(null,"A subtração de " + num1 + " - " + num2 + " = " + sub);
//        break;
//        
//        case 3:
//            mult = num1 * num2;
//            JOptionPane.showMessageDialog(null,"A multiplicação de " + num1 + " * " + num2 + " = " + mult);
//        break;
//        
//        case 4:
//            div = num1 / num2;
//            JOptionPane.showMessageDialog(null,"A divisão de " + num1 + " / " + num2 + " = " + div);
//        break;
//        
//        default:
//            JOptionPane.showMessageDialog(null,"Operação Desconhecida!"); 
//        
//    }
            
    }
    
}
