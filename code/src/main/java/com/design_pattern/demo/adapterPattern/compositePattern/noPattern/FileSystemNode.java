package com.design_pattern.demo.adapterPattern.compositePattern.noPattern;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-29 21:19
 */

public class FileSystemNode {
    private String path;
    private boolean isFile;
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public int countNumOfFiles() {
        if (isFile){
            return 1;
        }
        int numOfFiles = 0;
        for (FileSystemNode subNode : subNodes) {
            numOfFiles += subNode.countNumOfFiles();
        }
        return numOfFiles;
    }

    public long countSizeOfFiles() {
        if (isFile){
            File file = new File(path);
            if (!file.exists()){
                return 0;
            }
            return file.length();
        }
        long sizeofFiles = 0;
        for (FileSystemNode subNode : subNodes) {
            sizeofFiles += subNode.countSizeOfFiles();
        }
        return sizeofFiles;
    }

    public String getPath() {
        return path;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}