package hbcu.stay.ready.mastering_loops;


public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

       int count = numberOfRows;
       String newerString = "";
        StringBuilder r = new StringBuilder();
        for (int i = 1; i < count; i++) {
            r.append("*");
            String newString = r.toString();
            newerString += newString + "\n";
        }
       return newerString;

    }







    public static String getRow(int numberOfStars) {
        String aRow = "";
        for (int i = 0; i < numberOfStars; i++) {
            String formRow = "*";
            aRow = aRow + formRow;
        }
        return aRow;
    }

    public static String getSmallTriangle() {

        String newerString = "";
        StringBuilder r = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            r.append("*");
            String newString = r.toString();
            newerString += newString + "\n";
        }
        return newerString;
    }

    public static String getLargeTriangle() {

        String newerString = "";
        StringBuilder r = new StringBuilder();
        for (int i = 1; i <10; i++) {
            r.append("*");
            String newString = r.toString();
            newerString += newString + "\n";
        }
        return newerString;
    }
}
