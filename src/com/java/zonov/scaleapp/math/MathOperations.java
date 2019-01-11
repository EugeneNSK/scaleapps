package com.java.zonov.scaleapp.math;

public class MathOperations {
    private static int result;

    public static int doMath(String[] args) {

        int[] data = new int[args.length - 1];

        String mathOperation = args[0];

        for (int i = 0; i < data.length; i++) {
            try {
                data[i] = Integer.parseInt(args[i + 1]);
            } catch (NumberFormatException e) {
                System.err.println(args[i + 1] + " : is not an integer number");
                System.exit(2);
            }
        }

        switch (mathOperation.toUpperCase()) {
            case "ADD": {
                for (int i = 0; i < data.length; i++) {
                    result += data[i];
                }
                break;
            }
            case "MUL": {
                result = 1;
                for (int i = 0; i < data.length; i++) {
                    result *= data[i];
                }
                break;
            }
            case "COMPL": {
                if (data.length==3) {
                    result = data[0] * data[1] + data[2];
                }else {
                    System.err.println("Not enough data for COMPLEX math operation");
                    System.exit(2);
                }
                break;
            }
            default: {
                System.err.println("Wrong Math operation: " + mathOperation);
                System.exit(2);
            }
        }
        return result;
    }
}
