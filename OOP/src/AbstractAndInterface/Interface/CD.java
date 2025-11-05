package AbstractAndInterface.Interface;

public class CD implements CDplayer{
    @Override
    public void start() {
        System.out.println("media started");
    }

    @Override
    public void stop() {
        System.out.println("Media stopped");
    }


}
