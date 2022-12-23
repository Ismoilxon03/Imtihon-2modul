package service;

import model.Branches;

public class BranchService {
    Branches[] branchList=new Branches[100];
    int index=0;
    public boolean addBranch(String name,String location){
        for (Branches branche : branchList) {
            if(branche!=null){
                if(branche.getLocation().equals(location) && branche.getName().equals(name)){
                    return false;
                }
            }
        }
        branchList[index++]=new Branches(name,location);
        return true;
    }
    public void getBranchList(){
        int cnt=0;
        for (Branches branche : branchList) {
            if(branche!=null){
                System.out.println("\t<<"+ ++cnt +">>\t");
                System.out.println("Flial nomi: "+branche.getName());
                System.out.println("Flial manzili: "+branche.getLocation());
            }
        }
    }
}
