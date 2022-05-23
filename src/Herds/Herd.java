package Herds;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd = new ArrayList<>();

    @Override
    public String toString() {
        String location = "";
        for (Movable movable : herd) {
            location += (movable.toString() + "\n") ;
        }
        return location;
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    public void move(int dx, int dy) {

    }
}
