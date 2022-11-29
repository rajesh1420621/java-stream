package model;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericModelTest<T> {

    private T t;

    public GenericModelTest(T t) {
        this.t = t;
    }

    public void constructorTest(){
        Arrays.asList(t.getClass().getConstructors())
                .stream()
                .forEach(con -> {
                    List<Object> objects = new ArrayList<>();
                    Arrays.asList(con.getParameterTypes())
                            .stream()
                            .forEach(p -> {
                                System.out.println(p.getName());
                                if (p.getName().equals("int"))
                                    objects.add(1);
                                else if (p.getName().equals("java.lang.String"))
                                    objects.add("Test");
                            });
                    try {
                        con.newInstance(objects.toArray());
                    } catch (InstantiationException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public void setterTest(){
        Arrays.asList(t.getClass().getDeclaredMethods())
                .stream()
                .filter(m -> m.getName().startsWith("set"))
                .forEach(m -> {
                    List<Object> objects = new ArrayList<>();
                    Arrays.asList(m.getParameterTypes())
                            .stream()
                            .forEach(p -> {
                                if (p.getTypeName().equals("int"))
                                    objects.add(1);
                                else if (p.getTypeName().equals("java.lang.String"))
                                    objects.add("Test");
                            });
                    try {
                        m.invoke(t,objects.toArray());
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public void getterTest(){
        Arrays.asList(t.getClass().getDeclaredMethods())
                .stream()
                .filter(m -> m.getName().startsWith("get"))
                .forEach(m -> {
                    System.out.println(m.getName());
                    try {
                        m.invoke(t);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
