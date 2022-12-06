package week_9_hw_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMap_0 implements Run {
    private HashMap<String, Integer> members;

    @Override
    public void run() {
        this.members = new HashMap<>(0);
        menu();
    }

    @Override
    public void insertMember(String name, int point) {
        Integer before = this.members.get(name);
        if (before != null) {
            this.members.remove(name);
            this.members.put(name, before + point);
        }
        else {
            this.members.put(name, point);
        }
    }

    @Override
    public void searchMember(String name)  {
        if (this.members.get(name) != null) {
            System.out.println(name + "'s point: " + this.members.get(name));
            return;
        }

        System.out.println("Not found " + name);
    }

    @Override
    public void showMember() {
        int index = 1;

        List<String> employeeByKey = new ArrayList<>(this.members.keySet());
        Collections.sort(employeeByKey);

        for (String key : employeeByKey)  {
            System.out.println((index++) + ": " + key + ", point: " + this.members.get(key));
        }
    }
}
