import java.util.Arrays;
import java.util.List;
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



        List<Book> bookListWithDuplicates = Arrays.asList(book1,book2,book3,book1,book2);

        System.out.println("Before removing duplicates");
        System.out.println(bookListWithDuplicates.toString());


    }

}
