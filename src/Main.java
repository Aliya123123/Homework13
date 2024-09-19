import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        Author author1 = new Author("Кристиан ", "Ханс");
        Author author2 = new Author("Шарль ", "Перро");
        Book one = new Book ("Русалочка",author1, 2013);
        Book two  = new Book ("Золушка",author2,2020 );
        System.out.println(one);
        System.out.println(two);
        one.setYearBook(2016);
        System.out.println("YearBook = " + one.getYearBook());
        System.out.println(one.equals(two));
        System.out.println(author1.equals(author2));
        System.out.println(Objects.hash());
    }}

