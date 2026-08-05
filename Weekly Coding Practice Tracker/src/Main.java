
public class Main {

    public static void main(String[] args) {

        int day = 1;

        int attempted = 0;
        int solved = 0;
        double hours = 0;

        int totalAttempted = 0;
        int totalSolved = 0;
        double totalHours = 0;

        int productiveDays = 0;
        int nonProductiveDays = 0;

        while (day <= 7) {

            if (day == 1) {
                attempted = 10;
                solved = 5;
                hours = 3.5;
            } else if (day == 2) {
                attempted = 7;
                solved = 5;
                hours = 2.0;
            } else if (day == 3) {
                attempted = 9;
                solved = 5;
                hours = 3.5;
            } else if (day == 4) {
                attempted = 5;
                solved = 4;
                hours = 3.0;
            } else if (day == 5) {
                attempted = 5;
                solved = 5;
                hours = 2.0;
            } else if (day == 6) {
                attempted = 6;
                solved = 6;
                hours = 3.0;
            } else if (day == 7) {
                attempted = 7;
                solved = 3;
                hours = 2.0;
            }

            totalAttempted += attempted;
            totalSolved += solved;
            totalHours += hours;

            if (solved >= 5 && hours >= 2) {
                productiveDays++;
            } else {
                nonProductiveDays++;
            }

            day++;
        }
        double successPercentage;
        if (totalAttempted != 0) {
            successPercentage = (double) totalSolved / totalAttempted * 100;
        } else {
            successPercentage = 0;
        }

        double averageSolved = (double) totalSolved / 7;
        String weeklyTarget = (totalSolved >= 35) ? "Achieved" : "Not Achieved";
        String consistency = (productiveDays >= 5) ? "Good" : "Needs Improvement";

        System.out.println("WEEKLY CODING PRACTICE REPORT\n");
        System.out.println("Total Problems Attempted: " + totalAttempted);
        System.out.println("Total Problems Solved: " + totalSolved);
        System.out.printf("Success Percentage: %.2f%%\n", successPercentage);
        System.out.println("Total Practice Hours: " + totalHours);
        System.out.printf("Average Problems Solved Per Day: %.2f\n", averageSolved);
        System.out.println();
        System.out.println("Productive Days: " + productiveDays);
        System.out.println("Non-Productive Days: " + nonProductiveDays);
        System.out.println();
        System.out.println("Weekly Target: " + weeklyTarget);
        System.out.println("Consistency Status: " + consistency);
    }
}
