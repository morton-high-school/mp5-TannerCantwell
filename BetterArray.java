public class BetterArray {
    public int[] array = new int[0];
    private int used = 0;

    BetterArray() {}

    BetterArray(int size) {
        addSpots(size);
    }

    public int size() {
        return this.used;
    }

    public boolean add(int item) {
        if (array.length == 0) {
            addSpots(1);
        } else if (this.used >= array.length) {
            addSpots(array.length);
        }
        
        array[used] = item;
        this.used++;
        return true;
    }

    public void add(int index, int item) {
        if (this.used >= array.length) {
            addSpots(array.length);
        }

        if (index == this.used) {
            array[index] = item;
        } else {
            int previousItem = 0;
            int newItem = item;
            for (int i = index; i < array.length; i++) {
                previousItem = array[i];
                array[i] = newItem;
                newItem = previousItem;
            }
        }

        this.used++;
    }

    public int get(int index) {
        return array[index];
    }

    public int set(int index, int item) {
        int previousItem = array[index];
        array[index] = item;
        return previousItem;
    }

    public int remove(int index) {
        int currentItem = array[index];
        if (index == this.used) {
            array[index] = 0;
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i+1];
            }
        }
        this.used--;

        return currentItem;
    }

    private void addSpots(int amount) {
        int[] result = new int[array.length + amount];
        for (int i = 0; i < this.used; i++) {
            result[i] = array[i];
        }
        array = result;
    }
}
