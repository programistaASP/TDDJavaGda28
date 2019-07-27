import org.junit.Assert;
import org.junit.Test;

public class ZooTests {
    @Test
    public  void getPetNames_AddOneFafik_Fafik() {
        final String expected = "Fafik";
        final Pet pet = new Pet();
        pet.setName("Fafik");
        final Zoo zoo = new Zoo();
        zoo.giveHomelessPet(pet);

        final  String actual = zoo.getPetNames();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nullPet() {
        final String expected = "";
        final Zoo zoo = new Zoo();
        final Pet nullpet = null;
        zoo.giveHomelessPet(nullpet);
        zoo.getPetNames();

    }
    @Test(expected = IllegalArgumentException.class)
    public  void giveHomelessPet_null_IllegalArgumentException() {
        final Zoo zoo = new Zoo();
        final Pet pullpet = null;
        zoo.giveHomelessPet(pullpet);

    }
    @Test
    public void getPetNames_petWithoutName_EmptyString(){
        final String expected = "";
        final Zoo zoo = new Zoo();
        final Pet pet = new Pet();
        zoo.giveHomelessPet(pet);
        final String actual = zoo.getPetNames();

        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void getPetNames_petWithoutName_IllegalArgumentExpection(){
        final Zoo zoo = new Zoo();
        final Pet pet = new Pet();
        pet.setName("");
        zoo.giveHomelessPet(pet);
        zoo.getPetNames();
    }
    @Test
    public void takePetNames_removeNotPresentElement() {
       final String expected = "";
       final Zoo zoo = new Zoo();
       final Pet pet = new Pet();
       zoo.takePet(pet);

       final String actual = zoo.getPetNames();
       Assert.assertEquals(expected, actual);
    }
    @Test
    public void getPetNames_AddTwoElementsRemoveThree() {
        final String expected = "" ;
        final Zoo zoo = new Zoo();
        final Pet pet = new Pet();
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);
        zoo.takePet(pet);
        zoo.takePet(pet);
        zoo.takePet(pet);
        final String actual = zoo.getPetNames();
        Assert.assertEquals(expected, actual);
    }

}
