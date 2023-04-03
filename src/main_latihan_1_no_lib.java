import java.util.Scanner;
public class main_latihan_1_no_lib {
    //Client method
    public static void main(String[] CHAND){

        //Create an instance of stack
        Latihan_1_no_lib<String> stack = new Latihan_1_no_lib<String>();
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Output: ");
        while(input.hasNext()){
            s = input.next();
            if(s.equals("-")){
                System.out.print(stack.pop()+" ");
            }else{
                stack.push(s);
            }
        }
        System.out.println();
    }
}