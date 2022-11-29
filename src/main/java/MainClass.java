import model.Cat;
import model.Dog;
import repo.CatRepo;
import repo.DogRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        CatRepo catRepo = new CatRepo();
        DogRepo dogRepo = new DogRepo();
        AtomicInteger counter = new AtomicInteger();
        List<Cat> catList = new ArrayList< >();
        List <Dog> dogList = new ArrayList < > ();
        List < Integer > numbers = Stream.iterate(1, e -> e + 1)
                .limit(20)
                .collect(Collectors.toList());
        Collection< List < Integer >> partitionedListOfNumbers = numbers.stream()
                .collect(Collectors.groupingBy(num -> counter.getAndIncrement() / 5))
                .values(); //Split the list into lists of size 5
        partitionedListOfNumbers.stream()
                .forEach(list -> {
                        List < Cat > interimCatList = catRepo.fetchCats(list); //Cat list to be fetched from the database
        catList.addAll(interimCatList);
        List < Dog > interimDogList = dogRepo.fetchDogs(list); //Dog list to be fetched from database
        dogList.addAll(interimDogList);
    });
    }
}
