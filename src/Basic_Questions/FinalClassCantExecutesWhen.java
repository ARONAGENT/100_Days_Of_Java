package Basic_Questions;

public class FinalClassCantExecutesWhen {
    public static void main(String[] args) {

            try {
                System.out.println("Inside try");
                System.exit(0); // Forcefully exits JVM
            }
            catch (Exception e){
                System.out.println(e);
            }
            finally {
                System.out.println("Inside finally"); // ❌ Won’t be executed
            }


            // 2. if JVM crashes in some cases
            //3 . infinite loops and recursive function  calling itself
        }
    }
