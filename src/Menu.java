import java.util.ArrayList;


public class Menu {
//    fields
    private ArrayList<Item> appetizers = new ArrayList<Item>();
    private ArrayList<Item> noodles = new ArrayList<Item>();
    private ArrayList<Item> main = new ArrayList<Item>();
    private ArrayList<Item> drinks = new ArrayList<Item>();

//    constructors
    public Menu (){
        popuplateMenu ();
    }
//    assessors and mutators
//    returns a specific appetizer
    public Item getAppetizer (int index){
        return appetizers.get(index);
    }

//    returns the size of the category appetizers
    public String getAppetizersSize (){
        return "Appetizers" +":"+ appetizers.size();
    }
//    returns all appetizers as a string
    public String getAllAppetizers(){
        String aMenu ="";
        aMenu += "APPETIZERS: \n";
        for (int i =0; i < appetizers.size(); i++){
            Item a = appetizers.get(i);
//            add id, name, and price
            aMenu += "A" + (i+1) + " " + a.toString ()+ " n";
        }
        return aMenu;
    }


//    methods
    public void popuplateMenu(){

//        appetizers
        appetizers.add(new  Item("Pork Buns", "Appetizers", 6, "Regular"));
        appetizers.add(new Item("Dumplings","Appetizers", 3, "Regular"));
//        noodles
        noodles.add(new Item("Pho Basic","Noodles", 9, "Regular"));
        noodles.add(new Item("Pho Deluxe","Noodles", 11, "Regular"));

//        main dishes
        main.add(new Item("Bibimbop", "Rice", 9, "Regular"));
        main.add(new Item("Curry Rice", "Rice", 10, "Regular"));

//        drinks
        drinks.add(new Item("Water", "Drinks", 0, "16 oz"));
        drinks.add(new Item("Sapporo", "Drinks",4,"12 oz"));

    }

//    toString

}
