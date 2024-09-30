package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car blackCar = new Car();

        blackCar.start();
        blackCar.start();
        blackCar.stop();
        System.out.println("O valor do tacómetro é: " + blackCar.tachometer);
        blackCar.start();
        blackCar.accelerate();
        blackCar.stop();
        for (int i = 0; i < 12; i++)
        {
            blackCar.accelerate();
            System.out.println(blackCar.speedometer);
        }
        for (int i = 0; i < 13; i++)
        {
            blackCar.brake();
            System.out.println(blackCar.speedometer);
        }
        blackCar.turnAngleOfWheels(20);
        System.out.println(blackCar.wheelsAngle);
        blackCar.stop();
        blackCar.start();
        blackCar.setReverse(blackCar.isReverse());
        blackCar.setReverse(blackCar.isReverse());
        blackCar.accelerate();
        blackCar.setReverse(blackCar.isReverse());
    }

}