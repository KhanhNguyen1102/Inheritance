package DemoBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = createListBook();
        input(listBook);
        output(listBook);
        System.out.println("Tổng tiền các cuốn sách là :" + sumPrice(listBook));
        findBook(listBook);
    }
//    Hàm tạo mảng Book
    public  static Book[] createListBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng Book :");
        int size = scanner.nextInt();
        return new Book[size];
    }
//    Hàm điền phần tử cho mảng Book
    public static void input(Book[] listBook) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listBook.length; i++) {
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
//    Hàm in mảng Book
    public static void output(Book[] listBook) {
        for (int i = 0; i < listBook.length; i++) {
            System.out.println(listBook[i]);
        }
    }
//    Hàm tính tổng tiền 1 loại sách
    public static double sumPrice(Book[] listBook) {
        double sumPrice = 0;
        for (int i = 0; i < listBook.length; i++) {
            sumPrice += listBook[i].getPrice() * listBook[i].getAmount();
        }
        return sumPrice;
    }
//    Hàm tìm 1 quyển sách có trong mảng ko , in ra thông tin
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
