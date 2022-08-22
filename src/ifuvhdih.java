//
//    import java.util.Scanner;
//
//    public class Main {
//
//        public static void main(String[] args) {
//
//            String[] products = {"Хлеб", "Яблоки", "Молоко"};
//            int[] prices = {100, 200, 300};
//            int[] count = new int[products.length];
//
//            int sum = 0;
//            System.out.println("Список возможных товаров для покупки");
//
//            for (int i = 0; i < products.length; i++) {
//
//                System.out.print(i + 1 + "." + products[i]);
//                System.out.println(" - " + prices[i] + " руб");
//
//            }
//            Scanner scanner = new Scanner(System.in);
//
//            while (true) {
//                System.out.println("Выберите товар и количество или введите `end`");
//                String line = scanner.nextLine();
//
//                String[] parts = line.split(" ");
//                if (line.equals("end")) {
//
//                    System.out.println("Ваша корзина:\n" + "Наименование товара\t" + "Количество\t" + "Цена/за.ед\t" + "Общая стоимость\n");
//                    int j = 0;
//                    for (int i = 0; i < products.length; i++) {
//
//
//                        System.out.println(products[i] + " \t\t\t\t" + count[i] + " \t\t\t" + prices[i] + " \t" + (count[i] * prices[i]));
//
//                        j += (count[i] * prices[i]);
//
//
//                    }
//                    System.out.println("Итого: " + j);
//                    break;
//                }
//
//                int productNumber = Integer.parseInt(parts[0]) - 1;
//                int productCount = Integer.parseInt(parts[1]);
//
//                count[productNumber] += productCount;
//
//                for (int t : count) {
//                    sum = t;
//
//                }
//
//
//            }
//
//
//        }
//    }
//
//
