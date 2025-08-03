package java5;
enum Status {
    SUCCESS(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    // Constructor
    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // Method
    public String getFormatted() {
        return code + ": " + message;
    }
}
public class RealWorldAPP {
    public static void main(String[] args) {
        for (Status s : Status.values()) {
            System.out.println(s.getFormatted());
        }
    }
}
