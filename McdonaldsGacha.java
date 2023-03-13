package gacha;


import java.util.*;

public class McdonaldsGacha{
        public static String rngesus(String name, String[] menu) {
        char firstLetter = Character.toUpperCase(name.charAt(0));
        int ascii = firstLetter;
        int len = menu.length;
        while(ascii > len)
        {
            
            Random rand = new Random();
            ascii = ascii - rand.nextInt(90);
            
            if(ascii <0)
            {
                ascii = ascii * -1;
            }
        }
        return menu[ascii];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] menu = {"Big Mac", "Fried Chicken", "French Fries", "Ice Cream", "McNuggets", "Hashbrown", "McChicken", "Cheeseburger", "Soda", "filet o fish", "Mcflurry"};
        
        System.out.print("GREETINGS! \n");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        int opt = 1;
        while(true){
            if(opt == 1){
            String rng = rngesus(name, menu);
        
            System.out.println("RNGesus has bleesed thee with " + rng + ". you may rejoice, " + name + "!");
            }
            else if (opt==0)
            {
                System.out.print("Farewell Till We Meet Again!");
                break;
            }
            else 
            {
                System.out.print("Yee have typed wrong try again\n");
            }
            System.out.print("Would thee still like to order? Yay (1) || Nay (0): ");
            opt =  scanner.nextInt();
        }
    }
}
    
