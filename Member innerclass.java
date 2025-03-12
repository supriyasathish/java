class Computer {
    private String message = "Hello";
class Processor {
    void show() {
    System.out.println("The Message is: " + message);
        }
    }
public static void main(String[] args) {
    Computer computer = new Computer();
    Computer.Processor processor = computer.new Processor();
    processor.show();
    }
}
