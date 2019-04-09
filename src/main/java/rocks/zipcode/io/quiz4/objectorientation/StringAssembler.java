package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;

    private StringBuilder sb;


    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        sb = new StringBuilder();
    }

    public StringAssembler append(String str) {
        sb.append(str).append(delimeter);
        return this;
    }

    public String assemble() {
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
