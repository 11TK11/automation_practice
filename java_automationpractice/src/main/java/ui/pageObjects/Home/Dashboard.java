package ui.pageObjects.Home;

import ui.pageObjects.AbstractPage;

import java.util.HashMap;
import java.util.Map;

public class Dashboard extends AbstractPage {
    Map<String, Object> cache=new HashMap<>();
    public void createShirt(String name, String size, String brand){
        LeftPanel leftPanel=clickAddShirt();
        Map<String, String> formData = new HashMap<>();
        formData.put("name", name);
        formData.put("size", size);
        formData.put("brand", brand);
        formData.keySet().forEach(field->leftPanel.getForm(formData).get(field).Fill());
    }

    public void createShirt(String name){
        LeftPanel leftPanel=clickAddShirt();
        Map<String, String> formData = new HashMap<>();
        formData.put("name", name);
        formData.keySet().forEach(field->leftPanel.getForm(formData).get(field).Fill());
        cache.put("shirtCreated",formData);
        cache.put("a",123);
    }
    public LeftPanel clickAddShirt(){
        return new LeftPanel();
    }
}
