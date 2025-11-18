package org.abb_tech.lesson9.tasks.task2.classes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UserBackupService {

    public void saveUsers(List<User> users, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(users);
            System.out.println("Users saved to file '" + filePath + "'");
        } catch (IOException e) {
            System.out.println("Error saving users: " + e.getMessage());
        }
    }

    public List<User> loadUsers(String filePath) {
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            List<User> users = (List<User>) in.readObject();
            System.out.println("Users loaded from '" + filePath + "'");
            return users;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }
        return List.of();
    }

    public void backupFile(String sourceFilePath, String backupFilePath) {
        try {
            // Create folder if missing
            Files.createDirectories(Path.of(backupFilePath).getParent());

            Files.copy(Path.of(sourceFilePath), Path.of(backupFilePath));
            System.out.println("Backup created: " + backupFilePath);
        } catch (IOException e) {
            System.out.println("Error creating backup: " + e.getMessage());
        }
    }

    public void deleteBackup(String backupFilePath) {
        try {
            Files.delete(Path.of(backupFilePath));
            System.out.println("Backup deleted: " + backupFilePath);
        } catch (IOException e) {
            System.out.println("Error deleting backup: " + e.getMessage());
        }
    }
}
