import Transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2.2");
        Car car1 = new Car("Lada","Granta", 1.6,
                "Белый", 2015, "Россия",
                "МКПП", "Седан", "А123ВВ_199",
                5, true,
        new Car.Key(true,true)
        );
        System.out.println(car1);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                "Черный", 2020, "Германия",
                "АКПП", "Седан", "Т333ТТ_133",
                5, true,
        new Car.Key(false,false));
        System.out.println(car2);
        Car car3 = new Car("BMW", "Z8", 3.0,
                "Черный", 2021, "Германия",
                "АКПП", "Кабриолет", "М925РТ_133",
                2, false,
        new Car.Key(false,false)
    );
        System.out.println(car3);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4,
                "Красный", 2018, "Южная Корея",
                "АКПП", "Внедорожник", "С209АС_152",
                5, true,
        new Car.Key(true,true)
    );
        System.out.println(car4);
        Car car5 = new Car("Hyundai", "Avante", 1.6,
                "Оранжевый", 2016, "Южная Корея",
                "МКПП", "Седан", "Р303ЕР_177",
                5, false,
        new Car.Key(false,false));
        System.out.println(car5);
    }
}
