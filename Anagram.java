import java.util.Arrays;

public class Anagram {

    public static void main(String args[]) {
        String a = "niwde";
        String b = "edwin";
        int count = 0;
        int count1 = 0;

        if (a.equals(b)) {

            System.out.println("Anagram");
        } else if (!a.equals(b)) {
            System.out.println("not anagaram");
        }

StringBuilder e = new StringBuilder();
        char[] c= a.toCharArray();
        for(int i=0;i<=c.length-1;i++){
            for(int j = i+1; j<=c.length-1; j++){
                if(c[i]>c[j]){
                    char temp = c[i];
                    c[i]= c[j];
                    c[j]=temp;
                }
            }
            e.append(c[i]);
        }
        System.out.print(e);
        System.out.println();
        StringBuilder f = new StringBuilder();

        char[] d= b.toCharArray();

        for(int i=0;i<=d.length-1;i++){
            for(int j = i+1; j<=d.length-1; j++){
                if(d[i]>d[j]){
                    char temp = d[i];
                    d[i]= d[j];
                    d[j]=temp;
                }
            }
            f.append(d[i]);
        }
        System.out.print(f+"\n");
        System.out.println(e.length()+"      "+f.length());
        if(f.toString().equals(e.toString())){
            System.out.println("Anagram ...............");
        } else if (!e.equals(f)) {
            System.out.println("Not Anagram....");

        }

    }
}
