public class BetterArrayAutograder{
  public static void main(String[] args){
    testConstructors();
    testAdd();
    testGet();
    testSet();
    testRemove();
  }

  public static boolean arrayEquals(int[] a, int[] b){
    if(a.length != b.length){
      System.out.println("Array length mismatch.");
      return false;
    }
    for(int i=0; i<a.length; i++){
      if(a[i] != b[i]){
        return false;
      }
    }
    return true;
  }

  public static void printArray(int[] a){
    for(int i=0; i<a.length; i++){
      System.out.println("Item at index " + i + ": " + a[i]);
    }
  }

  public static void testConstructors(){
    BetterArray a1 = new BetterArray();
    BetterArray a2 = new BetterArray(5);
    int[] b1 = new int[0];
    int[] b2 = new int[5];

    boolean t1 = arrayEquals(a1.array, b1);
    boolean t2 = arrayEquals(a2.array, b2);
    boolean t3 = a1.size() == 0;
    boolean t4 = a2.size() == 0;

    if(!t1){
      System.out.println("Failed Constructors test 1.");
    }
    if(!t2){
      System.out.println("Failed Constructors test 2.");
    }
    if(!t3){
      System.out.println("Failed Constructors test 3.");
    }
    if(!t4){
      System.out.println("Failed Constructors test 4.");
    }
    if(t1&&t2&&t3&&t4){
      System.out.println("All Constructor tests passed.");
    }
  }

  public static void testAdd(){
    BetterArray a1 = new BetterArray();
    BetterArray a2 = new BetterArray(6);
    a1.add(12);
    a1.add(42);
    a1.add(50);



    int[] b1 = {12, 42, 50, 0};
    boolean t1 = arrayEquals(a1.array, b1);

    a1.add(2, 21);
    a1.add(0, 100);

    int[] b2 = {100, 12, 42, 21, 50, 0, 0, 0};
    boolean t2 = arrayEquals(a1.array, b2);

    a2.add(20);
    boolean t6 = a2.add(42);

    int[] b3 = {20, 42, 0, 0, 0, 0};
    boolean t3 = arrayEquals(a2.array, b3);

    boolean t4 = a1.size() == 5;
    boolean t5 = a2.size() == 2;

    if(!t1){
      System.out.println("Failed Add test 1.");
    }
    if(!t2){
      System.out.println("Failed Add test 2.");
    }
    if(!t3){
      System.out.println("Failed Add test 3.");
    }
    if(!t4){
      System.out.println("Failed Add test 4.");
    }
    if(!t5){
      System.out.println("Failed Add test 5.");
    }
    if(!t6){
      System.out.println("Failed Add test 6.");
    }
    if(t1&&t2&&t3&&t4&&t5&&t6){
      System.out.println("All Add tests passed.");
    }
  }

  public static void testGet(){
    BetterArray a1 = new BetterArray();
    BetterArray a2 = new BetterArray(7);

    a1.add(5);
    a1.add(7);

    a2.add(4);
    a2.add(8);

    boolean t1 = a1.get(0) == 5;
    boolean t2 = a2.get(1) == 8;
    boolean t3 = a1.size() == 2;

    if(!t1){
      System.out.println("Failed Get test 1.");
    }
    if(!t2){
      System.out.println("Failed Get test 2.");
    }
    if(!t3){
      System.out.println("Failed Get test 5.");
    }
    if(t1&&t2&&t3){
      System.out.println("All Get tests passed.");
    }
  }

  public static void testSet(){
    BetterArray a1 = new BetterArray();
    BetterArray a2 = new BetterArray(12);

    a1.add(42);
    a1.add(43);
    a1.add(44);
    a1.add(45);
    a1.add(46);
    a1.add(47);

    a2.add(101);
    a2.add(102);
    a2.add(103);
    a2.add(104);
    a2.add(105);
    a2.add(106);
    a2.add(107);
    a2.add(108);

    int b1 = a1.set(3,90);
    a2.set(1, 204);

    int[] b2 = {42,43,44,90,46,47,0,0};
    int[] b3 = {101,204,103,104,105,106,107,108,0,0,0,0};

    boolean t1 = b1 == 45;
    boolean t2 = arrayEquals(a1.array, b2);
    boolean t3 = arrayEquals(a2.array, b3);
    boolean t4 = a1.size() == 6;

    if(!t1){
      System.out.println("Failed Set test 1.");
    }
    if(!t2){
      System.out.println("Failed Set test 2.");
    }
    if(!t3){
      System.out.println("Failed Set test 3.");
    }
    if(!t4){
      System.out.println("Failed Set test 4.");
    }
    if(t1&&t2&&t3&&t4){
      System.out.println("All Set tests passed.");
    }
  }

  public static void testRemove(){
    BetterArray a1 = new BetterArray();
    BetterArray a2 = new BetterArray(3);

    a1.add(4);
    a1.add(5);
    a1.add(6);
    a1.add(7);
    a1.add(8);

    a2.add(11);
    a2.add(12);
    a2.add(13);
    a2.add(14);
    a2.add(15);

    int b1 = a1.remove(3);
    int b2 = a2.remove(4);

    int[] b3 = {4,5,6,8,0,0,0,0};
    int[] b4 = {11,12,13,14,0,0};

    boolean t1 = b1 == 7;
    boolean t2 = b2 == 15;
    boolean t3 = arrayEquals(a1.array, b3);
    boolean t4 = arrayEquals(a2.array, b4);
    boolean t5 = a1.size() == 4;

    if(!t1){
      System.out.println("Failed Remove test 1.");
    }
    if(!t2){
      System.out.println("Failed Remove test 2.");
    }
    if(!t3){
      System.out.println("Failed Remove test 3.");
    }
    if(!t4){
      System.out.println("Failed Remove test 4.");
    }
    if(!t5){
      System.out.println("Failed Remove test 5.");
    }
    if(t1&&t2&&t3&&t4&&t5){
      System.out.println("All Remove tests passed.");
    }
  }
}
