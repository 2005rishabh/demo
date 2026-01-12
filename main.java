public class main {
    public static void main(String[] args) {
        String str = "abdabadb";
        String sub = "abd";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        System.out.println(count); 
    }

}
