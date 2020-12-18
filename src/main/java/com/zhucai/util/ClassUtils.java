package com.zhucai.util;

import com.google.common.collect.Lists;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Desc: 类加载工具类 (由一个接口查找到所有的实现类，也可以由父类查找到所有的子类)
 * @Auth: GaoLin
 * @Date: 2020/12/9 10:35
 */
public class ClassUtils {

    //给一个接口，返回这个接口的所有实现类
    public static List<Class> getAllClassByInterface(Class c) {

        List<Class> returnClassList = Lists.newArrayList();

        if(c.isInterface()) {
            String packageName = c.getPackage().getName();

            try {
                //获得当前包下以及子包下的所有类
                List<Class> allClasses = getClasses(packageName);

                //判断是不是同一个接口
                returnClassList = allClasses.stream().filter(cc -> c.isAssignableFrom(cc) && !c.equals(cc)).collect(Collectors.toList());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return returnClassList;
    }

    /**
     * @Date 2020/12/11 15:36  @Author GaoLin  @Description :获得当前包下以及子包下的所有类
    **/
    private static List<Class> getClasses(String packageName) throws ClassNotFoundException, IOException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".","/");
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = Lists.newArrayList();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = Lists.newArrayList();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = Lists.newArrayList();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
}
