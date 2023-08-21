package problems4.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Book implements Comparable<Book> {
    int price;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getPrice());
    }

    void show(){
        System.out.println(price);
    }
    public Book(int price) {
        this.price = price;
    }
    @Override
    public int compareTo(Book o) {
        return this.getPrice() - o.getPrice();
    }
}
