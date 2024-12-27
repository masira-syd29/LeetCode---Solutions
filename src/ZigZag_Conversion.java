import java.util.ArrayList;
import java.util.List;

public class ZigZag_Conversion {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for(int i=0; i<Math.min(numRows,s.length()); i++){
            rows.add(new StringBuilder());
        }
        int currentRows = 0;
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            rows.get(currentRows).append(c);
            if(currentRows == 0 || currentRows == numRows - 1){
                goingDown = !goingDown;

            }
            currentRows += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }
}
