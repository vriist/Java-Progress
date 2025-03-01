import java.util.Scanner;
public class PatientTest {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); // numbers
        Scanner string = new Scanner(System.in); // strings


        System.out.println("How many patients are there?: ");
        int patientcount = num.nextInt();


        String[] name = new String[patientcount];
        int [] age = new int[patientcount];
        int[] pain = new int[patientcount];
        String [] insurance = new String[patientcount];

        for(int x = 0; x < patientcount ; x++) {

            System.out.println("Patient " + (x + 1));
            System.out.println("Patient name: ");
            name[x] = string.nextLine();

            System.out.println("Patient age: ");
            age[x] = num.nextInt();

            System.out.println("Patient pain level: ");
            pain[x] = num.nextInt();

            System.out.println("Does patient have insurance?: ");
            insurance[x] = string.nextLine();

        }

        boolean menustatus = true;

        while(menustatus = true) {

            System.out.println("1. Change pain level of patient.");
            System.out.println("2. Output all patients information.");
            System.out.println("3. Output patient names at or above a certain pain thershold.");
            System.out.println("4. Quit");

            int menuinput = num.nextInt();

           if(menuinput == 1) {
            System.out.print("Enter the player's name to change thier pain level: ");
                String PatientName = string.nextLine();
                boolean found = false;

                for (int i = 0; i < patientcount; i++) {
                    if (name[i].equalsIgnoreCase(PatientName)) {
                        System.out.print("Enter the new pain number: ");
                        pain[i] = num.nextInt();
                        found = true;
                        System.out.println("Pain Level changed");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Player not found");
                }
           }

           else if(menuinput == 2) {

            System.out.println("Patients: ");

            for(int x = 0; x < patientcount; x++) {
                System.out.println("Patient name: " + name[x] + ", Age: " + age[x] + ", Pain Level: " + pain[x] + ", Insurance: " + insurance[x]);

            } 
           }

           if(menuinput == 3) {
            System.out.print("Output patients with pain levels at or above: ");
                int weightThreshold = num.nextInt();
                Patient.above(name, pain, weightThreshold);
           }

           else if(menuinput == 4) {
            num.close();
            string.close();
            menustatus = false;
           }
        }
    }
}


