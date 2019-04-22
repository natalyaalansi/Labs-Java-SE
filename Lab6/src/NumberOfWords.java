public class NumberOfWords {
    public static void main(String[] args) {
        String sentence = "   bbbb gbgbgg   ";

        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            boolean n = Character.isLetter(sentence.charAt(i));
            if (n == true) {
                letters++;
            }
        }
        System.out.println("Число букв в строке: " + letters);

        int numberOfWords = 0;
        boolean word = false;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i)) && i != sentence.length()-1) {
                word = true;
            }
            else if (!Character.isLetter(sentence.charAt(i)) && word) {
                numberOfWords++;
                word = false;
            }
            else if (Character.isLetter(sentence.charAt(i)) && i == sentence.length()-1) {
                numberOfWords++;
            }
        }
        System.out.println("Число слов в строке: " + numberOfWords);
    }

}

