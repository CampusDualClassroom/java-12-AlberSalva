package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;
    public Car(String brand, String model, String fuel) {
    }

    public Car() {
    }

    public boolean isTachometerGreaterThanZero() {
        if (this.tachometer > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTachometerEqualToZero() {
        if (this.tachometer == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void start() {
        if (isTachometerEqualToZero()){
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.speedometer <= 110) {
            this.speedometer += 10;
        } else if (this.speedometer > 110 & this.speedometer < 120) {
            this.speedometer += (120 - this.speedometer);
        } else if (this.speedometer >= MAX_SPEED) {
            System.out.println("A velocidade xa é a máxima");
        }
    }

    public void brake() {
        if (this.speedometer >= 10) {
            this.speedometer -= 10;
        } else if (this.speedometer > 0 & this.speedometer < 10 ) {
            this.speedometer -= (this.speedometer);
        } else if (this.speedometer <= 0) {
            System.out.println("A velocidade xa é 0");
        }
    }

    public void turnAngleOfWheels(int angle) {
        int initialAngle = this.wheelsAngle;
        int currentAngle = initialAngle + angle;
        if ((currentAngle >= -45) & (currentAngle <= 45)) {
            this.wheelsAngle = currentAngle;
        } else if (currentAngle < -45) {
            this.wheelsAngle = -45;
        } else if (currentAngle > 45) {
            this.wheelsAngle = 45;
        }
    }

    public String showSteeringWheelDetail() {
        String detail = "";
        return detail;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (isReverse() & speedometer == 0) {
            this.reverse = !isReverse();
            this.gear = "N";
        } else if (!this.reverse & speedometer == 0) {
            this.reverse = !isReverse();
            this.gear = "R";
        }
    }

    public void showDetails() {

    }

    public static void main(String[] args) {

    }
}
