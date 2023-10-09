package processes;

public class VowelCounter {
    public static void main(String[] args) {
        char character = args[0].charAt(0);
        String text = args[1];
        int contador = 0;


        for (int i = 0; i < text.length(); i++) {
            if (character == text.charAt(i)) {
                 contador++;
            }
        }
        System.out.println(contador);
    }
}
