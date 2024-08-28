package JV;

public class Conditional {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // If-else demonstration
        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("A is less than B");
        } else {
            System.out.println("A is equal to B");
        }

        // Ternary operator demonstration
        String result = (a > b) ? "A is greater" : "A is not greater";
        System.out.println(result);

        // Switch case demonstration
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day " + day + " is " + dayName);
    }
}

