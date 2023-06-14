package spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean", Pet.class);
        Pet cat1 = context.getBean("catBean", Pet.class);

        Person person = context.getBean("personBean", Person.class);
        person.getAge();
        System.out.println(person.getSurname());
        person.callYourPet();

//        Person person1 = context.getBean("personBean", Person.class);
//        person1.callYourPet();


        context.close();
    }
}
