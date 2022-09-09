package studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    private Date lastUpdated;

    public Menu(){
        this.lastUpdated = new Date();
    }

    //store menu items
    ArrayList<MenuItem> ourMenu = new ArrayList<>();

    public void addMenuItem(MenuItem item){
        ourMenu.add(item);
    }

    public void removeMenuItem(MenuItem item){
        ourMenu.remove(item);
    }

    public boolean isNew(MenuItem item){
        boolean decision = false;
        if (item.getDateMade().after(lastUpdated)){
            decision = true;
        }
        return decision;
    }

    public void displayMenuItems(){
        for (MenuItem item : this.ourMenu){
            System.out.println(item.getName() + item.getCategory() + item.getDescription() + item.getPrice());
        }
    }

    public void displayItem(String aName){
        for(MenuItem item : this.ourMenu){
            if (item.getName().equals(aName)){
                System.out.println(item.getName() + item.getCategory() + item.getDescription() + item.getPrice());

            }
        }
    }



}
