import java.util.Scanner;
public class Monday {
    public static void main(String[] args) {

    Scanner keyboard=new Scanner(System.in);
    int size=25;
    int counter=0;
    String quit="";
    String title[]=new String[size];
    String author[]=new String[size];
    String description[]=new String[size];

    while(!quit.equalsIgnoreCase("q")) {
        System.out.println("enter book title: ");
        title[counter] = keyboard.nextLine();

        System.out.print("enter book author: ");
        author[counter] = keyboard.nextLine();


        System.out.print("enter book description: ");
        description[counter] = keyboard.nextLine();
        quit = title[counter];
        counter++;
        for (int i = 0; i < counter - 1; i++) {
            System.out.print(title[i]);
            System.out.print(" ");
            System.out.print(author[i]);
            System.out.print(" ");
            System.out.print(description[i]);
        }


    }}}














