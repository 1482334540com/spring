package com.maven.spring.dao;


import com.maven.spring.bean.Book;

import java.util.List;

public interface BookDao {

    /**
     * 添加图书
     * @param book 一个图书对象
     */
    void add(Book book);

    /**
     * 修改图书
     * @param book 一个图书对象
     */
    void updateBook(Book book);

    /**
     * 删除图书
     * @param id
     */
    void  deleteBook(String id);

    /**
     * 查询所有的图书
     * @return 返回一个List集合
     */
     List<Book> selectAllBook();


    /**
     * 查询book 中有多少条记录
     * @return 返回表中的总记录数
     */
    int selectTablesCount();

    /**
     * 查询book 按照条件查询
     * @return 返回表中满足条件的记录
     */
    List<Book> conditionsSelect(String ustatus);

    /**
     * 按条件查询某一条记录
     * @return 返回一个 book对象
     */
     Book selectBookObject(String id);

    /**
     * 按条件模糊查询
     * @return 返回一个List集合
     */
    List<Book> selectBookLike(String username);

    /**
     * 按条件模糊查询
     * @return 返回一个List集合
     */
    List<Book> selectBookPage(int begin, int stop );

    /**
     * 批量添加数据
     * @param batchArgs list集合数组
     */
     void batchAddBook(List<Object[]> batchArgs);

    /**
     *  批量修改数据
     * @param batchArgs list集合数组
     */
    void batchUpdateBook(List<Object[]> batchArgs);

    /**
     * 批量删除数据
     * @param batchArgs list集合数组
     */
    void batchDeleteBook(List<Object[]> batchArgs);
}
