package com.akai.decorator.instance;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*具体组件，重写读写方法*/
public class BaseFileDataLoader implements DataLoader{

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        String file = null;
        try {
            file = FileUtils.readFileToString(new File(filePath), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    @Override
    public void write(String data) {
        try {
            FileUtils.writeStringToFile(new File(filePath), data, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
