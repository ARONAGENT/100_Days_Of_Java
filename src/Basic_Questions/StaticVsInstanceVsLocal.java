package Basic_Questions;

public class StaticVsInstanceVsLocal {

    // 🔹 Static variables (class-level, shared across all instances)
    static int x;           // default: 0
    static float a;         // default: 0.0
    static String b;        // default: null
    static double c;        // default: 0.0
    static long d;          // default: 0
    static boolean bool;// default: false
    // 🔹 Instance variables (non-static, object-level)
    int i;              // default: 0
    float f;            // default: 0.0
    double dou;           // default: 0.0
    long l;             // default: 0
    boolean bool1;       // default: false
    char ch;            // default: '\u0000' (null character)
    String str;         // default: null

    // 🔹 Instance variable (object-level, separate for each object)
    int y;                  // default: 0 (will be printed using object)

    public static void main(String[] args) {

        // 🔹 Local variable (defined inside method) — must be initialized manually
        int z; // ❌ Uncommenting `System.out.println(z);` will cause compile-time error

        // ✅ Static variables can be accessed directly in static method
        System.out.println("Static int default: " + x);
        System.out.println("Static float default: " + a);
        System.out.println("Static String default: " + b);
        System.out.println("Static double default: " + c);
        System.out.println("Static long default: " + d);
        System.out.println("Static boolean default: " + bool);

        // ✅ To access instance variable, we need to create an object
        StaticVsInstanceVsLocal obj = new StaticVsInstanceVsLocal();


        // ✅ Print default values of instance variables
        System.out.println("Default int      : " + obj.i);
        System.out.println("Default float    : " + obj.f);
        System.out.println("Default double   : " + obj.dou);
        System.out.println("Default long     : " + obj.l);
        System.out.println("Default boolean  : " + obj.bool1);
        System.out.println("Default char     : " + obj.ch);  // may appear empty
        System.out.println("Default String   : " + obj.str);

        // ❌ Local variable must be initialized, or you'll get a compile-time error
        // System.out.println("Local int default: " + z); // ❌ Error if uncommented
    }
}
