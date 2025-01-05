package _16_12_2024.task2;

public class Mouse extends EDevice{ }

class Keyboard extends EDevice{}
;
class Display extends  EDevice{};

class EDevice{};

class Main{
    public static void main(String[] args) {
        EDevice mouse = new Mouse();
        EDevice keyboard = new Keyboard();


        //new  Main().show1(new Mouse());
        //public  void show1(EDevice mouse){}


        //new  Main().show1(new Mouse());
        //new  Main().show1(new Keyboard());
        //new  Main().show1(new Display());
        //можем поместить в аргументы все, что наследуется EDevice(объединяет)
        // и не можем положить то что не наследуется EDevice как описано ниже => show1(EDevice mouse)
        //public  void show1(EDevice mouse){}

        new  Main().show1(new Mouse());
    }


    public  void show1(EDevice mouse){

    }

    public void  show2(Object o){} // значит работает с любыми типами данных, кот наследуют от Object
}