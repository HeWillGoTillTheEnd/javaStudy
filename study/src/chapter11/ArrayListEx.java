package chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        while(true) {
            int point = Integer.parseInt(br.readLine());
            if(point <0) break;
            arr.add(point);
            if(point >max) max = point;
        }
        System.out.println("전체 학생은 "+arr.size() + "명이다.");
        System.out.print("학생들의 성적 : ");
        for (Integer i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i+"번 학생의 성적은 "+arr.get(i)+"이며 등급은"+getPoint(arr.get(i),max)+"이다.");

        }
    }

    private static String getPoint(Integer point,int max) {
        if(point >= max-10) return "A";
        else if(point >= max-20) return "B";
        else if(point >= max-30) return "C";
        else return "F";
    }
}
