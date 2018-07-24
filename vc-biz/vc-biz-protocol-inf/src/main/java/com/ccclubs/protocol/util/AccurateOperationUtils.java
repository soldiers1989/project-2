package com.ccclubs.protocol.util;

import java.math.BigDecimal;

/**
 * java的float只能用来进行科学计算或工程计算，在大多数的商业计算中，一般采用java.math.BigDecimal类来进行精确计算。
 *
 * @author qsxiaogang
 */
public class AccurateOperationUtils {

  /**
   * 提供精确加法计算的add方法
   *
   * @param value1 被加数
   * @param value2 加数
   * @return 两个参数的和
   */
  public static BigDecimal add(double value1, double value2) {
    BigDecimal b1 = new BigDecimal(String.valueOf(value1));
    BigDecimal b2 = new BigDecimal(String.valueOf(value2));
    return b1.add(b2);
  }

  /**
   * 提供精确减法运算的sub方法
   *
   * @param value1 被减数
   * @param value2 减数
   * @return 两个参数的差
   */
  public static BigDecimal sub(double value1, double value2) {
    BigDecimal b1 = new BigDecimal(String.valueOf(value1));
    BigDecimal b2 = new BigDecimal(String.valueOf(value2));
    return b1.subtract(b2);
  }

  /**
   * 提供精确乘法运算的mul方法
   *
   * @param value1 被乘数
   * @param value2 乘数
   * @return 两个参数的积
   */
  public static BigDecimal mul(double value1, double value2) {
    BigDecimal b1 = new BigDecimal(String.valueOf(value1));
    BigDecimal b2 = new BigDecimal(String.valueOf(value2));
    return b1.multiply(b2);
  }

  /**
   * 提供精确的除法运算方法div
   *
   * @param value1 被除数
   * @param value2 除数
   * @param scale 精确范围
   * @return 两个参数的商
   */
  public static BigDecimal div(double value1, double value2, int scale)
      throws IllegalAccessException {
    //如果精确范围小于0，抛出异常信息
    if (scale < 0) {
      throw new IllegalAccessException("精确度不能小于0");
    }
    BigDecimal b1 = new BigDecimal(String.valueOf(value1));
    BigDecimal b2 = new BigDecimal(String.valueOf(value2));
    return b1.divide(b2, scale);
  }
}
