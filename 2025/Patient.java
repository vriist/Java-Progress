public class Patient {

    private String name;
    private int age;
    private int pain;
    private String insurance;
    
    public Patient() {

        this.name = "none";
        this.age = 0;
        this.pain = 0;
        this.insurance = "N";
        
    }

    public Patient(int age, int pain, boolean insurance, String name) {
        this.age = age;
        this.name = name;
        this.pain = pain;
        this.insurance.equals(insurance);

    }

    public String getName() {
        return name;
    }

    public int getPain() {
        return pain;
    }

    public void setPain(int pain) {
        this.pain = pain;
    }


    public static void above(String[] name, int[] pain, int painThreshold) {
        System.out.println("Patients above " + painThreshold + " pain level");
        boolean found = false;
        for (int i = 0; i < pain.length; i++) {
            if (pain[i] > painThreshold) {
                System.out.println("Name: " + name[i] + ", Pain Level: " + pain[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No players above given weight.");
        }
    }
}
