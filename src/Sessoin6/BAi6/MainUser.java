
package Session6.Bai6;

public class MainUser {
    public static void main(String[] args) {
        Bai6User u1 = new Bai6User("U001", "admin", "123456", "admin@gmail.com");
        Bai6User u2 = new Bai6User("U002", "user1", "abcdef", "user1gmail.com");
        Bai6User u3 = new Bai6User("U003", "user2", "", "user2@gmail.com");

        u1.hienThiThongTin();
        u2.hienThiThongTin();
        u3.hienThiThongTin();
    }
}
