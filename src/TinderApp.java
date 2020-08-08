

    import java.util.*;

    public class TinderApp {
    
        public static void main(String[] args) {
            System.out.println("Tinder");
            
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name");
            String name = sc.nextLine();
    
            System.out.println("Please enter your age");
            String age = sc.nextLine();
    
            System.out.println("Please enter your gender");
            String gender = sc.nextLine();

            System.out.println("Please enter your location");
            String location = sc.nextLine();

            System.out.println("Please enter bio");
            String bio = sc.nextLine();

            
            System.out.print("\nName: ");
            System.out.print(name);
            System.out.print("\nAge: ");
            System.out.print(age);
            System.out.print("\nGender: ");
            System.out.print(gender);
            System.out.print("\nLocation: ")
            System.out.print(location);
            System.out.print("\nBio: ")
            System.out.print(bio);
            System.out.println("");

System.out.println(myProfile);

String choice = null;

while (true) {
    System.out.println("Are you looking to meet Male, Female or (no Preference);");
    choice = sc.nextLine();
    if (choice.equals("q")) {
        break;
    } else {
        TinderSwipe TS = new TinderSwipe();
        Profile display = TS.assignUser(choice);
        System.out.println(display);

        System.out.println("Would you like to Swipe (R)ight, (L)eft, (U)p or (N)ext image");
        String option = sc.nextLine();
        while (true) {
            if (option.equals("N")) {
                display.nextImage();

            } else {
                break;
            }
            System.out.println("Would you like to Swipe (R)ight, (L)eft, (U)p or (N)ext image");
            option = sc.nextLine() .toUpperCase();

            //TinderSwipe and the choice to cssv so we can save history of swipes and remove person from list
            }
            }

            ]
        }
 
        
    }
    }
}

            
            System.out.println("\nYour profile has been created...");
            
            
        }
    
    }
    
}