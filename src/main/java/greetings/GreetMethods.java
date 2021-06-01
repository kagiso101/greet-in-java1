package greetings;

import java.util.*;

public class GreetMethods{



    //list to store all names that are added(!does not take duplicates)
    protected List<String> list = new ArrayList<>();
    //list to store all names that are added(does take duplicates)
    protected List<String> list2 = new ArrayList<>();
    //counter that increments each time a user is added
    protected int counter;



    //checks to see that name is not blank and that the list doesnt contain the name , there after adds the name and increments the counter
    public void addUser(String userName) {
            list2.add(userName);
        if (userName != "" && !list.contains(userName)) {
            list.add(userName);
            counter++;
        }
    }


    //greets the user by taking in the greet command followed by the name and language to be greeted in
    public String greetUser( String name, String lang) {
        addUser(name);
            switch (lang) {//if language
                case "english"://in the case of english
                    System.out.println("Hello, " + name);
                   return  "Hello, " + name;//print hello & name entered
                case "spanish"://case of spanish
                    System.out.println("Hola, " + name);
                    return  "Hola, " + name;
                case "french"://case of french
                    System.out.println("Bonjour, " + name);
                  return "Bonjour, " + name;
                default:
                    System.out.println("Hi, " + name);
                 return "Hi, " + name;
            }
        }


    //lists all greeted users and times they were greeted
    public int greetedUsers() {
        if (counter != 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println(counter);
        }
        else {
            System.out.println("No users!");
        }
        return counter;
    }

    //returns the counter of all users greeted
    public int allGreetedUsersCounter(){
        System.out.println(counter);
        return counter;
    }

    //clears the list and returns the counter to 0

    public int clearAll(){
        System.out.println("CLEARED");
        list.clear();
        return counter = 0;
    }

    //returns counter for a specific user greeted
    public int userCounter(String name) {
        int userCount = 0;
        for (String nameInList : list2) {
            if (name.equals(nameInList)) {
                userCount++;
            }
        }
        System.out.println(userCount);
        return userCount;
    }


    //removes user from the list and decrements the counter
    //takes in username
    public void clearUserData(String userName){
        addUser(userName);
        try {
            //checks to see if the list contains that username and that the list isnt empty
            if(list.size() != 0 &&  list.contains(userName)){
                //loops for the name within the list
                for (String userNameInList : list) {
                    if(userName.equals(userNameInList)){
                        list.remove(userName);
                        --counter;
                        System.out.print("user cleared!");
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("User does not exist");
        }

    }

    //prints all the available commands
    public void help(){

            System.out.println("commands available:");
            System.out.println("Greet + name + lang => greet users");
            System.out.println("greeted => all greeted Users & counter");
            System.out.println("greeted + name => user Counter");
            System.out.println("clear => resets everything");
            System.out.println("clear + username => clears user data");
            System.out.println("Help => shows all commands");

    }


    public static void main(String[] args) {

        GreetMethods greet = new GreetMethods();
        System.out.println("Welcome , please enter a command or type help to see all valid commands");
        Scanner scanner = new Scanner(System.in);


        while(true){
            String input = scanner.nextLine();
            String[] params =  input.split(" ");

            String command = params[0];



            if(command.equals("exit")){
                break;
            }

            switch (command){
                //works
                case "greet":
                    String name = params[1];
                    String lang = params[2];
                    greet.greetUser(name, lang);
                    break;

                //works
                case "help":
                    greet.help();
                    break;

                //works
                case "greeted":
                    greet.greetedUsers();
                    break;

                //works
                case "userCount":
                    String name1 = params[1];
                    greet.userCounter(name1);
                    break;

                //works
                case "counter":
                    greet.allGreetedUsersCounter();
                    break;

                //works
                case "clear":
                    greet.clearAll();
                    break;

                //works
                case "clearUser":
                    String name2 = params[1];
                    greet.clearUserData(name2);
                    break;

                //works
                case "exit":
                    break;


                default:
                    greet.help();
            }
        }
        scanner.close();

    }

}