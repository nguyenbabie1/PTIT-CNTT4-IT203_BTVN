package Sessoin6.Bai2;

public class Bai2Account {
    String username;
    String password;
    String email;
    
    public Bai2Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void editPass(String newPass){
        this.password = newPass;
        System.out.println("ngon luoon");
    }
    public void printInfo(){
        System.out.println("Username: " + username + " Password: " + password + " Email: " + email + "");
    }

}

