public class Main {
    public static void main(String[] args)
     {
        Feeder f = new Feeder();
        System.out.println(f);
        //System.out.println(f.currentFood);
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(12);
        System.out.println(Math.random());
        int random = (int) (Math.random() * 10);
        System.out.println(random);
     }
}
