import java.util.*;
//import java.util.HashSet;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("china", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("SriLank", "Columbo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter the country name: ");
        String country = input.next();
        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));

        } else {
            System.out.println("sorry we don't know the capital");
        }
    }
}
