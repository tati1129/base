package task_E2;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Faker faker = new Faker();

        //Генерация масива продуктов
        Product[] product = new Product[3];
        for (int i = 0; i < product.length; i++) {
            product[i] = new Product(i + 1,
                    faker.food().vegetable(),
                    random.nextDouble() * 100,
                    faker.commerce().productName().toString(),
                    random.nextBoolean());
        }


        // Генерация массива клиентов
        Customer[] customers = new Customer[4];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(i + 1, faker.name().firstName(), faker.name().lastName(), faker.name().username() + "@gmail.com", faker.phoneNumber().toString());
        }


        // Генерация заказов
        Order[] orders = new Order[4];
        for (int i = 0; i < orders.length; i++) {

            //Случайный клиент
            Customer customer = customers[random.nextInt(customers.length)];

            // Создание списка продуктов для заказа
            List<Product> productList = new ArrayList<>();
            int prodCount = random.nextInt(product.length) + 1;

            for (int j = 0; j < prodCount; j++) {
                Product selectProduct = product[random.nextInt(product.length)];
                if (!productList.contains(selectProduct)) {
                    productList.add(selectProduct);
                }
            }


            double totalAmount = 0.0;
            for (int j = 0; j < productList.size(); j++) {
                totalAmount += productList.get(j).getPrice();
            }
            orders[i] = new Order(i + 1,
                    customer,
                    productList,
                    totalAmount);

        }
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }

    }
}
