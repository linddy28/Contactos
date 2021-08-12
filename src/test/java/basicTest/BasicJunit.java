package basicTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicJunit {
    //setup - initialize
    @BeforeEach
    public void setup(){
        System.out.println("before");
    }
    //cleaup -  teardown
    @AfterEach
    public void cleanup(){
        System.out.println("after");
    }

    @Test
    public void thisIsATest(){
        System.out.println("TESTTT2");
    }
}
