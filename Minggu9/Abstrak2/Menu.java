import java.util.Scanner;

public class Menu extends Restaurant {
    Scanner input=new Scanner(System.in);

    @Override
    public void menuBaru() {
        System.out.print("Menu Baru : ");
        menu=input.nextLine();
    }

    @Override
    public void tampilMenu() {
        System.out.println(menu);
    }
    
}

