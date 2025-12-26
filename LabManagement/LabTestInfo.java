import java.util.ArrayList;
import java.util.List;

public class LabTestInfo {

    private List<String> testList;

    // Constructor
    public LabTestInfo() {
        testList = new ArrayList<>();
    }


    public void addTestDetails(String testDetails) {
        // testDetails format: testName:cost
        if (testDetails.contains(":")) {
            testList.add(testDetails);
        } else {
            System.out.println("Invalid test detail format. Use testName:cost");
        }
    }


    public List<String> getTestsWithinGivenCostRange(int minimumCost, int maximumCost) {
        List<String> filteredTests = new ArrayList<>();

        for (String testDetail : testList) {
            String[] parts = testDetail.split(":");
            String testName = parts[0];
            int cost = Integer.parseInt(parts[1]);

            if (cost >= minimumCost && cost <= maximumCost) {
                filteredTests.add(testName);
            }
        }

        return filteredTests;
    }
}
