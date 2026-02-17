package AbstractAndInterface.Interface;

public class Car {

    private NewEngine engine;
    private CD cd = new CD();

    Car(){
        this.engine=new NewEngine();
    }

    void start(){
        engine.start();
    }

    void stop(){
        engine.stop();
    }

    void accelerate(){
        engine.accelerate();
    }

    void playMusic(){
        cd.start();
    }

    void stopMusic(){
        cd.stop();
    }

    void test(){
        CDplayer.check();
    }



}
