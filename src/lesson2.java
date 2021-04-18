public class lesson2 {
    public static void main(String[] args) {
       /*greetingWorld();
        greetingAlexey();
        greeting("Oleg!");
        greeting("Russia!");*/


       /* sumAB(2, 3);//5
        sumAB(5, 15);//20*/
     /*  int res1 = sumAB(2, 3);//5
        System.out.println(res1);
       int res2 = sumAB(5, 15);//20
        System.out.println(res2);*/
        //упрощаем
        int res1 = sumAB(2, 3);//5
        System.out.println(res1);
        System.out.println(sumAB(5, 15));


    }

  /*  private static void sumAB() {
        int a = 3;
        int b = 5;
        int result = a + b;
        System.out.println(result);
    }*/
   /* private static void sumAB(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }*/
    //изменить возвращаемое значение
    /*private static int sumAB(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;*/
/*}*/
  private static int sumAB(int a, int b) {
      return a + b;
  }







        private static void greetingAlexey() {
        System.out.println("Hello, Alexey!");
    }

    private static void greetingWorld() {
        System.out.println("Hello, World!");

    }

    private static void greeting(String name) {
        System.out.println("Hello, " + name);

    }
/*    private static void greeting() {
        String name = "Oleg";
        System.out.println("Hello, " + name);*/
    }







