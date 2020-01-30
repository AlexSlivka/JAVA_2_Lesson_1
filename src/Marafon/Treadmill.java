package Marafon;

public class Treadmill extends Obstacle {
    private int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lenght);
    }
}
