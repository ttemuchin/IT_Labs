import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Создание шара. Гет/сет имени, объёма фигуры. Второй объем перерасчитан с учетом заданного радиуса шара
/*        Ball ball = new Ball("Red", 45f);
        System.out.println(ball.getName());
        System.out.println("The first volume of the ball is " + ball.getVolume());
        float[] forBall = {1};
        ball.setMeasures(forBall);
        System.out.println("The second volume of the ball is " + ball.getVolume());
        System.out.println("This figure is " + ball.getType());
        ball.setName("EnemyBall");
        System.out.println("Now we call him the " + ball.getName());
        
        Cube cube = new Cube("Green", 24.4f);
        cube.setType(2);
        System.out.println();
        System.out.println(cube.getType());
        cube.setType("3d");
        System.out.println(cube.getType());
        System.out.println(Figure.Number_of_Fig);

        Cylinder cylinder = new Cylinder("Teal", 1);
        cylinder.setColor("Aqua");
        System.out.println();
        System.out.println(cylinder.getColor());
        float[] forCyl = {2, 3};
        cylinder.setMeasures(forCyl);
        System.out.println(Arrays.toString(cylinder.getMeasures()));
        System.out.println(cylinder.getVolume());*/

        Ball biggestBall = new Ball();
        System.out.println("This figure is " + biggestBall.getType());
        System.out.println(biggestBall.getColor());
        System.out.println(Figure.Number_of_Fig);
        System.out.println(biggestBall.getProjection());
        System.out.println(biggestBall.getName());
        System.out.println(biggestBall.getVolume());
        System.out.println();

        Cube nextCube = new Cube("Main Cube", "Dark green", 23);
        System.out.println(nextCube.getColor());
        System.out.println(Figure.Number_of_Fig);
        System.out.println(nextCube.getProjection());
        System.out.println(nextCube.getName());
        System.out.println(nextCube.getVolume());
        System.out.println();

        Cylinder tube = new Cylinder();
        System.out.println(tube.getColor());
        System.out.println(Figure.Number_of_Fig);
        System.out.println(tube.getProjection());
        System.out.println(tube.getName());
        tube.setVolume(3);
        System.out.println(tube.getVolume());
        System.out.println();
        tube.amplifySound();
    }
}

//модификаторы доступа public protected package-private private
//статик модификатор указывает на привязку субъекта к текущему классу =/ можно обращаться
//конструкт для сборки объектов
// 4 принципа и как в кода Абстракция - выделение важных характеристик объекта для его представление.
// Инкапсуляция - объединение параметров объекта в класс. Притом что-то доступно а что то нет
// Наследование - использование уже существ классов для описания новых extends
// Полиморфизм - можно использовать объекты с одинаковым интерфейсом без информации о внутреннем устройстве объекта перегрузка/переопределение