package repo;

import model.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CatRepo {

    public List<Cat> fetchCats(List<Integer> list){
        return Arrays.asList(
                new Cat(1,"Latte","Black",1),
                new Cat(2,"Patch","Black",1),
                new Cat(3,"Ms Sophisticated","White",2),
                new Cat(4,"Mrs Privateclaws","White",3),
                new Cat(5,"Panda","Black",1),
                new Cat(6,"Sundae","White",1),
                new Cat(7,"Alyson","White",1),
                new Cat(8,"Minnie","Black",1),
                new Cat(9,"Flame","Black",1),
                new Cat(10,"Mrs Soundlickle","White",1),
                new Cat(11,"Puffin","Black",1),
                new Cat(12,"Clawdia","White",4),
                new Cat(13,"Dice","Black",4),
                new Cat(14,"Ms Amazing","White",2),
                new Cat(15,"Domino","White",3),
                new Cat(16,"Ms Impressive","White",3),
                new Cat(17,"Peppermint","Black",3),
                new Cat(18,"Mocha","White",2),
                new Cat(19,"Ms Awful","White",2),
                new Cat(20,"Mrs Awesometoes","Black",2)
        ).stream()
                .filter(c -> list.contains(c.getId()))
                .collect(Collectors.toUnmodifiableList());
    }
}
