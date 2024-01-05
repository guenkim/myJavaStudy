package sec13.sub03.ex02.annotations;

import sec13.sub03.ex02.enums.WeekDay;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WeekDaysAvail {
    WeekDay[] value();
}