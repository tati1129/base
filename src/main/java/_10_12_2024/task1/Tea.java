package _10_12_2024.task1;

import java.util.Random;

public class Tea {
    int id;
    String kind;
    boolean diskont;




    public Tea(int id, String kind, boolean diskont){
        this.id = id;
        this.kind = kind;
        this.diskont= diskont;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", kind='" + kind + '\'' +
                ", diskont=" + diskont +
                '}';
    }

    public static Tea[] generareArr() {
//        Faker faker = new Faker();
       String[] teaKinds = {"Darjeling", "Earl Grey", "Assam"};
       Tea[] teaArr = new Tea[teaKinds.length];
        Random random = new Random();

        for (int i = 0; i < teaKinds.length; i++) {
            teaArr[i] = new Tea(i+1,
                    teaKinds[i],
                    random.nextBoolean());
            //System.out.println(teaArr[i]);
        }
        return teaArr;
    }
}
