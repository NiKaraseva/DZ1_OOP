public class Car {
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status;
    int distance;

    /**
     * Создала и объявила значение distance
     */

    Car(String model, int year, double price, String color, int power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        status = false;
        distance = 5000;
    }

    public void getInfo() {
        System.out.println("Модель автомобиля: " + model + ", мощность двигателя: " + power + ", год выпуска: " + year);
    }

    public void startCar() {
        status = true;
        System.out.println("Автомобиль заведён, можем ехать!");
    }

    public void stopCar() {
        status = false;
        System.out.println("Автомобиль остановлен, никуда больше не поедем.");
    }

    public void road(String destination) {
        if (!status) {
            System.out.println("Авто не заведён, ехать не можем :(");
        }
        else {
            System.out.println("Авто заведён, едем по адресу: " + destination + ", на марке автомобиля: " + model + ".");
        }
    }


    /**
     * Создала метод getModel и getPower (пригодился в методах comparePower() и raceTime())
     */
    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    /**
     * Метод сравнения 1-ой машины со второй по пораметру Power
     */
    public void comparePower(String car2_model, int car2_power) {
        if (getPower() > car2_power) {
            System.out.println("Машина " + getModel() + " мощнее машины " + car2_model + " на " + (getPower()-car2_power) + " лошадиных силы.");
        }
        else {
            System.out.println("Машина " + car2_model + " мощнее машины " + getModel() + " на " + (car2_power-getPower()) + " лошадиных силы.");
        }
    }

    /**
     * Метод, считающий, за какое количество времени машина проедет расстояние distance (скорость задаём рандомом через каждые 100 метров)
     */

    public double raceTime() {
        double sumTime = 0;
        int count = 10;
        double averageTime = 0;
        for (int i = 0; i < distance; i+=100) {
            double speed = (int)(80 + Math.random() * 420);
            double time = distance / speed;
            sumTime += time;
            }
        averageTime = sumTime / count;
        double scale = Math.pow(10, 2);
        double result = Math.ceil(averageTime * scale) / scale;
        return result;
        }

    }


