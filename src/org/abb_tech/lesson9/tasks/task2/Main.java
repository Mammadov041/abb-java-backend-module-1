package org.abb_tech.lesson9.tasks.task2;

import org.abb_tech.lesson9.tasks.task2.classes.User;
import org.abb_tech.lesson9.tasks.task2.classes.UserBackupService;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        UserBackupService service = new UserBackupService();
        List<User> users = new ArrayList<>();
        users.add(new User("Aydin","aydin@mail.com",28));
        users.add(new User("Leyla","leyla@mail.com",24));
        users.add(new User("Ruslan","ruslan@mail.com",30));

        // === build paths in parent folder ===
        String parentDir = Path.of("").toAbsolutePath().getParent().toString() + "\\abbtech-module-one\\src\\org\\abb_tech\\lesson9\\tasks\\task2";
        System.out.println("Parent dir : " + parentDir);

        Path dataFile = Path.of(parentDir, "users.dat");
        Path backupDir = Path.of(parentDir, "backup");
        Path backupFile = backupDir.resolve("users_backup.dat");

        System.out.println("Parent directory: " + parentDir);
        System.out.println("Data file: " + dataFile);
        System.out.println("Backup file: " + backupFile);

        // 1. Save users
        service.saveUsers(users, dataFile.toString());

        // 2. Load users
        List<User> loadedUsers = service.loadUsers(dataFile.toString());
        System.out.println("\nLoaded Users:");
        loadedUsers.forEach(System.out::println);

        // 3. Create backup
        service.backupFile(dataFile.toString(), backupFile.toString());

        // 4. Delete backup
        service.deleteBackup(backupFile.toString());

        System.out.println("\n=== Process Completed ===");
    }

}
