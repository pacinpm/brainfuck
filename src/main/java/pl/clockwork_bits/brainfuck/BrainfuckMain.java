package pl.clockwork_bits.brainfuck;

public class BrainfuckMain {
    public static void main(String[] args) {
        String input = "";
        String program="+";
        BrainfuckInterpreter interpreter = new BrainfuckStaticMem(program);
        String output = interpreter.run(input);
        System.out.println("Output: " + output);
    }
}
