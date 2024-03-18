package pages;

public class Credentials {
    public static void main(String[] args) {
      //  String username= "jamesBond";
      //  String password ="007";

        // for this i go to run button and r click  ->  modify run configuration
        //add env vars
        //to call them use : System.getenv( )
        String username =System.getenv("username");
        String password =System.getenv("password");
        System.out.println(username);
        System.out.println(password);

    }
}
