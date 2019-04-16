package hellocucumber;

public class IsItMyBike {

    static String isItMyBike(String search) {
        if (search.matches("^[Rr].*")) {
            return search;
        }
        return "No";
    }

    static String iWantThatBike(String brake, String color, String brand) {
        if (brake.equalsIgnoreCase("hand") && color.equalsIgnoreCase("black") && brand.equalsIgnoreCase("electra")) {
            return "Yes";
        }
        return "No";
    }
}
