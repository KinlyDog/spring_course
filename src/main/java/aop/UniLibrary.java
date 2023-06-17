package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We get a book from UniLibrary");
    }

    public String returnBook() {
        System.out.println("We return book in UniLibrary");
        return "string";
    }

    public void getMagazine() {
        System.out.println("We get a magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("We return a magazine in UniLibrary");
    }

    public void addBook() {
        System.out.println("We add a book in UniLibrary");    }
}
