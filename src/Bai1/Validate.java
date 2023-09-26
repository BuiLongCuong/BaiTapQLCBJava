package Bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validate {
    public static int getChoice(Scanner input) {
        int choice;
        try {
            choice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số để lựa chọn Menu!!");
            choice = -1;
        }
        return choice;
    }

    public static double getScores(Scanner input) {
        double scores;
        do {
            try {
                scores = Double.parseDouble(input.nextLine());
                if(scores>10 || scores <0){
                    throw new RuntimeException("Điểm phải lớn hơn 0 và nhỏ hơn hoặc bằng 10");
                }
                return scores;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập điểm");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }
    public static int inputNumber(Scanner input) {
        int intoNumber;
        do {
            try {
                intoNumber = Integer.parseInt(input.nextLine());
                return intoNumber;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!");
            }
        }while (true);
    }
    public static String inputString(Scanner input){
        String intoString = null;
        do {
            try {
                for (char c : intoString.toCharArray()) {
                    if (Character.isDigit(c)) {
                        throw new NumberFormatException();
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập số, vui lòng nhập lại tên.");
            }
        }while (true);
    }
}
