package lesson.stream;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

public class Lesson {

    public static void main(String[] argz){
        System.out.println("qq");
    }

    //найти все книги c определенной ценой
    private List<Book> task1(List<Book> books, Integer price) {
        return null;
    }

    //найти все книги в диапазоне цен, отсортирвоаные по цене
    private List<Book> task2(List<Book> books, Integer priceMin, Integer priceMax) {
        return null;
    }

    //вернуть все книги c автором с определенной фамилией
    private List<Book> task3(List<Book> books, String lastName) {
        return null;
    }

    //найти все неповторяющихся авторов для книг
    private List<Author> task4(List<Book> books) {
        return null;
    }

    //вернуть мапу, где ключ автор - значение список всех его книг
    private Map<Author, List<Book>> task5(List<Book> books) {
        return null;
    }





}
