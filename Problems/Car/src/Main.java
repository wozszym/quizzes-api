import static java.lang.Integer.max;

class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        speed += 5;
    }

    void brake() {
        speed -= 5;
        speed = max(speed, 0);
    }
}