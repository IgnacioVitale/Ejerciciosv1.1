import java.util.Arrays;

public class Eliminar_Repetidos {

    public static void main(String[] args) {
        String hola="abcd";
        char[] test=hola.toCharArray();
        Eliminar_repetidos(test);
        for (char c:test) {
            if(c==0) break;
            System.out.print(c);

        }

    }




    public static void Eliminar_repetidos(char[] str){
        if(str==null) return;
        int len = str.length;
        if (len<2) return;

        int tail=1;
        int i=1;
        int j=0;

        for (i=1;i<len;++i){
            for (j=0;j<tail;++j){
                if(str[i]==str[j]) break;
            }
            if (j==tail){
                str[tail]=str[i];
                ++tail;
            }
        }if(tail<len){str[tail]=0;}

    }
}
