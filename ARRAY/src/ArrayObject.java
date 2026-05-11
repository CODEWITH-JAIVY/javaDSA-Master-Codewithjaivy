public class ArrayObject {

    int roll;
    String name;
    String cource;

    ArrayObject(int roll, String name, String cource) {
        this.roll = roll;
        this.name = name;
        this.cource = cource;
    }

    void display() {
        System.out.println("Roll: " + roll +
                "\nName: " + name +
                "\nCourse: " + cource + "\n");
    }

    public static void main(String[] args) {
        ArrayObject[] arrayObjects = new ArrayObject[3];

        try {
            arrayObjects[0] = new ArrayObject(123, "Jaivy Roy", "BCA");
            arrayObjects[1] = new ArrayObject(654, "Sanjeet Kumar", "BCA");
           // arrayObjects[2] = new ArrayObject(789, "Rahul Sharma", "MCA"); // ✅ initialized
        } catch (Exception e) {
            System.out.println("solve the error: " + e.getMessage());
        }

        for (int i = 0; i < arrayObjects.length; i++) {
//            if (arrayObjects[i] != null) {  // ✅ null check
              try {
                  arrayObjects[i].display();
              } catch (Exception e) {
                  System.out.println(   "resolve the error  " + e.getMessage() );
              }

        }
    }
}
