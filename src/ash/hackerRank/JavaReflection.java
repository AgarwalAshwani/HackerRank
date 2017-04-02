package ash.hackerRank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

//Java Reflection allows us to get some attributes of class at runtime

public class JavaReflection {

    public static void main(String[] args){
        Class student = new Student().getClass();
        Method[] methods = student.getDeclaredMethods();;

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m:methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
