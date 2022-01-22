import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        int number1=input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int number2= input.nextInt();

        int ebob=1;
        int counter=0;
        while (counter<=number1){
            counter++;
            if (number1%counter== 0 && number2%counter==0) {
                ebob = counter;
            }

        }
        System.out.println("ebob : "+ebob);




        int ekok=1;
        int counter2=1;

        while (counter2<=(number1*number2)){
            counter2++;
            if (counter2%number1==0 && counter2%number2==0){
                ekok=counter2;
                break;
            }

        }
        System.out.println("ekok : "+ekok);


    }
}
