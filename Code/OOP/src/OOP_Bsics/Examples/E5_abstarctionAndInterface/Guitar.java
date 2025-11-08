package OOP_Bsics.Examples.E5_abstarctionAndInterface;

public class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Guitar being played");
    }

    @Override
    public void stop() {
        System.out.println("Guitar is not being played");
    }
}
