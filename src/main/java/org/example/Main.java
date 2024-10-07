import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static String ReverseString(String str) {
        String originalStr = str;
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        return reversedStr;
    }
    public static void IntArrayProgram(){
        int[] Massive;
        int Random = (int) (Math.random() * 100);
        Massive = new int[Random];
        int size = Random - 1;

        for(int i = 0; i <= size; i++){
            Random = (int) (Math.random() * 100);
            Massive[i] = Random;
            String Index = i + 1 + "";
            System.out.println("Number "+ Index +" = "+ Massive[i]);
        }
    }

    public static void StringArrayProgram(){
        String[] StringArray = new String[10];
        StringArray[0] = "Hello";
        StringArray[1] = "World";
        StringArray[2] = "Penis";
        StringArray[3] = "Dick";
        StringArray[4] = "Hui";
        StringArray[5] = "Mamuka";
        StringArray[6] = "Bober";
        StringArray[7] = "Mandust";
        StringArray[8] = "Nigga";
        StringArray[9] = "Pelmeni";

        int length = StringArray.length - 1;

        for (int i = length; i >= 0; i--) {
            StringArray[i] = StringArray[i] + "!";
            int Lenght = StringArray[i].length();
            StringArray[i] = ReverseString(StringArray[i]);
            System.out.println(Lenght +" = "+ StringArray[i]);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Runnable> ProgramsMap = new HashMap<>();
        ProgramsMap.put("StringArrayProgram",() -> StringArrayProgram());
        ProgramsMap.put("IntArrayProgram",() -> IntArrayProgram());

        System.out.println("   Choose the program: ");
        ArrayList<String> keyList = new ArrayList<>(ProgramsMap.keySet());

        for (int i = 0; i < keyList.size(); i++) {
            System.out.println(i +": "+keyList.get(i));
        }
        int size = ProgramsMap.size() - 1;
        System.out.print("(0-"+size+"): ");
        int CurrentProgram = new Scanner(System.in).nextInt();
        while ((CurrentProgram > size) || (0 > CurrentProgram)){
            System.out.println("Choose the available one");
            System.out.print("(0-"+size+"): ");

            CurrentProgram = new Scanner(System.in).nextInt();
        }
        String ProgramName = keyList.get(CurrentProgram);
        System.out.println("Running " + ProgramName);
        ProgramsMap.get(ProgramName).run();
    }

}
