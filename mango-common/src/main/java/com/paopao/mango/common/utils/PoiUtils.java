package com.paopao.mango.common.utils;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

/**
 * POI相关操作
 * Create by paopao on 2019-11-17 17:36
 */
public class PoiUtils {

    /**
     * 生成 Excel文件
     *
     * @param workbook
     * @param fileName
     * @return
     */
    public static File createExcelFile(Workbook workbook, String fileName) {
        OutputStream stream = null;
        File file = null;
        try {
            file = File.createTempFile(fileName, ".xlsx");
            stream = new FileOutputStream(file.getAbsoluteFile());
            workbook.write(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(workbook);
            IOUtils.closeQuietly(stream);
        }
        return file;
    }
}
