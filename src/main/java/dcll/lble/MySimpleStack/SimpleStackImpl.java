package dcll.lble.MySimpleStack;

import dcll.lble.SimpleStack;

import java.util.ArrayList;

/**
 * Created by 21003573 on 13/02/2015.
 *
 * Un commentaire répondant à l'exigence #3
 *
 * 
 */
public class SimpleStackImpl implements SimpleStack {
    private ArrayList<Item> stock;

    public SimpleStackImpl() {
        stock = new ArrayList<Item>();
    }

    @Override
    public boolean isEmpty() {
        return stock.isEmpty();
    }

    @Override
    public int getSize() {
        return stock.size();
    }

    @Override
    public void push(Item item) {
        stock.add(item);
        System.out.println("Item ajoute");
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stock.get(this.getSize() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item item = stock.get(this.getSize() - 1);
        stock.remove(this.getSize() - 1);
        return item;
    }
}
