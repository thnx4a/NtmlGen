package com.suhorukov.titov.HtmlGenerator;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by demo3 on 08.11.14.
 */
public class HtmlGenerator {
    public String indexHtml(String dirName) {
        File dir = new File(dirName);
        dir.isDirectory();
        dir.listFiles();
        new Comparator<File>() {

            @Override
            public int compare(File o1, File o2) {
                if (o1.isDirectory() && o2.isDirectory() || o1.isDirectory())&&o2.isDirectory()){
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.isDirectory() ? -1 : 1;
            }
        }
                
        Collections.sort();
        StringBuilder sb;
        String.format("<tr><td>%s</td></tr>", 11);
        return null;
    }
}
