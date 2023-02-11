
package as;

import java.util.Arrays;

public class As {

  
    public static void main(String[] args) {
          int[] num = new int[100];
    
    //Preenche o Array com um valor
    Arrays.fill(num, -1);
    
    //Para saber o tamanho do vetor se usa o Length
    for(int pos = 0; pos < num.length; pos++){
        System.out.println(num[pos]);  
    }
    System.out.println(num.length);
    }
    
}
