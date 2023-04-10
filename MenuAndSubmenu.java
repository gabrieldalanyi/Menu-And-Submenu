import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

//simple menu and submenu in Java with user registration/login using HashMap and Map, and with a maximum number of login attempts .
public class MenuAndSubmenu {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Register a user .
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        users.put(username, password);
        System.out.println(username + " registered successfully.");

        // Login a user with max 3 attempts logins .
        int maxAttempts = 3;
        int attempts = 0;
        while (attempts < maxAttempts) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            if (users.containsKey(inputUsername) && users.get(inputUsername).equals(inputPassword)) {
                System.out.println(username + " Logged in successful!");
                break;
            } else {
                attempts++;
                System.out.println("Invalid username or password. " + (maxAttempts - attempts) + " attempts left.");
            }
        }
        if (attempts == maxAttempts) {
            System.err.println("Maximum login attempts exceeded. Program will exit. Bye !");
            System.exit(0);
        }

        //MENU and SUB-MENU
        Scanner menuInput = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("===== MAIN MENU =====");
                System.out.println("1. SubMenu 1");
                System.out.println("2. SubMenu 2");
                System.out.println("3. SubMenu 3");
                System.out.println("4. SubMenu 4");
                System.out.println("5. SubMenu 5");
                System.out.println("6. EXIT");
                System.out.println("=====================");
                System.out.print("Enter your choice: ");

                int menuchoice = menuInput.nextInt();

                switch (menuchoice) {
                    case 1:
                        boolean backToMainMenu1 = false;
                        while (!backToMainMenu1) {
                            System.out.println("==== SubMenu 1 ====");
                            System.out.println("1. Suboption 1");
                            System.out.println("2. Suboption 2");
                            System.out.println("3. BACK");
                            System.out.println("===================");
                            System.out.print("Enter your choice: ");

                            int subMenuChoice1 = scanner.nextInt();

                            switch (subMenuChoice1) {
                                case 1:
                                    System.out.println("You chose Suboption 1 of Option 2.");
                                    // Do something here
                                    break;
                                case 2:
                                    System.out.println("You chose Suboption 2 of Option 2.");
                                    // Do something here
                                    break;
                                case 3:
                                    System.out.println("Going back to Main Menu.");
                                    backToMainMenu1 = true;
                                    break;
                                default:
                                    System.err.println("Invalid choice.");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        boolean backToMainMenu2 = false;
                        while (!backToMainMenu2) {
                            System.out.println("==== SubMenu 2 ====");
                            System.out.println("1. Suboption 1");
                            System.out.println("2. Suboption 2");
                            System.out.println("3. BACK");
                            System.out.println("===================");
                            System.out.print("Enter your choice: ");

                            int subMenuChoice2 = scanner.nextInt();

                            switch (subMenuChoice2) {
                                case 1:
                                    System.out.println("You chose Suboption 1 of Option 2.");
                                    // Do something here
                                    break;
                                case 2:
                                    System.out.println("You chose Suboption 2 of Option 2.");
                                    // Do something here
                                    break;
                                case 3:
                                    System.out.println("Going back to Main Menu.");
                                    backToMainMenu2 = true;
                                    break;
                                default:
                                    System.err.println("Invalid choice.");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        boolean backToMainMenu3 = false;
                        while (!backToMainMenu3) {
                            System.out.println("==== SubMenu 3 ====");
                            System.out.println("1. Suboption 1");
                            System.out.println("2. Suboption 2");
                            System.out.println("3. BACK");
                            System.out.println("===================");
                            System.out.print("Enter your choice: ");

                            int subMenuChoice3 = scanner.nextInt();

                            switch (subMenuChoice3) {
                                case 1:
                                    System.out.println("You chose Suboption 1 of Option 2.");
                                    // Do something here
                                    break;
                                case 2:
                                    System.out.println("You chose Suboption 2 of Option 2.");
                                    // Do something here
                                    break;
                                case 3:
                                    System.out.println("Going back to Main Menu.");
                                    backToMainMenu3 = true;
                                    break;
                                default:
                                    System.err.println("Invalid choice.");
                                    break;
                            }
                        }
                        break;
                    case 4:
                        boolean backToMainMenu4 = false;
                        while (!backToMainMenu4) {
                            System.out.println("==== SubMenu 4 ====");
                            System.out.println("1. Suboption 1");
                            System.out.println("2. Suboption 2");
                            System.out.println("3. BACK");
                            System.out.println("===================");
                            System.out.print("Enter your choice: ");

                            int subMenuChoice4 = scanner.nextInt();

                            switch (subMenuChoice4) {
                                case 1:
                                    System.out.println("You chose Suboption 1 of Option 2.");
                                    // Do something here
                                    break;
                                case 2:
                                    System.out.println("You chose Suboption 2 of Option 2.");
                                    // Do something here
                                    break;
                                case 3:
                                    System.out.println("Going back to Main Menu.");
                                    backToMainMenu4 = true;
                                    break;
                                default:
                                    System.err.println("Invalid choice.");
                                    break;
                            }
                        }
                        break;
                    case 5:
                        boolean backToMainMenu5 = false;
                        while (!backToMainMenu5) {
                            System.out.println("==== SubMenu 5 ====");
                            System.out.println("1. Suboption 1");
                            System.out.println("2. Suboption 2");
                            System.out.println("3. BACK");
                            System.out.println("===================");
                            System.out.print("Enter your choice: ");

                            int subMenuChoice5 = scanner.nextInt();

                            switch (subMenuChoice5) {
                                case 1:
                                    System.out.println("You chose Suboption 1 of Option 2.");
                                    // Do something here
                                    break;
                                case 2:
                                    System.out.println("You chose Suboption 2 of Option 2.");
                                    // Do something here
                                    break;
                                case 3:
                                    System.out.println("Going back to Main Menu.");
                                    backToMainMenu5 = true;
                                    break;
                                default:
                                    System.err.println("Invalid choice.");
                                    break;
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Exiting program ... Bye !");
                        System.exit(0);
                    default:
                        System.err.println("Invalid choice.");
                        break;
                }
            }
        }catch(InputMismatchException e) {
            System.err.println("Invalid input. Please enter a number ! Exiting program ... Bye !");
        }
    }
}






