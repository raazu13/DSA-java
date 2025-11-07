package AbstractAndInterface.Interface;

public class NewEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine Accelerated");
    }
}
