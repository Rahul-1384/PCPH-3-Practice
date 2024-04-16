public class ValidParenthesis1 {
    public static void main(String[] args) {
        String str="{()}[]";
        while(true){
                if(str.contains("[]")){
                    str.replace("[]", " ");
                }
                if(str.contains("()")){
                    str.replace("()", " ");
                }
                if(str.contains("{}")){
                    str.replace("{}", " ");
                }
                else{
                    System.out.println(str.isEmpty());
                    break;
                }
        }
    }
}
