import org.junit.*;
import org.junit.rules.ExpectedException;



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
    @Test
    public void exception_test_byTryCatch() {
        try{
            Calculator.divide(10,0);
            Assert.fail();
        }catch (Exception e){
            return;
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void exception_test_byExpectedAnnotation(){
         Calculator.divide(1,0);
    }
    @Rule
    public ExpectedException expectionHandler = ExpectedException.none();

    @Test
    public void expection_test_byRule() {
        expectionHandler.expect(IllegalArgumentException.class);
        Calculator.divide(1,0);
    }

}
