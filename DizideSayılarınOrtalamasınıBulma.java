public class DizideSayılarınOrtalamasınıBulma {

    public static void main(String[] args) {

        int[] list = {1,4,6,8,9};
        double result=0;

        for(int i=0;i<list.length;i++){
            result += list[i];
        }
        System.out.println(result/list.length);
    }

}
