public class DizidekiBuyukKucukSayiBulma {

    public static void main(String[] args) {

        int[] list={23, 45, 12, 6, 8, 10, 2};
        int maxNumber=list[0];
        int minNumber=list[0];

        for(int i=1; i<list.length; i++){

            if(list[i]>maxNumber){
                maxNumber=list[i];
            }
            if(list[i]<minNumber){
                minNumber=list[i];
            }
        }
        System.out.println("Dizideki en buyuk sayi: " + maxNumber);
        System.out.println("Dizideki en kucuk sayi: " + minNumber);
    }
}
