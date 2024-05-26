package org.springcore.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,Integer> feeStr;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Integer> getFeeStr() {
        return feeStr;
    }

    public void setFeeStr(Map<String, Integer> feeStr) {
        this.feeStr = feeStr;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends + "\n" +
                ", feeStr=" + feeStr + "\n" +
                ", properties=" + properties +
                '}';
    }
}
