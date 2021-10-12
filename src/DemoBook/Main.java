package DemoBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[10];
        input(listBook);
        output(listBook);
        System.out.println("Tổng tiền các cuốn sách là :" + sumPrice(listBook));
        findBook(listBook);
    }

    public static void input(Book[] listBook) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập vào thông tin");
            String name = scanner.nextLine();
            System.out.println("Nhập vào thể loại ");
            String category = scanner.nextLine();
            System.out.println("Nhập vào tác giả ");
            String author = scanner.nextLine();
            System.out.println("Nhập vào giá ");
            double price = scanner.nextDouble();
            System.out.println("Nhập vào số lượng");
            int amount = scanner.nextInt();
            scanner.nextLine();
            Book book = new Book(name, price, amount, category, author);
            listBook[i] = book;
        }
    }

    public static void output(Book[] listBook) {
        for (int i = 0; i < 3; i++) {
            System.out.println(listBook[i]);
        }
    }

    public static double sumPrice(Book[] listBook) {
        double sumPrice = 0;
        for (int i = 0; i < 3; i++) {
            sumPrice += listBook[i].getPrice() * listBook[i].getAmount();
        }
        return sumPrice;
    }

    public static void findBook(Book[] listBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên quyển sách muốn tìm ");
        String name = scanner.nextLine();
        for (int i = 0; i < listBook.length; i++) {
            if (name.equals(listBook[i].getName())) {
                System.out.println("Trong list có quyển sách này. " + listBook[i]);
                return;
            }
        }
        System.out.println("Trong list ko có quyển này ");
        return;

    }
}
