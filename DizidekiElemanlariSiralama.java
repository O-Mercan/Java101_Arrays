import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int boyut = input.nextInt();

        int[] list = new int[boyut];

        for(int i=0;i<list.length;i++){
            System.out.println("Dizinin elemanlarını giriniz: ");
            int number = input.nextInt();
            list[i]= number;
        }

        int temp;

        for (int i=0; i <(list.length-1); i++) {
            for(int j=i+1; j<list.length; j++)

                if(list[j]<list[i]){

                    temp = list[i];
                    list[i]=list[j];
                    list[j] = temp;
                }
        }
        for (int i=0;i<list.length;i++){
            System.out.println((i+1) + ". elemani: " + list[i]);
        }
    }
}
