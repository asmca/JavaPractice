package AgileDev.chapter5;

import junit.framework.*;


public class TestPrimeGenerator  extends TestCase{
    public static void main(String[] args) {
        junit.swingui.TestRunner.main(
                new String[] {"TestGeneratePrimes"}
        );
    }

    public TestPrimeGenerator(String name){
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

    public void testExhaustive() {

        for (int i = 2; i < 500; i++) {
            verifyPrimeList(PrimeGenerator.generatePrimes(i));
        }
    }

    private void verifyPrimeList(int[] list){
        for (int i = 0; i < list.length; i++) {
            verifyPrime(list[i]);
        }
//        for (int i = 0; i < list.length; i++) {
//            verifyPrime(list[i]);
//        }
    }

    private void verifyPrime(int n){

        for (int factor = 2; factor < n; factor++) {

            assert(n%factor !=0);
        }

    }




}