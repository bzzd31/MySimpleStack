package dcll.lble;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleStackImpl cart = new SimpleStackImpl();
        Item item1 = new Item("Fromage");
        Item item2 = new Item("Yahourt");
        Item item3 = new Item("Viande");
        Item item4 = new Item("Lait");

        System.out.println("Taille : " + cart.getSize() + ", c'est vide ? -> " + cart.isEmpty());
        cart.push(item1);
        cart.push(item2);
        cart.push(item3);
        cart.push(item4);
        System.out.println("Taille : " +cart.getSize()+", c'est vide ? -> " + cart.isEmpty());
        try {
            Item item5 = cart.peek();
            System.out.println("Item peeked : " + item5.nom);
            Item item6 = cart.pop();
            System.out.println("Item popped : " + item6.nom);
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        System.out.println("Taille : " +cart.getSize()+", c'est vide ? -> " + cart.isEmpty());
    }
}
