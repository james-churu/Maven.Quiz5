package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    String string;

    public StringEvaluatorObject(String str) {
        this.string = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(this.string);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(this.string , secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(this.string , secondInput);
    }
}
