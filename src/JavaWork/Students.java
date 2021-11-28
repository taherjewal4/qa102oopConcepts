package JavaWork;

public class Students { //box

    private String name;
    private int id;
    // Class = is A blueprint of an object
    // Object = Object is an instance of a class

    public Students() {

    }

    public Students(String name) { //"david
        this.name = name;
    }

    public Students(String name, int id) { //"adam
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

//    public String studentName(String name4) {
//        String name1 = name;
//        return name1;
//    }
//
//    public int studentID() {
//        System.out.println(name);
//        return id;
//    }
//
//    public void studentSection() {
//        System.out.println("This is a student Section method");
//    }
}


