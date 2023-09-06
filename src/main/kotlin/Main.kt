import kotlin.math.PI
import kotlin.math.sqrt

fun main(args: Array<String>)

{
    //task_#1________________________________________________
    val exercises: Int=13;//Объявление константы типа... и присваивание ей значения
    var exercisesSolved: Int=0;

     exercisesSolved+=1;//увеличение переменной в последующих задачах

    //task_#2________________________________________________
    val myAge: Int=18;//объявление константы, ее наименование и присваивание значения
    println("Возраст: $myAge");//вывод значения на консоль
    exercisesSolved+=1;

    //task_#3________________________________________________
    var initialValueMyAge: Double=18.0;//Объявление переменной типа...указывание имени переменной ("Начальное Значение Мой Возраст")
    var personsAge: Double=30.0;//Объявление переменной...

    initialValueMyAge=(initialValueMyAge+personsAge)/2;//изменение значения переменной "IVMA", высчитыванием среднего арифметического
                                                      // изначального значения и значения переменной "PersonsAge"
    println("Ср.ариф.Возраста:$initialValueMyAge");//Вывод итогового значения на консоль
    exercisesSolved+=1;

    //task_#4________________________________________________
    val testNumber: Int=10;//объявление константы, ее наименование и присваивание значения
    val evenOdd: Int=testNumber%2;//Объявление константы и присвоение значения путем нахождения остатка от деления переменной на два

    println("Вывод testNumber: $evenOdd");//ВНаК
    exercisesSolved+=1;

    //task_#5________________________________________________
    var answer: Int=0;//Объявление переменной типа...указывание имени,присвоение значения
    answer+=1;//Увеличение переменной на единицу
    answer+=10;//Увеличение переменной на 10
    answer*=10;//Умножение переменной на 10
    answer=answer shr 3;//Смещение переменной вправо на 3
    println("Answer: $answer");
    exercisesSolved+=1;

    //task_#6________________________________________________
    var age: Int=16;
    println(age);
    age=30;
    println(age);
    //var, т.к age-переменная, значение которой в данном коде должно изменяться
    exercisesSolved+=1;

    //task_#7________________________________________________

    run {
        val a: Int = 46;
        val b: Int = 10;
        val answer1: Int = (a * 100) + b;
        val answer2: Int = (a * 100) + (b * 100);
        val answer3: Int = (a * 100) + (b / 10);


        exercisesSolved += 1;
    }

    //task_#8________________________________________________
    val solution: Int;
    solution=(5*3)-(4/2*2);
    println("Solution: $solution");
    exercisesSolved+=1;


    //task_#9________________________________________________
    val a: Double=15.0;
    val b: Double=20.0;
    val average: Double=(a+b)/2;//Вычисление среднего арифметического чисел значений а и b
    println("Вывод ср.ариф.: $average");
    exercisesSolved+=1;


    //task_#10________________________________________________
    val fahrenheit: Double=86.0;
    val celcius: Double=(fahrenheit-32)/1.8;//Присвоение значения константы путем конвертирования fahrenheit в celcius,  вычитая значение переменной на 32 и деля на 1,8
    println("С: $celcius");
    exercisesSolved+=1;

    //task_#11________________________________________________
    val position: Int= 16;
    val row: Int=position/8;
    val column: Int=position%8;
    exercisesSolved+=1;


    //task_#12________________________________________________

    val degrees: Double=20.0;
    val radians: Double=(Math.PI/180)*20.0;//присвоение значения константы через нахождения радиана
    println("Радиан: $radians");
    exercisesSolved+=1;


    //task_#13________________________________________________
    //создание двумерных координат двух точек
    val x1: Double=2.0;
    val y1: Double=1.0;

    val x2: Double=4.0;
    val y2: Double=8.0;
    val distance: Double= sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));//вычисление расстояния между двумя точками
    println("Расстояние: $distance");
    exercisesSolved+=1;

    println("Счет:$exercisesSolved");
}