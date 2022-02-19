package CH3;

import java.util.Scanner;

public class SearchForDomainName {
    public static void main(String [ ] args) {
        Scanner scnr = new Scanner(System.in);
        String inputName;
        String searchName;
        String coreGtld1;
        String coreGtld2;
        String coreGtld3;
        String coreGtld4;
        // FIXED: Add a fourth core gTLD: .info
        boolean isCoreGtld;

        coreGtld1 = ".com";
        coreGtld2 = ".net";
        coreGtld3 = ".org";
        coreGtld4 = ".info";
        isCoreGtld = false;

        System.out.println("\nEnter a top-level domain name: ");
        inputName  = scnr.nextLine();
        // Case is irrelevant, so make all comparisons with lower case
        searchName = inputName.toLowerCase();

        // FIXED: Allow the user to enter a name with or without a leading period
        if ((searchName.length() > 0) && (searchName.charAt(0) != '.')) {
            searchName = "." + searchName;
        }
        // Determine whether the user-entered name is a gTLD
        if (searchName.compareTo(coreGtld1) == 0) {
            isCoreGtld = true;
        }
        else if (searchName.compareTo(coreGtld2) == 0) {
            isCoreGtld = true;
        }
        else if (searchName.compareTo(coreGtld3) == 0) {
            isCoreGtld = true;
        }
        else if (searchName.compareTo(coreGtld4) == 0) {
            isCoreGtld = true;
        }
        else {
            isCoreGtld = false;
        }

        System.out.print("The name \"" + inputName + "\" ");
        if (isCoreGtld) {
            System.out.println("is a core gTLD.");
        }
        else {
            System.out.println("is not a core gTLD.");
        }

        return;
    }
}
