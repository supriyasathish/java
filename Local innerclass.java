class Computer {
    private String message = "Hello";
void display() {
class Processor {
  void show() {
    System.out.println("The Message is: " + message);
  }
}
Processor processor = new Processor();
processor.show();
}
public static void main(String[] args) {
Computer computer = new Computer();
computer.display();
    }
}
