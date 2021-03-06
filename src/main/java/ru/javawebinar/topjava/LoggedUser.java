package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.BaseEntity;
import ru.javawebinar.topjava.util.UserMealsUtil;


public class LoggedUser {

    private LoggedUser() {
    }

    private static int id = BaseEntity.START_SEQ;

    public static int id(){
        return id;
    }

    public static void setId(int id){
        LoggedUser.id = id;
    }

    public static int getCaloriesPerDay(){
        return UserMealsUtil.DEFAULT_CALORIES_PER_DAY;
    }
}
