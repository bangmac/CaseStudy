public class DictionaryControll {
    Controller control = new Controller();
    public static void main (String[] agrs){
        DictionaryControll cmd = new DictionaryControll();
        cmd.control.insertFromFile();
        cmd.control.editWord();
    }
}