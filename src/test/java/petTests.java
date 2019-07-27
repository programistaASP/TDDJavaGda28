import org.junit.Ignore;
import org.junit.Test;

public class petTests {
    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void setName_emptyName_IllegalArgumentExpetion() {
        final Pet pet = new Pet();
        pet.setName("");
    }
}
