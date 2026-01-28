package Sessoin4.Bai5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
    public static void main(String[] args) {

        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK54321",
                "2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK99999"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2}).*User: (\\w+).*Action: (\\w+).*BookID: (\\w+)";
        Pattern pattern = Pattern.compile(regex);

        int borrow = 0;
        int ret = 0;

        for (String log : logs) {
            Matcher m = pattern.matcher(log);

            if (m.find()) {
                String date = m.group(1);
                String user = m.group(2);
                String action = m.group(3);
                String bookId = m.group(4);

                System.out.println(date + " | " + user + " | " + action + " | " + bookId);

                if (action.equals("BORROW")) borrow++;
                if (action.equals("RETURN")) ret++;
            }
        }

        System.out.println("BORROW: " + borrow);
        System.out.println("RETURN: " + ret);
    }
}
