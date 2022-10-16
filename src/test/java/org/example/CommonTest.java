package org.example;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CommonTest {

    @Test
    public String stringTest(){
        AssertionError assertionError = new AssertionError();
        assertionError.getMessage();
        return "error";
    }
}
