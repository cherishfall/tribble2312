package com.tribble.tribblefast;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author lifan
 * @since 2022/7/25 9:56 AM
 */
@Slf4j
public class IntegerTest {
  /**
   * 总结： Integer 和 int 比较，是拆箱比较，比较的是数值，要注意Integer的空指针异常 Integer
   * 默认有-128到127的缓存，如果Integer使用的是这个范围的值，equals和 == 的表现相同，实际上都是值比较
   */
  @Test
  void test1() {
    Integer integer1 = new Integer(1);
    System.out.println(integer1 == 1); // true

    Integer integer2 = new Integer(10001);
    System.out.println(integer2 == 10001); // true

    Integer integer3 = new Integer(10001);
    Integer integer4 = 10001;
    System.out.println(integer2 == integer3); // false
    System.out.println(integer2 == integer4); // false
  }

  @Test
  void test2() {
    System.out.println("<-128~127以内的Integer值，Integer x = value;的方式赋值！>");
    Integer i = 127;
    Integer j = 127;
    System.out.println("i=" + i + ",j =" + j);
    System.out.println("i == j：" + (i == j) + "<--比较-->i.equals(j):" + i.equals(j));
    System.out.println("\n<-128~127以外的Integer值，Integer x = value;的方式赋值！>");
    Integer m = 128;
    Integer n = 128;
    System.out.println("m=" + m + ",n =" + n);
    System.out.println("m == n：" + (m == n) + "<--比较-->m.equals(n):" + m.equals(n));

    System.out.println("\n<任意Integer值，Integer x = new Integer(value);的方式赋值！>");
    Integer x = new Integer(299);
    Integer y = new Integer(299);
    System.out.println("x=" + x + ",y =" + y);
    System.out.println("x == y：" + (x == y) + "<--比较-->x.equals(y):" + x.equals(y));
  }
}
