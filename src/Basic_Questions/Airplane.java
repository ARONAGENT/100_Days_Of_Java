package Basic_Questions;

import java.util.Objects;

public class Airplane {
    String airlineType;

    public Airplane(String airlineType) {
        this.airlineType = airlineType;
    }

    @Override
    public boolean equals(Object obj) {
       Airplane airplane= (Airplane) obj;
       return Objects.equals(this.airlineType, airplane.airlineType);
       // this.airlineType means line no 9 ka this.airlinetype
        // airplane.airlineType matalab current object jo ki paas kiya gaya
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(airlineType);
    }
}
