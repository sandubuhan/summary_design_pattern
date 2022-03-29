package com.design_pattern.demo.compositePattern.isPattern;

/**
 * @Author sandu
 * @Date 2022-03-29 21:57
 */
public class File extends FileSystemNode{
    public File(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        java.io.File file = new java.io.File(path);
        if (!file.exists()){
            return 0;
        }
        return file.length();
    }
}
