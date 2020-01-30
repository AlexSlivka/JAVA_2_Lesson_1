package Marafon;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Peter"),
                new Robot("Bender"),
                new Cat("Barsik")
        };
        Obstacle[] obstacles = {
                new Treadmill(1000),
                new Wall(5)
        };

        for (Competitor c:competitors) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }
        for (Competitor c:competitors ) {
            c.info();
        }

    }
}
