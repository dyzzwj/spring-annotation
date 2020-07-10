package com.dyzwj.config;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MyTypeFilter.java
 * @Description TODO
 * @createTime 2020年07月05日 16:19:00
 */
public class MyTypeFilter implements TypeFilter {

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        return false;
    }
}
