package com.design_pattern.demo.adapterPattern.compositePattern.isPattern;

/**
 * @Author sandu
 * @Date 2022-03-29 21:56
 */
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}
