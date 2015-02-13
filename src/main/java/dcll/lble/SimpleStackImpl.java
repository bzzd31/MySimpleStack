package dcll.lble;

import java.util.ArrayList;

/**
 * Created by 21003573 on 13/02/2015.
 */
public class SimpleStackImpl implements SimpleStack {
    private ArrayList<Item> stock;

    public SimpleStackImpl(){
        this.stock = new ArrayList<Item>();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
