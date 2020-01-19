import java.util.*;
import java.util.stream.Collectors;

public class aggregate {

    public static void main(String[] args) {
        Book book1 = new Book("Miss Peregrines's Home for Peculiar Children","Ranson","Riggs" , 382);
        Book book2 = new Book("Harry Potter And the sorcerers Stone","JK","Rowling" , 411);
        Book book3 = new Book("The Cat in the Hat","Dr","Seuss" , 45);

        List<Book> bookList = Arrays.asList(book1,book2,book3);

        int total = bookList.stream()
                .collect(Collectors.summingInt(Book::getPages));
        System.out.println(total);

        List<String> firstNameOfAuthorList = bookList.stream()
        .map(Book::getAuthorFName)
        .collect(Collectors.toList());

        System.out.println(firstNameOfAuthorList);



        List<Book> bookListWithDuplicates = Arrays.asList(book1,book2,book3,book1,book2);

        System.out.println("Before removing duplicates");
        System.out.println(bookListWithDuplicates.toString());

        Collection<Book> nonDuplictedBooks = new HashSet<>();

        System.out.println("After removing duplicates");
        System.out.println(nonDuplictedBooks.toString());


    }

}
