public class leet {
    public static void main(String[] args) {
        String details[]={"7868190130M7522","5303914400F9211","9273338290F4010"};
        for(int i=0;i<details.length;i++){
            char number=' ';
            String str=details[i];
            for(int j=0;j<str.length();j++){
                if(j==11 || j==12){
                    number=str.charAt(j);
                    System.out.println(number);
                }
            }
        }
    }
}
