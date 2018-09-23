package com.together.learning.spring.ioc.step10;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionStorage {
    private Properties properties;

    private List<Float> lists;

    private Map<String, String> map;

    private Set<Integer> set;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Float> getLists() {
        return lists;
    }

    public void setLists(List<Float> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }
}
