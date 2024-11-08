package test;

import org.testng.annotations.*;

public class SauceDemo {

    @BeforeTest
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void test(){
        System.out.println("test");
    }

    @Test
    public void test1(){
        System.out.println("test2");
    }

    @AfterTest
    public void afterMethod(){
        System.out.println("After Method");
    }
}
