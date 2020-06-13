import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private User user =null;
    private User user1= new User("john12","test123","test@test.com");
    private List<String> createList (String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    private User user2= new User("john12","test123","test@testcom");
    private User user3= new User("john12","test123",null);
    private User user4= new User(null,"test123","testtestcom");
    private User user5= new User("john12","test123","testtest.com");
    private User user6= new User(null,"test123",null);
    private User user7= new User("john12","test123","testtestcom");
    @Test
    void function() {

    }
    @Test
    void everyStatement(){
        assertTrue(new SILab2().function(user1,createList("marko1","doritos")));
        assertFalse(new SILab2().function(null,createList("marko1","doritos")));
    }
    @Test
    void multipleCondition(){
        assertFalse(new SILab2().function(user2,createList("john12","doritos")));
        assertFalse(new SILab2().function(user2,createList("marko","doritos")));
        assertFalse(new SILab2().function(user3,createList("marko","doritos")));
        assertFalse(new SILab2().function(user3,createList("john12","doritos")));
        assertFalse(new SILab2().function(user4,createList("marko","doritos")));
        assertFalse(new SILab2().function(user4,createList("john12","doritos")));
        assertFalse(new SILab2().function(user6,createList("marko","doritos")));
        assertFalse(new SILab2().function(user5,createList("marko","doritos")));
        assertFalse(new SILab2().function(user7,createList("marko","doritos")));
    }

}