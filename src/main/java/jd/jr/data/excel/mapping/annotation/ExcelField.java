package jd.jr.data.excel.mapping.annotation;



import jd.jr.data.excel.mapping.enums.CellAlignEnum;

import java.lang.annotation.*;

/**
 * *****************************************
 *
 * @author 邓超【dengchao5@jd.com】
 * @date 2017/3/2 18:15
 * *****************************************
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelField {
    /**
     * 标题
     * @return
     */
    String title();

    /**
     * 宽度
     * @return
     */
    int width() default 20;

    /**
     * 是否锁定列
     *
     */
    boolean isLocked() default false;

    /**
     * 对齐方式
     *
     */
    CellAlignEnum align() default CellAlignEnum.CENTER;

    /**
     * 顺序号
     * @return
     */
    int order() default 0;
}
