public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задание 1" + "\n" + dog + "\n"  + cat + "\n" + paper);

        var dogPlus4 = dog + 4;
        var catPlus4 = cat + 4;
        var paperPlus4 = paper + 4;
        System.out.println("Задание 2" + "\n" + dogPlus4 + "\n" + catPlus4 + "\n"  + paperPlus4);

        var dogMinus = dog - 3.5;
        var catMinus = cat - 1.6;
        var paperMinus = paper - 7639;
        System.out.println("Задание 3" + "\n" + dogMinus + "\n" + catMinus + "\n"  + paperMinus);

        var friend = 19;
        var friend2 = friend * 2;
        var friend7 = friend2 / 7;
        System.out.println("Задание 4" + "\n" + friend + "\n" + friend2 + "\n" + friend7);

        var frog  = 3.5;
        var frogMultiplication = frog * 10;
        var frogDivision = frogMultiplication / 3.5;
        var frogAddition = frogDivision + 4;
        System.out.println("Задание 5" + "\n" + frog + "\n" + frogMultiplication + "\n" + frogDivision + "\n" + frogAddition);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var differenceInWeight = Math.abs(boxer1 - boxer2);
        System.out.println("Задание 6" + "\n" + totalWeight + "\n" + differenceInWeight);

        var remainderOfDivision = boxer2 % boxer1;
        System.out.println("Задание 7" + "\n" + remainderOfDivision);

        if (boxer1 > boxer2){
            System.out.println(boxer1 % boxer2);
        } else {
            System.out.println(boxer2 % boxer1);
        }

        var numberOfHours = 640;
        var numberOfEmployees = numberOfHours / 8;
        System.out.println("Задание 8" + "\n" + "Всего работников в компании — " + numberOfEmployees +" человек");
        var employees = numberOfEmployees + 94;
        var newNumberOfHours = employees * 8;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + newNumberOfHours + " часов работы может быть поделено между сотрудниками");
















    }
}