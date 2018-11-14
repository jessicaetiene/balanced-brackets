package br.com.teste.balancedbrackets;

import java.util.Scanner;

/**
 * Implementação da regra para validar os 'brackets'
 * @author Novembro/2018: Jessica Etiene Marques Almeida
 */
public class Brackets
{
   public static final String VALID = "Is valid";
   public static final String INVALID = "Is not valid";

   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);

      System.out.println("Digita uma sequência aqui -> ");
      String s = in.nextLine();

      if (s.isEmpty()){
         System.out.println(INVALID);
      } else {

         System.out.println(removePar(s) ? VALID : INVALID);

      }

   }


   /**
    * Remove os pares aceitos na string
    * @param sequencia
    * @return true - caso seja uma sequência valida false - caso a sequência seja inválida
    */
   public static boolean removePar(String sequencia){

      //Se a string tiver alguma ocorrência de (), [] ou {}, o par será retirado da string
      if (sequencia.contains("()") || sequencia.contains("[]") ||  sequencia.contains("{}")) {

         sequencia = sequencia.replace("()", "");
         sequencia = sequencia.replace("[]", "");
         sequencia = sequencia.replace("{}", "");

         //Se todos os pares forem removidos a sequência é válida
         if (sequencia.isEmpty()){
            return true;
         }

         //Senão continua removendo os pares
         return removePar(sequencia);
      }


      //Se nenhum par for encontrado a sequência é inválida
      return false;
   }
}
