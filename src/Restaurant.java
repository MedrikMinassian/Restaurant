public class Restaurant {
    public static void main (String[] args){
        Menu menu = new Menu();
        menu.getAppetizersSize();

        Item myItem = menu.getAppetizer(1);
        System.out.println(myItem);

        String sItem = menu.getAppetizersSize();
        System.out.println(sItem);

    }
}
