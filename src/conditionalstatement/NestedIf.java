package conditionalstatement;

public class NestedIf {
    public static void main(String[] args) {
        int a=70;
        int b=50;

        if (a>b){

            if (a>=20 && a<=50){
                System.out.println("A is greater than B and it is in the range of 20 and 50");
            }else{
                System.out.println("A is greater than B and it is not in the range of 20 and 50");
            }
        }
    }
}
