package AgileDev.chapter5;

import junit.framework.*;


public class TestGeneratePrimes_v0 extends TestCase{
    public static void main(String[] args) {
        junit.swingui.TestRunner.main(
                new String[] {"TestGeneratePrimes"}
        );
    }

    public TestGeneratePrimes_v0(String name){
        super( name);
    }

    public void testPrimes(){
        int[] nullArray = GeneratePrimes_v0.generatePrimes(0);
        assertEquals(nullArray.length, 0);

        int[] minArray = GeneratePrimes_v0.generatePrimes(2);
        assertEquals(minArray.length, 1);
        assertEquals(minArray[0], 2);


        int[]threeArray = GeneratePrimes_v0.generatePrimes(3);
        assertEquals(threeArray.length, 2);
        assertEquals(threeArray[0], 2);
        assertEquals(threeArray[1], 3);
//        assertEquals(threeArray[1], 5);

        int[] centArray = GeneratePrimes_v0.generatePrimes(100);
        assertEquals(centArray.length, 25);
        assertEquals(centArray[24], 97);
    }

}