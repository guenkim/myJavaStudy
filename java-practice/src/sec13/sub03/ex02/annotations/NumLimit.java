package sec13.sub03.ex02.annotations;

import sec13.sub03.ex02.enums.LimitType;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Repeatable(NumLimits.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NumLimit {
    LimitType type();
    int to();
}
