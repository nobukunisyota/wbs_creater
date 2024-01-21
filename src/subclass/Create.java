package subclass;

import java.util.Scanner;

public class Create {
    Scanner scan = new Scanner(System.in);

    public String input_content(String content_type) {
        System.out.println("create " + content_type);
        String content = scan.next();
        return content;
    }

    public boolean create_method() {
        while (true) {
            System.out.println("continue? (y/n)");
            String is_continue_flag = scan.next();
            switch (is_continue_flag) {
                case "y":
                    System.out.println("continue");
                    // major content create
                    String major_content = input_content("major");
                    // medium content create
                    String medium_content = input_content("medium");
                    // minor content create
                    String minor_content = input_content("minor");
                    System.out.println("major: " + major_content);
                    System.out.println("medium: " + medium_content);
                    System.out.println("minor: " + minor_content);
                    continue;
                case "n":
                    scan.close();
                    return true;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
        }
    }
}
