import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[][];
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc ma tran: ");
        row = sc.nextInt();
        column = sc.nextInt();
        arr = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap phan tu o hang: " + i + " cot: " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        int columnN;
        System.out.println("nhap cot ban muon tinh tong: ");
        columnN = sc.nextInt();
        if (columnN > column) {
            System.out.println("Cot ban nhap vuot qua kich thuoc cua mang!");
        }else {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][columnN];
            }
            System.out.println("Tong cua cot " + columnN + " la " + sum);
        }

    }
}
