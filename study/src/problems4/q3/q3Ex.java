package problems4.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q3Ex {
    public static void main(String[] args) {
        ArrayList<Book> b = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            b.add(new Book(10000000 / i));
        }
        Book[] cc = new Book[3];
        for (int i = 0; i < cc.length; i++) {
            cc[i] = new Book(10000000 / (i + 1));
        }
        System.out.print("정렬 전: ");
        for (Book book : cc) {
            System.out.println(book.toString()+ " ");
        }

        Arrays.sort(cc);

        for (Book book : cc) {
            System.out.println(book.toString()+ " ");
        }

        System.out.print("정렬 전: ");
        for (Book book : b) {
            System.out.println(book.toString()+ " ");
        }
        Arrays.sort(b.toArray());
        System.out.print("정렬 후: ");
        for (Book book : b) {
            System.out.println(book.toString()+ " ");
        }

    }
}
