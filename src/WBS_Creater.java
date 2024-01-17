import subclass.*;

public class WBS_Creater {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("comand line argument is not 1");
            System.exit(1);
        }
        String cmdline = args[0];
        if (cmdline.equals("create")) {
            Create create = new Create();
            create.print_call_method();
            if (!create.is_file_exist("test.json")) {
                System.out.println("test.json is not exist");
                System.exit(1);
            }
            create.create_method();
            create.print_function_end();
        } else if (cmdline.equals("update")) {
            Update update = new Update();
            update.print_call_method();
            if (!update.is_file_exist("test.json")) {
                System.out.println("test.json is not exist");
                System.exit(1);
            }
            update.insert_method();
            update.update_method();
            update.delete_method();
            update.print_function_end();
        } else {
            System.out.println("Invalid command line argument");
            System.exit(1);
        }
    }
}
