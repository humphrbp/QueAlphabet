import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

 

public class que {

       public static void main(String[] args) {

              Queue<String> alphabet = new LinkedList<>();

 

              Scanner scan = new Scanner(System.in);

 

              int Mode = 0;

              String a = "";

              do {

                     System.out.println("Add Letter (1); Remove Letter(2); Display Current Que(3); Quit(4)");

                     Mode = scan.nextInt();

 

                     if (Mode == 1) {

                           if (alphabet.size() >= 10) {

                                  System.out.println("Sorry.  Que is Full.  Must remove a Letter.");

                           } else {

                                  System.out.println("Add Letters. Type exit to stop");

                                  do{

                                         a = scan.next();
                                         if (a.compareTo("exit")!=0) {
                                         alphabet.add(a);
                                         }
                                         }while (alphabet.size() < 10  && a.compareTo("exit")!=0);

                                  System.out.println("Que is now Full.  Must remove a Letter to enter more.");

                                  }
                           
                          

                     }

                     if (Mode == 2) {

                           if (alphabet.size() <= 0) {

                                  System.out.println("Sorry.  Que is Empty.  Must add a Letter.");}

                           else {System.out.println("Removed Letter: " + alphabet.remove());}

                     }

                     if (Mode == 3) {

                           // Display contents of the queue.

                           System.out.println("Queue: " + alphabet);

 

                           int size = alphabet.size();

                           System.out.println("Size of queue: " + size);

                     }

 

              } while (Mode != 4);

              scan.close();

       }

 

}