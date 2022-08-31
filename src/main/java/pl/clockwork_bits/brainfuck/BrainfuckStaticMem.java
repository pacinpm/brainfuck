package pl.clockwork_bits.brainfuck;

public class BrainfuckStaticMem implements BrainfuckInterpreter {
    private static final int MEM_SIZE = 30000;
    private byte[] memory = new byte[MEM_SIZE];
    private int ptr = 0;
    private String program;
    private int ip = 0;
    private String input;

    public String step() {
        String output = "";
        char token = program.charAt(ip);
        switch (token) {
            case '>':
                ++ptr;
                break;
            case '<':
                --ptr;
                break;
            case '+':
                ++memory[ptr];
                break;
            case '-':
                --memory[ptr];
                break;
            case '.':
                output += memory[ptr];
                break;
            case ',':
                memory[ptr] = (byte) input.charAt(0);
                input = input.substring(1);
                break;
            case '[':
                break;
            case ']':
                break;
        }
        ip++;
        return output;
    }

    public BrainfuckStaticMem(String program) {
        this.program = program;
    }

    public String run(String input) {
        this.input = input;
        String output = "";
        while (ip < program.length()) {
            output += step();
        }
        return output;
    }

}
