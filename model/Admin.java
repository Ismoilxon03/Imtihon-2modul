package model;

import java.util.UUID;

public class Admin {
    private String username;
    private String password;
    private UUID adminId;

    public Admin() {
        this.adminId=UUID.randomUUID();
    }

    public UUID getAdminId() {
        return adminId;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", adminId=" + adminId +
                '}';
    }
}
