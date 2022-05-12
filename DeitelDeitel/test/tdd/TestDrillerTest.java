package tdd;



import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDrillerTest {

    @Test
    @DisplayName("1-4 number of copies sold at rate 2_000")
    public void testDrillerTest(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(4);
        assertEquals(8_000, product);
    }
    @Test
    @DisplayName("5-9 number of copies sold at rate 1_800")
    public void  testDriller2(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(9);
        assertEquals(16_200, product);
    }
    @Test
    @DisplayName("10-29 number of copies sold at rate 1_600")
    public void testDriller3(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(29);
        assertEquals(46_400, product);
    }
    @Test
    @DisplayName("30-49 number of copies sold at rate 1_500")
    public void testDriller4(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(49);
        assertEquals(73_500, product);
    }
    @Test
    @DisplayName("50-99 number of copies sold at rate 1_300")
    public void testDriller5(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(99);
        assertEquals(128_700, product);
    }
    @Test
    @DisplayName("100-199 number of copies sold at rate 1_200")
    public void testDriller6(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(199);
        assertEquals(238_800, product);
    }
    @Test
    @DisplayName("200-499 number of copies sold at rate 1_100")
    public void testDriller7(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(499);
        assertEquals(548_900, product);
    }
    @Test
    @DisplayName("500 and above number of copies sold at rate 1_000")
    public void testDriller8(){
        TestDriller calculate = new TestDriller();
        int product = calculate.product(500);
        assertEquals(500_000, product);
    }
}
