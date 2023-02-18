public class Main {
    public static void main(String[] args) {

        /**
         * Задачи с семинара
         */
        Car car_1 = new Car("Range Rover", 2021, 9500000, "red", 309);
        car_1.getInfo();
//        car_1.road("Шри-Ланка");
//        car_1.startCar();
//        car_1.road("Шри-Ланка");
//        car_1.stopCar();

        /**
         * Задаём параметры новой машине car_2
         */
        Car car_2 = new Car("BMW X5", 2020, 7856000, "blue", 275);
        car_2.getInfo();

        /**
         * Сравниваем мощность первой машины со второй
         */
        car_1.comparePower(car_2);

        /**
         * Присводила другое значение static distance
         */

        Car.distance = 7000;

        /**
         * Выводим время, за которое 2 машины проехали заданное расстояние distance (метод raceTime()), срваниваем результаты и
         * объявляем победителя.
         */


        double time_1 = car_1.raceTime();
        double time_2 = car_2.raceTime();


        System.out.println("Среднее время гонки машины " + car_1.getModel() + " составляет: " + time_1 + " секунд.");
        System.out.println("Среднее время гонки машины " + car_2.getModel() + " составляет: " + time_2 + " секунд.");
        if (time_1 - time_2 > 0) {
            System.out.println("В гонке победила машина: " + car_2.getModel() + "!");
        }
        else {
            System.out.println("В гонке победила машина: " + car_1.getModel() + "!");
        }
    }
}