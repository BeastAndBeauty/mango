package com.paopao.mango.common.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * IO相关工具类
 * Create by paopao on 2019-11-17 17:48
 */
public class IOUtils {

    /**
     * 关闭对象，连接
     *
     * @param closeable
     */
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
