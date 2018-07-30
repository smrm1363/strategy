package com.mohammadreza_mirali.contractProcessor.com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
import java.util.Set;

/**
 * Created by mmirali on 29/07/2018.
 */

/**
 * the goal of this class is utilize proprty file logics
 */
public class PropertyUtil {

    /**
     *
     * @param propertyName is name of the property
     * @return value of the property
     * @throws IOException may be happened
     */
    public static String getProperty(String propertyName) throws IOException {

        String resourceName = "contract_process.properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        InputStream resourceStream = loader.getResourceAsStream(resourceName);
            props.load(resourceStream);


        return props.getProperty(propertyName);
    }

    /**
     *
     * @return all properties as an String
     * @throws IOException may be happened
     */
    public static String getProperty() throws IOException {
        String resourceName = "contract_process.properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        InputStream resourceStream = loader.getResourceAsStream(resourceName);
            props.load(resourceStream);

        return getPropertyAsString(props);
    }

    /**
     *
     * @param prop is the property
     * @return concated String of properties
     */
    public static String getPropertyAsString(Properties prop) {

        StringBuilder propString = new StringBuilder();
        Set propertySet = prop.stringPropertyNames();
        propertySet.stream().forEach(o ->
        {
            propString.append(o);
            propString.append(",  ");
        });

        return propString.toString();
    }
}
