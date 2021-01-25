package com.maven.spring.Main;


import com.maven.spring.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.maven.spring.bean.Book;


import java.util.ArrayList;
import java.util.List;

class StudentTest {


    @Test
    void addBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book("123","admin","1");
        bookService.addBook(book);

    }
    @Test
    void delBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("123");

    }
    @Test
    void selectAllBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book("123","admin","1");
        bookService.addBook(book);

    }
    @Test
    void updateBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book("123","user","0");
        bookService.updateBook(book);

    }

    @Test
    void selectTalesCount() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.selectTablesCount();
        System.out.println(count);

    }

    @Test
    void selectBookAll() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.selectAllBook();
        System.out.println(bookList);

    }
    @Test
    void conditionsSelect() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.selectConditions("0");
        System.out.println(bookList);

    }

    @Test
    void selectBookObject() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.selectBookObject("124");
        System.out.println(book);

    }
    @Test
    void selectBookLike() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List bookList = bookService.selectBookLike("root");
        System.out.println(bookList);

    }

    @Test
    void selectBookPage() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List bookList = bookService.selectBookPage(0,2);
        System.out.println(bookList);

    }

    @Test
    void batchAddBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3","java","a"};
        Object[] o2 = {"4","c++","b"};
        Object[] o3 = {"5","MySQL","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAddBook(batchArgs);

    }
    @Test
    void batchUpdateBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java0909","a3","3"};
        Object[] o2 = {"c++1010","b4","4"};
        Object[] o3 = {"MySQL1111","c5","5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdateBook(batchArgs);

    }

    @Test
    void batchDeleteBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDeleteBook(batchArgs);

    }


}
