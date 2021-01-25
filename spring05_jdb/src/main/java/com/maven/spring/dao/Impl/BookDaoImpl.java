package com.maven.spring.dao.Impl;


import com.maven.spring.bean.Book;
import com.maven.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository //创建BookDaoImpl对象
public class BookDaoImpl implements BookDao {

//注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加图书
     *
     * @param book 一个图书对象
     */
    @Override
    public void add(Book book) {
        //参数1 sql语句 ,参数2 设置sql语句中的值
        String sql = "insert into book values(?,?,?)";
        Object args [] ={book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    /**
     * 修改图书
     *
     * @param book 一个图书对象
     *
     */
    @Override
    public void updateBook(Book book) {
        String sql = "update book set ustatus=?,username=? where user_id=?";
        Object args [] ={book.getUsername(),book.getUstatus(),book.getUserId()};
        int updateCount = jdbcTemplate.update(sql, args);
        System.out.println(updateCount);
    }

    /**
     * 删除图书
     *
     * @param id
     */
    @Override
    public void deleteBook(String id) {
        String sql = "delete from book  where user_id=?";
        int updateCount = jdbcTemplate.update(sql, id);
        System.out.println(updateCount);
    }

    /**
     * 查询所有的图书
     *
     * @return 返回一个List集合
     */
    @Override
    public List<Book> selectAllBook() {
        String sql = "select * from book  ";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    /**
     * 查询book 中有多少条记录
     *
     * @return 返回表中的总记录数
     */
    @Override
    public int selectTablesCount() {
        String sql = "select count(*) from book";
        int selectCount = jdbcTemplate.queryForObject(sql,Integer.class);
        return selectCount;
    }

    /**
     * 查询book 按照条件查询
     *
     * @return 返回表中满足条件的记录
     */
    @Override
    public  List<Book> conditionsSelect(String ustatus) {
        String sql = "select * from book where ustatus=?  ";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class),ustatus);
        return bookList;
    }

    /**
     * 查询返回一条记录 也就是一个对象
     *
     * @return 返回一个 book对象
     */
    @Override
    public Book selectBookObject(String id) {
        String sql = "select * from book where user_id=?  ";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    /**
     * 按条件模糊查询
     *
     * @param username
     * @return 返回一个List集合
     */
    @Override
    public List<Book> selectBookLike(String username) {
        String sql = "select * from book  where username like ?  ";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class),username);
        return bookList;

    }

    /**
     * 分页查询
     *
     * @param begin 开始位置索引
     * @param stop  结束位置索引
     * @return 返回一个List集合
     */
    @Override
    public List<Book> selectBookPage(int begin, int stop) {
        String sql = "select * from book  limit ?,?  ";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class),begin,stop);
        return bookList;

    }

    /**
     * 批量添加数据
     *
     * @param batchArgs list集合数组
     */
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 批量修改数据
     *
     * @param batchArgs list集合数组
     */
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 批量删除数据
     *
     * @param batchArgs list集合数组
     */
    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
