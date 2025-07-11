package com.vetias.java.workshop.basics.string.lambda;

public class TestSquaretext {
    @Test
   public void testSquare() {
    Square square=(int x) -> x*x;
    Assertions.assertEquals(36, square.findSquare(6));

   }


 