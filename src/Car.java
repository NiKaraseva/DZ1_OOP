public class Car {
    private String model;
    private int year;
    private double price;
    private String color;
    private int power;
    private boolean status;
    protected static int distance;


    /**
     * Вынесла значение static отдельно
     */

    static {
        distance = 5000;
    }


    /**
     * Создала конструктор (1 со значениями и 1 дефолтный)
     */

    Car(String model, int year, double price, String color, int power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        status = false;
    }

    Car() {
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
     * Создала геттеры и сеттеры (пригодился в методах comparePower() и raceTime())
     */
    public String getModel() {
        return model;
    }

    public void setModel(String modelSet) {
        this.model = modelSet;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int powerSet) {
        this.power = powerSet;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearSet) {
        this.year = yearSet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int priceSet) {
        this.price = priceSet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorSet) {
        this.color = colorSet;
    }


    /**
     * Метод сравнения 1-ой машины со второй по пораметру Power (изменила метод на более правильны)
     */
    public void comparePower(Object car2) {
        if (getPower() > ((Car) car2).getPower()) {
            System.out.println("Машина " + getModel() + " мощнее машины " + ((Car) car2).getModel() + " на " + (getPower()-((Car) car2).getPower()) + " лошадиных силы.");
        }
        else {
            System.out.println("Машина " + ((Car) car2).getModel() + " мощнее машины " + getModel() + " на " + (((Car) car2).getPower()-getPower()) + " лошадиных силы.");
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


