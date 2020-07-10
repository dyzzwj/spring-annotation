package com.dyzwj.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MacCondition.java
 * @Description TODO
 * @createTime 2020年07月05日 17:05:00
 */
public class MacCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        if(property.contains("Mac")){
            return true;
        }
        return false;
    }
}
