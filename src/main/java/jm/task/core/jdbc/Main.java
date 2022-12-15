package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args){

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Bill", "Murrey", (byte) 72);
        userService.saveUser("Jim", "Carrey", (byte) 60);
        userService.saveUser("Charlie", "Chaplin", (byte) 88);
        userService.saveUser("Leslie", "Nielsen", (byte) 84);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

