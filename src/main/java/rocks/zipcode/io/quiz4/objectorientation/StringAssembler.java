package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    Character delimeter;
    ArrayList<String> ans = new ArrayList<>();

    public StringAssembler(Character delimeter){
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        this.ans.add(str);
        return this;
    }

    public String assemble() {
        String answer = "";
        int x = 0;
        for(String string : ans){
            answer += string;
            if(x < this.ans.size() -1){
                answer += delimeter;
            }
            x++;
        }
        return answer;
    }
}
