package model;

import org.junit.Test;

public class CatTest {

    @Test
    public void testGettersAndSetters(){
        Cat cat = new Cat();
        GenericModelTest genericModelTest = new GenericModelTest(cat);
        genericModelTest.constructorTest();
        genericModelTest.getterTest();
        genericModelTest.setterTest();
    }
}
