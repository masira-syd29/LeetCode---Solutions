public class CheckIfAllAsAppearBeforeBs {
    public boolean checkString(String s) {
        //Bruteforce approach
        // boolean bEncountered = false;
        // for(char c : s.toCharArray()){
        //     if(c == 'b'){
        //         bEncountered = true;
        //     } else if (c=='a' && bEncountered ) {
        //         return false;
        //     }
        // }
        // return true;

        //Optimal Approach
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == 'b' && s.charAt(i) == 'a'){
                return false;
            }
        }
        return true;
    }
}
