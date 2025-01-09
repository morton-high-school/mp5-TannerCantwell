public class tester {
    public static void main(String[] args) {
        BetterArray a1 = new BetterArray();
        BetterArray a2 = new BetterArray(12);
    
        a1.add(42);
        a1.add(43);
        a1.add(44);
        a1.add(45);
        a1.add(46);
        a1.add(47);
        a1.add(3, 6);
    
        a2.add(101);
        a2.add(102);
        a2.add(103);
        a2.add(104);
        a2.add(105);
        a2.add(106);
        a2.add(107);
        a2.add(108);

        System.out.println(a1.array[6]);
    }
}
