import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      task1();
      task2();
      task3();
 }
  public static void task1(){
 for (int i = -50; i <= 77; i++){
  if (i % 5 == 0) {
      System.out.println(i + " ");
      }
    }
      System.out.println("this number is divided on 5");
  }
    public static void task2(){
        int f = 0;
        while(f <5)   {
            System.out.println("Hello ");
            f = f+1;
        }
    }
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Enter 5");
            value = scanner.nextInt();
        }while (value != 5);
        System.out.println("You entered 5");
    }
}