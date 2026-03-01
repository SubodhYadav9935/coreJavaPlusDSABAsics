package String;

public class Strings {
    public static void someThing(String s){
        for(int i=0;i<s.length();i++){
            if(i>=4){
                System.out.println();
            }
        }
    }
    public static boolean palinDrome(String str){
        int n = str.length();
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }

        }
        return true;
    }
    public static float getShortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i<str.length();i++){
            char Dir = str.charAt(i);
            if(Dir == 'S'){
                y--;
            } else if (Dir == 'N') {
                y++;
            } else if (Dir == 'W') {
                x--;
            } else if (Dir == 'E') {
                x++;
            }
            else{
                System.out.println("Invalid Direction");
            }

        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void subString(String str,int si,int ei){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length()-1;j++){
                if(j<=str.length()/2) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.println("-----");
                    break;
                }

            }
            break;
        }
    }

    public static String toUpperCase(String str){
        StringBuilder sb =  new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1 ;  i<str.length();i++){
           if(str.charAt(i) == ' ' && i<str.length()-1){
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
           }else{
               sb.append(str.charAt(i));
           }
        }
        return sb.toString();
    }
    public static String toCompress(String str){
        String newStr = "";
        for(int i =0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
      String s = "igiisssstttudy";
        System.out.println(toCompress(s));
    }
}
