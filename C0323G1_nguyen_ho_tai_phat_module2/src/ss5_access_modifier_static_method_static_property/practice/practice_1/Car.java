package ss5_access_modifier_static_method_static_property.practice.practice_1;

import ss4_class_and_object_in_array.exercise.exercise_3.Fan;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    static {
    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }


}
