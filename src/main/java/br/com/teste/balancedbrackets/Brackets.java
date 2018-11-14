package br.com.teste.balancedbrackets;

import java.util.Scanner;

/**
 * Implementação da regra para validar os 'brackets'
 * @author Novembro/2018: Jessica Etiene Marques Almeida
 */
public class Brackets
{
   public static final String VALID = "is valid";
   public static final String INVALID = "is not valid";

   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();

      if (s.isEmpty()){
         System.out.println(INVALID);
      } else {

         System.out.println(removePar(s) ? VALID : INVALID);

      }

   }


   /**
    * Remove os pares aceitos na string
    * @param s
    * @return true - caso seja uma sequência valida false - caso a sequência seja inválida
    */
   public static boolean removePar(String s){
      String original = s;

      original = original.replace("()", "");
      original = original.replace("[]", "");
      original = original.replace("{}", "");


      if (original.isEmpty()){
         return true;
      } else if (!original.contains("()") && !original.contains("[]") && !original.contains("{}")) {
         return false;
      }

      return removePar(original);
   }
}
