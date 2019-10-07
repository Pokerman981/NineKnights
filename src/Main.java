import java.util.*;

public class Main {

    static List<String> stringList = new ArrayList<>();

    public static List<Integer> integerIntegerListX =  new ArrayList<>();
    public static List<Integer> integerIntegerListY =  new ArrayList<>();

    public static List<Boolean> booleans = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        stringList.add(scanner.nextLine());
        stringList.add(scanner.nextLine());
        stringList.add(scanner.nextLine());
        stringList.add(scanner.nextLine());
        stringList.add(scanner.nextLine());


        //The positions of the K's
        for (int i = 0; i < stringList.size(); i++) {
            String str = stringList.get(i);
            for (int w = 0; w < str.length(); w++) {
                char c = str.toLowerCase().charAt(w);
                if (c == 'k') {
                    integerIntegerListX.add(w);
                    integerIntegerListY.add(i);

                }
            }
        }

        if (integerIntegerListX.size() < 9) {
            System.out.println("invalid");
            return;
        }

        if (integerIntegerListX.size() > 10) {
            System.out.println("invalid");
            return;
        }
        //Check if they can attack
        int control = 0;
        for (int num : integerIntegerListX) {
            int key = num;
            int value = integerIntegerListY.get(control);
            if (
                    moveDownLeft(key,value) &&
                            moveDownRight(key,value) &&
                            moveLeftUp(key, value) &&
                            moveLeftDown(key, value) &&
                            moveUpLeft(key, value) &&
                            moveUpRight(key, value) &&
                            moveRightUp(key, value) &&
                            moveRightDown(key, value)) {

                booleans.add(true);
            } else {
                booleans.add(false);
            }
            control++;
        }


        if (booleans.contains(false)) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }

    }

    public static boolean moveDownLeft(int x, int y) {
        int tempOne = x-1;
        int tempTwo = y-2;

        if (tempOne < 0 || tempOne > 5) return  true;
        if (tempTwo < 0 || tempTwo > 5) return  true;


        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }

    public static boolean moveDownRight(int x, int y) {
        int tempOne = x+1;
        int tempTwo = y-2;

        if (tempOne < 0 || tempOne > 5) return  true;
        if (tempTwo < 0 || tempTwo > 5) return  true;

        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }

    public static boolean moveLeftUp(int x, int y) {
        int tempOne = x-2;
        int tempTwo = y+1;

        if (tempOne <= 0 || tempOne >= 5) return  true;
        if (tempTwo <= 0 || tempTwo >= 5) return  true;

        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }

    public static boolean moveLeftDown(int x, int y) {
        int tempOne = x-2;
        int tempTwo = y-1;

        if (tempOne < 0 || tempOne > 5) return  true;
        if (tempTwo < 0 || tempTwo > 5) return  true;

        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }

    public static boolean moveUpLeft(int x, int y) {
        int tempOne = x-1;
        int tempTwo = y+2;

        if (tempOne < 0 || tempOne > 5) return  true;
        if (tempTwo < 0 || tempTwo > 5) return  true;

        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }

    public static boolean moveUpRight(int x, int y) {
        int tempOne = x+1;
        int tempTwo = y+2;

        if (tempOne < 0 || tempOne > 5) return  true;
        if (tempTwo < 0 || tempTwo > 5) return  true;

        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }

    public static boolean moveRightUp(int x, int y) {
        int tempOne = x+2;
        int tempTwo = y+1;

        if (tempOne < 0 || tempOne > 5) return  true;
        if (tempTwo < 0 || tempTwo > 5) return  true;

        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }

    public static boolean moveRightDown(int x, int y) {
        int tempOne = x+2;
        int tempTwo = y-1;

        if (tempOne < 0 || tempOne > 5) return  true;
        if (tempTwo < 0 || tempTwo > 5) return  true;

        int control = 0;
        for (int num2 : integerIntegerListX) {
            if ((tempOne == num2 ) && (integerIntegerListY.get(control) == tempTwo)) {
                return false;
            }
            control++;
        }
        return true;
    }


}
