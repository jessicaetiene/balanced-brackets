package br.com.teste.balancedbrackets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Cenários de testes para o Balanced Brackets
 * @author Novembro/2018: Jessica Etiene Marques Almeida
 */
class BracketsTest
{


   /**
    * Teste para uma string de tamanho ímpar
    */
   @Test
   void testeParaStringImpar()
   {
      boolean b = Brackets.removePar("(){");
      Assertions.assertFalse(b);
   }


   /**
    * Teste para o valor (){}[] - is valid
    */
   @Test
   void testeValidoUm()
   {
      boolean b = Brackets.removePar("(){}[]");
      Assertions.assertTrue(b,"Is not valid");
   }


   /**
    * Teste para o valor [{()}](){} - is valid
    */
   @Test
   void testeValidoDois()
   {
      boolean b = Brackets.removePar("[{()}](){}");
      assertTrue(b,"Is not valid");
   }

   /**
    * Teste para o valor []{() - is not valid
    */
   @Test
   void testeInvalidoUm()
   {
      boolean b = Brackets.removePar("[]{()");
      assertFalse(b,"Is valid");
   }


   /**
    * Teste para o valor [{)] - is not valid
    */
   @Test
   void testeInvalidoDois()
   {
      boolean b = Brackets.removePar("[{)]");
      assertFalse(b,"Is valid");
   }
}