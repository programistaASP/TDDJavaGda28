import org.junit.*;

public class CalculatorTests {
    private static double delta;

    @BeforeClass
    public static void setup() {
        delta = 0.001;
    }
    @AfterClass
    public static void tearDown(){
        delta = 0.0;
    }
    @Test
    public void sum_a6b7_13() {

        //Arrange/Given
        final double expected = 20;

        Calculator calculator = new Calculator();

        //Act/When
        final double actual = calculator.sum(7,13);

        //Assert/Then
        Assert.assertEquals(expected,actual, delta);
    }
   @Test
    public void substraction_a5b__10_15() {
        final double expected = 15;
        Calculator calculator = new Calculator();
        final double actual = Calculator.substraction(5, -10);
        Assert.assertEquals(expected,actual,delta);
    }
    @Test
    public void multiplay_a5b5_25() {
        final double expected = 25;
        final double actual = Calculator.multiply(5,5);
        Assert.assertEquals(expected,actual,delta);
    }

}
