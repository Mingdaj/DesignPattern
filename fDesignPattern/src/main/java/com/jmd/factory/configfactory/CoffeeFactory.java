package com.jmd.factory.configfactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/20 16:35
 * File: CoffeeFactory
 * Description:
 */
public class CoffeeFactory {

    // 加载配置文件，获取配置文件中配置的全类名，并创建对象进行存储
    // 1 定义容器存储咖啡对象
    private static HashMap<String, Coffee> coffeeMap = new HashMap<>();

    // 2 加载配置文件，只需加载一次
    static {
        // 2.1 创建Properties对象
        Properties p = new Properties();
        // 2.2 加载配置文件load()
        InputStream rs = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        if (rs == null) {
            throw new RuntimeException("找不到配置文件");
        }
        try {
            p.load(rs);
            // 从p集合中获取全类名并创建对象
            for (Object key : p.keySet()) {
                // 2.3 获取全类名
                String className = p.getProperty((String) key);
                // 通过反射创建对象
                // 2.4 加载类
                Class clazz = Class.forName(className);
                // 2.5 创建对象
                Coffee coffee = (Coffee) clazz.newInstance();
                // 2.6 将对象存入容器
                coffeeMap.put((String) key, coffee);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 根据名称获取对象
    public static Coffee createCoffee(String type) {
        return coffeeMap.get(type);
    }
}
