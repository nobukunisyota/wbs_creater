import subclass.*;

public class WBS_Creater {

    public static void main(String[] args) {
        // Check command line argument
        if (args.length != 1) {
            System.out.println("comand line argument is not 1");
            System.exit(1);
        }
        String cmdline = args[0];

        // Create common instance
        Common_func common = new Common_func();

        // Call method
        if (cmdline.equals("create")) {
            Create create = new Create();
            common.print_call_method(cmdline);
            if (!common.is_file_exist("input.csv")) {
                System.out.println("input.csv is not exist");
                System.exit(1);
            }
            create.create_method();
            common.print_function_end(cmdline);
        } else if (cmdline.equals("update")) {
            Update update = new Update();
            common.print_call_method(cmdline);
            if (!common.is_file_exist("input.csv")) {
                System.out.println("input.csv is not exist");
                System.exit(1);
            }
            update.insert_method();
            update.update_method();
            update.delete_method();
            common.print_function_end(cmdline);
        } else {
            System.out.println("Invalid command line argument");
            System.exit(1);
        }
    }
}
