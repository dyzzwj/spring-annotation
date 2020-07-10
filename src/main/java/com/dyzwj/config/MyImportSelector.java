package com.dyzwj.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MyImportSelector.java
 * @Description TODO
 * @createTime 2020年07月05日 18:46:00
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.dyzwj.bean.Purple","com.dyzwj.bean.White"};
    }
}
