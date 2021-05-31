package greetings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingsTest {
    @Test
    public void shouldGreetKagiso() {
      GreetMethods greet = new GreetMethods() ;
      greet.greetUser("greet" ,"kagiso");
      assertEquals(1, greet.allGreetedUsersCounter());
    }
//    @Test
//    public void shouldGreetKagisoInFrench() {
//        GreetMethods greet = new GreetMethods() ;
//        greet.greetUser("greet" ,"kagiso", "french");
//        assertEquals(1, greet.allGreetedUsersCounter());
//    }


}
