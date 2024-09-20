import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class QueHashMap
                         {
    public static void main(String[] args) {
       
        HashMap<String, List<String>> departmentEmployees = new HashMap<>();
        
        
        departmentEmployees.put("IT", List.of("John Doe", "Jane Smith", "Alice Johnson"));
        departmentEmployees.put("HR", List.of("Mark Spencer", "Lucy Brown"));
        departmentEmployees.put("Finance", List.of("Tom White", "Emma Wilson"));

        
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println("Department: " + department);
            System.out.println("Employees: ");
            for (String employee : employees) {
                System.out.println(employee);
            }
            System.out.println();  
        }
    }
    }



