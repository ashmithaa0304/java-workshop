public class emplyoeedetails {
   public static void main(String[] args) {
      String[][] employees=new String[5][2];
      employees[0][0] = "40000";
      employees[0][1] = "nivi";
      employees[1][0] = "35000";
      employees[1][1] = "ashmi";
      employees[2][0] = "45000";
      employees[2][1] = "nithi";
      employees[3][0] = "40000";
      employees[3][1] = "john";
      employees[4][0] = "50000";
      employees[4][1] = "deva";
      System.out.println("Employeedetails:");
      for (int i = 0; i < employees.length; i++) {
        System.out.println("salary:" + employees[i][0] + ",Name: " + employees[i][1]);
      }
   }
}   

