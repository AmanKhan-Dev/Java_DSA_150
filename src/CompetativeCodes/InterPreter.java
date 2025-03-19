package CompetativeCodes;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

class Main {

    public static DecimalFormat formatter = new DecimalFormat("000");

    public static int doOperation(String[] ram, int index, int[] register) {
        String s = ram[index];
        int opcode = s.charAt(0) - '0';
        int r1 = s.charAt(1) - '0';
        int r2 = s.charAt(2) - '0';

        switch (opcode) {
            case 0:
                return (register[r2] != 0) ? register[r1] : index + 1;
            case 1:
                return -1; // Halt execution
            case 2:
                register[r1] = r2;
                break;
            case 3:
                register[r1] = (register[r1] + r2) % 1000;
                break;
            case 4:
                register[r1] = (register[r1] * r2) % 1000;
                break;
            case 5:
                register[r1] = register[r2];
                break;
            case 6:
                register[r1] = (register[r1] + register[r2]) % 1000;
                break;
            case 7:
                register[r1] = (register[r1] * register[r2]) % 1000;
                break;
            case 8:
                register[r1] = Integer.parseInt(ram[register[r2]]);
                break;
            case 9:
                ram[register[r2]] = formatter.format(register[r1]);
                break;
        }
        return index + 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        br.readLine();

        for (int testCase = 0; testCase < testCaseCount; testCase++) {
            String[] ram = new String[1000];
            Arrays.fill(ram, "000");
            int ramIndex = 0;
            String s;
            while ((s = br.readLine()) != null && !s.isEmpty()) {
                ram[ramIndex++] = s;
            }

            int[] register = new int[10];
            int currPC = 0;
            int count = 0;
            while (currPC != -1 && currPC < ram.length) {
                currPC = doOperation(ram, currPC, register);
                count++;
            }

            System.out.println(count);
            if (testCase < testCaseCount - 1) System.out.println();
        }
    }
}
