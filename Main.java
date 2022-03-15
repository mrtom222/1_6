import java.util.Scanner;

class Main {
  public static boolean test(int li){
    for(int i = li-1;i>1;i--){
      if((li % i)==0){
        return false;
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    System.out.print(i);
    System.out.print(" : ");
    System.out.println(test(i));   
  }
}