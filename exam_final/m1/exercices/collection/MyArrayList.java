package m1.exercices.collection;

public class MyArrayList  implements MyList{

    private int[] items;
    private int count;

    public MyArrayList(int length) {
        this.items = new int[length];
    }

    @Override
    public void insert(int item) {
        if(count == items.length){
            int[] itemsTmp = new int[count*2];
            for (int i = 0; i < count; i++) {
                itemsTmp[i] = items[i];
            }
            items = itemsTmp;
        }
        items[count++] =item;
    }

    @Override
    public void removeAt(int position) {
        if(position <0 || position >= count){
            throw new IllegalArgumentException();
        }
        for (int i = position; i < count ; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    @Override
    public int indexOf(int item) {
        for (int i = 0; i <count ; i++) {
            if(items[i] == item)
                return i;
        }
        return -1;
    }

    @Override
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
