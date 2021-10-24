import java.util.*;
class gamessssss
{
    public static void main (String ar[]){
    Scanner sc = new Scanner (System.in);
    Random rn = new Random();
    int r = rn.nextInt(100); 
     System.out.println("This is a Simple number guessing game\nYou have to guess a number between 0-100\n______________________________________________________________________\n==========Let's Begin==========\nChoose your level\n1.Noobs level\n2.Pro level\n3.Gods Level\n");
    int level = sc.nextInt();
    if (level==1){
        System.out.println("In this level you will get to know that wether the number you choose is greater or smaller than the actual number");
        System.out.println("Write Your Number \n");
        int c = sc.nextInt();
        while (r!=c){
            if (r>c){
                System.out.println("You choosed a smaller number \nTry to choose a greater number \nChoose again");
                int d = sc.nextInt();
                c=d; 
            }
            else if (r==c){//Ignore this sentence (else if )if you are reading by mistake it was added
                System.out.println("You Won");
            }
            else{
                System.out.println("You choosed a greater number \nTry to choose a smaller number\nChoose again");
                int e = sc.nextInt();
                c=e;
            }
        }
        if (r==c){
            
            System.out.println("You Won!");
        }
    
    
    
    }
    if (level==2){
        System.out.println("So You are a Pro \nYou will get unlimited turns but will not be told that wether the nubmer you choose is greater or smaller");
        System.out.println("Write your Numer\n");
        int c = sc.nextInt();
        while (c!=r){
            
            System.out.println("Choose A number again\nWrite here\n");
            int z = sc.nextInt();
            c = z;
         }
    if (c==r){
        System.out.println("You Won!");
    }   

    }
    if (level==3){
        System.out.println("So you think you are a god \nYou will get only one choice \nWrite the number you choose\n");
        int c = sc.nextInt();
        if(c==r){
            System.out.println("You are Actually a God !\nYOU WON!");
        }
        else{
            System.out.println("You are not a god Looser!");
        }
    }
}
}
