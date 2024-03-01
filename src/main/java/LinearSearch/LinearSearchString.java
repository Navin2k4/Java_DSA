package LinearSearch;
public class LinearSearchString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char target = 'W';
        System.out.println(stringSearch(str,target));
    }
    static boolean stringSearch(String str,char target){
        if(str.length()==0){return false;}
        for(char c : str.toCharArray()){
            if(c==target){
                return true;
            }
        }
        return false;
    }
    
}