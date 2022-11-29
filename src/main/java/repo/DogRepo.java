package repo;

import model.Dog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DogRepo {

    public List<Dog> fetchDogs(List<Integer> list){
        return Arrays.asList(
                new Dog(1,"Max","Brown",2),
                new Dog(2,"Charlie","Black",2),
                new Dog(3,"Cooper","White",2),
                new Dog(4,"Milo","White",3),
                new Dog(5,"Teddy","Black",4),
                new Dog(6,"Leo","Black",2),
                new Dog(7,"Stella","Black",2),
                new Dog(8,"Bailey","Black",2),
                new Dog(9,"Lola","Black",2),
                new Dog(10,"Zoe","Black",2),
                new Dog(11,"Lily","Black",2),
                new Dog(12,"Lucy","Black",2),
                new Dog(13,"Daisy","Black",2),
                new Dog(14,"Bella","Black",2),
                new Dog(15,"Luna","Black",2),
                new Dog(16,"Monka","Black",2),
                new Dog(17,"Tohru","Black",2),
                new Dog(18,"Frederico","Black",2),
                new Dog(19,"Beige","Black",2),
                new Dog(20,"Cassini","Black",2),
                new Dog(21,"Mossberg","Black",2),
                new Dog(22,"Mirabel","Black",2),
                new Dog(23,"Kyna","Black",2)
        ).stream()
                .filter(d -> list.contains(d.getId()))
                .collect(Collectors.toUnmodifiableList());
    }
}
