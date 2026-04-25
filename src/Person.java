public abstract class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //encapsulate
    //getter
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public abstract void displayInfo();
}