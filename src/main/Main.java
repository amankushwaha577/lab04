package main;

public class Main {
    public static void main(String[] args) {
        Person myself = new Person("aman",19,'M');
        String Gen;
        if (myself.getGender() == 'M')
        {
            Gen="male";
        }
        else{
            Gen="female";
        }
        System.out.println("Hello , my name is " + myself.getName() +
                ". I am a " + Gen + "and I am " + myself.getAge() + " year old.");
        System.out.println(myself.toString());
        System.out.println(myself);
    }
}
