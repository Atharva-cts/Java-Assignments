import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LabTestInfo lab = new LabTestInfo();


        System.out.println("Enter the number of lab test details to be added");
        int n = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter lab test details (testName:cost)");
        for (int i = 0; i < n; i++) {
            String details = sc.nextLine();
            lab.addTestDetails(details);
        }


        System.out.println("Enter the minimum cost");
        int minCost = sc.nextInt();
        System.out.println("Enter the maximum cost");
        int maxCost = sc.nextInt();


        List<String> testlist = lab.getTestsWithinGivenCostRange(minCost, maxCost);


        if (testlist.isEmpty()) {
            System.out.println("No Tests found within the specified cost range");
        } else {
            System.out.println("Tests with cost between " + minCost + " and " + maxCost + " INR:");
            for (String testName : testlist) {
                System.out.println(testName);
            }
        }

        sc.close();
    }
}
