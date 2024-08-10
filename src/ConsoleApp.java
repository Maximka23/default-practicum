public class ConsoleApp {

    public static void main(String[] args) {
        String symbol = "*";

        int width = 10;
        int height = 5;
        boolean border = false;

        if (args.length > 0) {
            for (int i = 0; i < args.length; i+=2) {
                String key = "";
                String value = "0";

                if (!args[i].equals("--border")) {
                    key = args[i];
                    value = args[i + 1];
                } else {
                    border = true;
                }

                if (key.equals("--width")) {
                    width = Integer.parseInt(value);
                } else if (key.equals("--height")) {
                    height = Integer.parseInt(value);
                } else if (key.equals("--symbol")) {
                    symbol = value;
                }
            }
        }

        if (!border) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= height; i++) {
                if (i == 1) {
                    System.out.print(" ");
                    System.out.println("-".repeat(width));
                }
                for (int j = 1; j <= width; j++) {
                    if (j == 1) {
                        System.out.print("|");
                    }
                    System.out.print(symbol);
                    if (j == width) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i == height) {
                    System.out.print(" ");
                    System.out.println("-".repeat(width));
                }
            }
        }

    }
}
