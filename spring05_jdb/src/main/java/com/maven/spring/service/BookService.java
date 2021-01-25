package com.maven.spring.service;

import com.maven.spring.bean.Book;
import com.maven.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import java.util.List;

@Service //创建BookService对象
public class BookService {
    //注入Dao
    @Autowired
    private BookDao bookDao;

    //添加方法
    public void  addBook(Book book){
    bookDao.add(book);
    }

    /**
     * 修改图书
     * @param book 一个图书对象
     */
    public   void updateBook(Book book){

        bookDao.updateBook(book);

    }

    /**
     * 删除图书
     * @param id
     */
    public void  deleteBook(String id) {
     bookDao.deleteBook(id);
    }

    /**
     * 查询所有的图书
     * @return 返回一个List集合
     */
    public  List<Book> selectAllBook(){
        List<Book> bookList = bookDao.selectAllBook();
        return bookList;
    }

    /**
     * 查询book 中有多少条记录
     *
     * @return 返回表中的总记录数
     */
    public int selectTablesCount() {
        int count = bookDao.selectTablesCount();
        return count;
    }

    /**
     * 按条件查询表中满足条件的记录
     *
     * @return 返回一个List集合
     */
    public List<Book> selectConditions(String ustatus) {
        List<Book> bookList = bookDao.conditionsSelect(ustatus);
        return bookList;
    }

    /**
     * 按条件查询表中满足条件的某一条记录
     *
     * @return 返回一个Book对象
     */
    public Book selectBookObject(String id) {
        Book book = bookDao.selectBookObject(id);
        return book;
    }

    /**
     * 按条件模糊查询
     *
     * @param username
     * @return 返回一个List集合
     */

    public List<Book> selectBookLike(String username) {
        List<Book> bookList = bookDao.selectBookLike("%"+username+"%");
        return bookList;

    }

    /**
     * 分页查询
     *
     * @param begin 开始位置索引
     * @param stop  结束位置索引
     * @return 返回一个List集合
     */

    public List<Book> selectBookPage(int begin, int stop) {
        List<Book> bookList = bookDao.selectBookPage(begin, stop);
        return bookList;

    }


    /**
     * 批量添加数据
     *
     * @param batchArgs list集合数组
     */

    public void batchAddBook(List<Object[]> batchArgs) {
       bookDao.batchAddBook(batchArgs);
    }

    /**
     * 批量修改数据
     *
     * @param batchArgs list集合数组
     */

    public void batchUpdateBook(List<Object[]> batchArgs) {
       bookDao.batchUpdateBook(batchArgs);
    }

    /**
     * 批量删除数据
     *
     * @param batchArgs list集合数组
     */

    public void batchDeleteBook(List<Object[]> batchArgs) {
        bookDao.batchDeleteBook(batchArgs);
    }
}
