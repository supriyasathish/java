class Anonymousclass {
    public static void main(String[] args) {
Runnable runnable = new Runnable() {
  @Override
    public void run() {
      System.out.println("Running");
    }
  }
Thread thread = new Thread(runnable);
thread.start();
}
}
