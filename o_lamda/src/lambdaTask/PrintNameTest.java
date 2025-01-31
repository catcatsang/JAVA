package lambdaTask;

public class PrintNameTest {
   public void printFullName(PrintName printName, String lastName, String firstName) {
      System.out.println(printName.getFullName(lastName, firstName));
   }
   
   public static void main(String[] args) {
      PrintNameTest printNameTest = new PrintNameTest();
      
      printNameTest.printFullName((l, f) -> l + f, "한",  "동석");
      
//      printNameTest.printFullName(new PrintName() {
//         
//         @Override
//         public String getFullName(String lastName, String firstName) {
//            return lastName + firstName;
//         }
//      }, null, null);
   }

}
