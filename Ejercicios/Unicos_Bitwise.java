public class Unicos_Bitwise {
    public static void main(String[] args) {
        String str="qwertyuiopasdfghjklzxcvbnm";
        System.out.println(Unicos(str));

    }

    private static boolean Unicos(String str) {
        str.toLowerCase();
        char c;
        int index=0;
        int check=0;
        for (int i=0;i<str.length();i++){
            c=str.charAt(i);
            index=(int) c-'a';
            if((check&(1<<index))>=1){
                return false;
            }
            check=(check|(1<<index));
        }
        return true;
    }
}


