package subclass;

import java.nio.file.*;
import java.util.Scanner;

public class Create extends Base {
    public void print_call_method() {
        System.out.println("Creating Mode");
    }

    public boolean is_file_exist(String file_name) {
        Path path = Paths.get(file_name);
        return Files.exists(path);
    }

    public boolean create_method() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("continue? (y/n)");
            String is_continue_flag = scan.next();
            switch (is_continue_flag) {
                case "y":
                    System.out.println("continue");
                    continue;
                case "n":
                    System.out.println("exit");
                    scan.close();
                    return true;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
        }
    }

    public void print_function_end() {
        System.out.println("Create function end");
    }
}
