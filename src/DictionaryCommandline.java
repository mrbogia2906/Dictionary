import java.io.PrintStream;

public class DictionaryCommandline extends DictionaryManagement {

    public static void showAllWords() {
        System.out.format("%-5s %s %-10s %s %-10s\n",
                "No",
                "|",
                "English",
                "|",
                "Vietnamese");
        for (int i = 0; i < wordArrayList.size(); i++) {
            Word word = wordArrayList.get(i);
            System.out.format("%-5s %s %-10s %s %-10s\n",
                    Integer.toString(i + 1),
                    "|",
                    word.getWord_target(),
                    "|",
                    word.getWord_explain());
//            System.out.println(word.getWord_target() + " " + word.getWord_explain());
        }
    }

    public static void dictionaryBasic() {
        insertFromCommandline();
        showAllWords();
    }

    public static void main(String[] args) {
        try
        {
            dictionaryBasic();
        }
        catch (NullPointerException e) {}
    }
}
