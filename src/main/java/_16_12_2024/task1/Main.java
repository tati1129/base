package _16_12_2024.task1;

public class Main {
    public static void main(String[] args) {
Postman postman = new Postman();
Post post = new Post(25, new Adress("M. drive 85"));

postman.delivery(post);
    }
}
