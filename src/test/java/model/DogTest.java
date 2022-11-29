package model;

import org.junit.Test;

public class DogTest {

    @Test
    public void testGettersAndSetters(){
        Dog dog = new Dog();
        GenericModelTest genericModelTest = new GenericModelTest(dog);
        genericModelTest.constructorTest();
        genericModelTest.getterTest();
        genericModelTest.setterTest();
    }
}
