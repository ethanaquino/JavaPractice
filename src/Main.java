public class Main {
    public static int Square(int x) {
        return x*x;
    }

    public static int countA(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a' || word.charAt(i)=='A') {
                count++;
            }
        }
        return count;
    }

    public static String PetRock(int x) {
        String Pet = "";
        x = 3;
        if (x == 3) {
            Pet = "Rocky";
        }
        return Pet;
    }
}
