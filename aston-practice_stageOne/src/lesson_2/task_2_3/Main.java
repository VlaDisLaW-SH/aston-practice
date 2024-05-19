package lesson_2.task_2_3;

public class Main {

    public static void main(String[] args) {

        Computer.Processor processor = new Computer.Processor("Intel");
        System.out.println(processor.getDetails());
        System.out.println();

        Computer computer = new Computer();
        Computer.RAM ram = computer.new RAM(16);
        System.out.println(ram.getDetails());
    }
}
