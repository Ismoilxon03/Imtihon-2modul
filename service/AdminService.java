package service;

import model.Admin;
import model.Teacher;

public class AdminService {
    Admin[] adminList=new Admin[100];
    int index=0;
    public boolean addAdmin(String username, String password){
        for (Admin admin : adminList) {
            if(admin!=null){
                if(admin.getUsername().equals(username)){
                    return false;
                }
            }
        }
        adminList[index++]=new Admin(username,password);
        return true;
    }
    public Admin login(String username, String password){
        for (Admin admin : adminList) {
            if(admin!=null){
                if(admin.getUsername().equals(username) && admin.getPassword().equals(password)){
                    return admin;
                }
            }
        }
        return null;
    }
    public void getAdminList(){
        int cnt=0;
        for (Admin admin: adminList) {
            if(admin!=null){
                System.out.println(++cnt +"-admin: "+admin.getUsername());
            }
        }
    }
}
