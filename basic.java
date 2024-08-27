public class basic{
    public static void main(String[] args) {
        System.out.println("jello");

        Person p1 = new Person(); // here we are calling the constructor which is also a method
        p1.name = "Juhi";
        p1.age = 21;

        Person p2 = new Person(312,"shiva");// another constructor used
        // p2.name = "Harsh";
        // p2.age = 27;

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        p1.eat();
        p2.walk(222);
        
        System.out.println(Person.count);//nu,mber of time the Person() was called
    }
}

class Person{
    String name;
    int age;

    static int count;
    // with static keyword we make propertis of class
    //if you need to make such variables, fields which are going to be constant for the class and won't depend on any object

    //So there you've to use the static keyword. Like I wanted to know how many persons are being created, it can't be a property of a particular person.

    //we wont need to create an object to access this static variable

    public Person(){
        //this is a constructor and its used to make objects; while we run this program we see that the sop stt is printed twice beofre the rest this is because we called the Person() constructor while creating an object and hence it was called
        //this constrictor is defalt as it doesnt require any arguments

        //static keyword is used to make properties of the class
        count++;
        System.out.println("Creating an object");

        //we use constructor while initializing the property we created
    }

    public Person(int newAge, String newName){
        this();//to call one constructor in another constructer we use 'this' keyword
        name = newName;
        age = newAge;
    }

    // COMPILE TIME POLYMORPHISM
    void walk(){
        System.out.println(name+" walks!");
    }

    void eat(){
        System.out.println(name + " eats");
    }

    // COMPILE TIME POLYMORPHISM
    void walk(int steps){
        System.out.println(name+ " walked "+ steps+ " steps.");
    }
}