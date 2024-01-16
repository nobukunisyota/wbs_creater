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

    public boolean create() {
        while (true) {
            System.out.println("continue? (y/n)");
            Scanner is_continue_flag = new Scanner(System.in);
            try (is_continue_flag) {
                switch (is_continue_flag.next()) {
                    case "y":
                        System.out.println("continue");
                        break;
                    case "n":
                        System.out.println("exit");
                        return true;
                    default:
                        System.out.println("Invalid input");
                        continue;
                }
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }
        return true;
    }

    public void print_function_end() {
        System.out.println("Create function end");
    }
}
