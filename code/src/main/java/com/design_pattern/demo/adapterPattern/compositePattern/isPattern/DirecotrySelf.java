package com.design_pattern.demo.adapterPattern.compositePattern.isPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-29 22:02
 */
public class DirecotrySelf extends FileSystemNode{

    private List<FileSystemNode> subNodes = new ArrayList<>();

    public DirecotrySelf(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int numOfFiles = 0;
        for (FileSystemNode subNode : subNodes) {
            numOfFiles += subNode.countNumOfFiles();
        }
        return numOfFiles;
    }

    @Override
    public long countSizeOfFiles() {
        long sizeOfFiles = 0;
        for (FileSystemNode subNode : subNodes) {
            sizeOfFiles += subNode.countSizeOfFiles();
        }
        return sizeOfFiles;
    }

    public void addSubNode(FileSystemNode fileSystemNode){
        subNodes.add(fileSystemNode);
    }

    public void remove(FileSystemNode fileSystemNode){
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileSystemNode.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
