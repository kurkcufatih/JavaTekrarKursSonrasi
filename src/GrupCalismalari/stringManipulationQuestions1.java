package pazartesicalisma;
public class stringManipulationQuestions1 {
    public static void main(String[] args) {
        // string metodlarini kullanarak "Java ogrenmek123 Cok guzel@"
        // stringini "Java ogrenmek cok guzel seklinde duzeltiniz"
        String cumle= "Java ogrenmek123 Cok guzel@";
        cumle=cumle.replaceAll("\\d", "").replace("C", "c")
                .replace("@", " ");
        System.out.println(cumle);
    }
}