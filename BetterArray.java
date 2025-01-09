public class BetterArray {
    public int[] array = new int[0];
    private int size = 0;
    private int used = 0;

    BetterArray() {}

    BetterArray(int size) {
        addSpots(size);
        this.size = size;
    }

    public int size() {
        return this.used;
    }

    public boolean add(int item) {
        if (this.size == 0) {
            addSpots(1);
        } else if (this.used >= this.size) {
            addSpots(this.size);
        }
        array[used] = item;
        this.used++;
        return true;
    }

    public void add(int index, int item) {
        if (this.used >= this.size) {
            addSpots(this.size);
        } else {
            addSpots(1);
        }

        if (index == this.used) {
            array[index] = item;
        } else {
            int previousItem = 0;
            int newItem = item;
            for (int i = index; i < array.length - 1; i++) {
                previousItem = array[i];
                array[i] = newItem;
                newItem = previousItem;
            }
        }
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
            this.used--;
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i+1];
            }
        }

        return currentItem;
    }

    private void addSpots(int amount) {
        int[] result = new int[array.length + amount];
        for (int i = 0; i < this.used; i++) {
            result[i] = array[i];
        }
        this.size += amount;
        array = result;
    }
}
