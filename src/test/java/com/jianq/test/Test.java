package com.jianq.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by hp on 2017/7/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml","classpath:spring/mvc-dispatcher-servlet.xml"})
public class Test {

    @org.junit.Test
    public void testProperties(){

        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream(new File("db.properties")));

            String jdbc=properties.getProperty("jdbc.url");
            System.out.print(jdbc);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream(new File("D:\\IdeaWorkspace\\demo\\spring-hibernate-demo\\src\\main\\resources\\db.properties")));

            String jdbc=properties.getProperty("jdbc.url");
            System.out.print(jdbc);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
