import java.util.*;

public class HoT{
    public static void main(String[] args){
        HoT test = new HoT();
        test.Greet();
        test.Toss();

    }

    void Toss(){
        Random rand = new Random();
        int num_try = 3;
        int num_h = 0, num_t = 0;
        System.out.println("Tossing a coin...");
        for(int i = 0; i < num_try; i++){
            int result = rand.nextInt(2);
            System.out.print("Round " + (i+1) + ": ");
            if(result == 0){
                System.out.println("Heads");
                num_h++;
            }else if(result == 1){
                System.out.println("Tails");
                num_t++;
            }else System.out.println("error");
        }
        System.out.println("Heads: " + num_h + "," + "Tails: " + num_t);
    }

    void Greet(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

