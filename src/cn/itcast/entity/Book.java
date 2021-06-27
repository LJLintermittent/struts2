package cn.itcast.entity;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/30 14:35<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Book {
   private  String bookname;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                '}';
    }
}
