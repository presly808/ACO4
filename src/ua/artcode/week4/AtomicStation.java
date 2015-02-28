package ua.artcode.week4;

/**
 * Created by serhii on 28.02.15.
 */
public final class AtomicStation {

    //must have value and can not changed
    private final int criticalTemperature;
    private String name;

    public AtomicStation() {
        this.criticalTemperature = 70;
    }

    public AtomicStation(int criticalTemperature, String name) {
        this.criticalTemperature = criticalTemperature;
        this.name = name;
    }

    public final void start(int temperature){
        if(temperature < criticalTemperature){
            System.out.println("Start station");
        } else {
            System.out.println("can not start");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCriticalTemperature() {
        return criticalTemperature;
    }

}
