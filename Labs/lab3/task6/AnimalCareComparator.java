package task6;

import java.util.Comparator;

public class AnimalCareComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getCare(), a2.getCare());
    }
}