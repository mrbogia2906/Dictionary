import java.util.Scanner;

public class DictionaryManagement extends Dictionary {
    public static void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("type word");
            Scanner scanner = new Scanner(System.in);
            String target = scanner.nextLine();
            String explain = scanner.nextLine();
            Word word = new Word(target, explain);
            wordArrayList.add(word);
        }
    }

//    public static void main(String[] args) {
//        insertFromCommandline();
//    }

}
