package week_9_hw_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in, "EUC-KR");

        System.out.println("��带 �����ϼ���.\n1) �迭, 2) Vector, 3) ArrayList, 4) HashMap, 5) LinkedList");

        Process process = new Process();
        process.Run(s.nextInt());
    
        s.close();
    }
}