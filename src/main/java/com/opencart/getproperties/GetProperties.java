package com.opencart.getproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class GetProperties {

    public String[] getProperties(){

        Properties properties = new Properties();
        String[] prop = new String[2];

        try{
            FileInputStream file = new FileInputStream("D:\\maven_projectTest2\\src\\main\\java\\" +
                    "com\\opencart\\getproperties\\app.properties");
            properties.load(file);

            String email = properties.getProperty("email");
            String password = properties.getProperty("password");

            prop[0] = email;
            prop[1] = password;

        }catch(IOException ex){
            System.err.println("Error");
        }
        return prop;
    }
}
