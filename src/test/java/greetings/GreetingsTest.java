package greetings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingsTest {
    @Test
    public void shouldGreetKagiso() {
      GreetMethods greet = new GreetMethods() ;
      greet.greetUser("kagiso" ,"english");
      assertEquals(1, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldGreetKagisoInFrench() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"french");
        assertEquals(1, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldGreetKagisoInSpanish() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"spanish");
        assertEquals(1, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldGreetByDefault() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"Jiberish");
        assertEquals(1, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldGreetMultipleUsers() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"spanish");
        greet.greetUser("zola" ,"french");
        greet.greetUser("charl" ,"english");
        greet.greetUser("sivu" ,"jiberish");
        assertEquals(4, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldNotCountForDuplicates() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"spanish");
        greet.greetUser("kagiso" ,"french");
        greet.greetUser("kagiso" ,"english");
        greet.greetUser("zola" ,"french");
        greet.greetUser("charl" ,"english");
        greet.greetUser("sivu" ,"jiberish");
        assertEquals(4, greet.allGreetedUsersCounter());
    }


    @Test
    public void shouldReturnAllGreetedUsersAndCounter() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"english");
        greet.greetUser("charl" ,"english");
        greet.greetUser("sivu" ,"jiberish");
        greet.greetedUsers();
        assertEquals(3, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldClearAllTheUsersGreeted() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"english");
        greet.greetUser("charl" ,"english");
        greet.greetUser("sivu" ,"jiberish");
        greet.clearAll();
        assertEquals(0, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldReturnCounterForASpecificUser() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"english");
        greet.greetUser("kagiso" ,"french");
        greet.greetUser("charl" ,"english");
        greet.greetUser("kagiso" ,"spanish");
        greet.greetUser("sivu" ,"jiberish");
        greet.userCounter("kagiso");
        assertEquals(3, greet.allGreetedUsersCounter());
    }
    @Test
    public void shouldClearSpecifiedUser() {
        GreetMethods greet = new GreetMethods() ;
        greet.greetUser("kagiso" ,"english");
        greet.greetUser("kagiso" ,"french");
        greet.greetUser("charl" ,"english");
        greet.greetUser("kagiso" ,"spanish");
        greet.greetUser("sivu" ,"jiberish");
        greet.clearUserData("kagiso");
        assertEquals(2, greet.allGreetedUsersCounter());
    }


}
