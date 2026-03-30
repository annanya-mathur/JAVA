public class Main
{
 public static void main(String[] args) {

  Runnable a = () -> {
    for(int i =0; i<10; i++) {
     System.out.println("Running 1st Thread");
     try {
      Thread.sleep(100);
     }
     catch (Exception e) {}
   }
  };

  Runnable b = () -> {
    for(int i =0; i<10; i++) {
     System.out.println("Running 2nd Thread");
     try {
      Thread.sleep(100);
     }
     catch (Exception e) {}
   }
  };

  Thread t1 = new Thread(a);
  Thread t2 = new Thread(b);

  t1.start();
  t2.start();

 }
}
