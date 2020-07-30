package conditionalstatement;

public class ElseIf {
    public static void main(String[] args) {

        int a=50;
        int b=60;

        //check if a is greater than b

        if(a>=b){
            System.out.println("A is greater than B");
        }else if(a>=20 && a<=40){
            System.out.println("A is less than B, but it is in the range of 20 and 40");
        }else{
            System.out.println("A is less than B also, not in the range of 20 and 40");
        }


    }
}
