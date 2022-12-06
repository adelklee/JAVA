package week_9_hw_1;

import java.util.Comparator;
import java.util.Vector;

public class Vector_0 implements Run {
    Vector<Member> members;

    @Override
    public void run() {
        this.members = new Vector<>(0);
        menu();
    }
    
    @Override
    public void insertMember(String name, int point) {
        for (int i = 0; i < this.members.size(); i++) {
            if (this.members.get(i).getName().equals(name)) {
                this.members.get(i).addPoint(point);
                return;
            }
        }

        this.members.add(new Member(name, point));
    }

    @Override
    public void searchMember(String name)  {   
        for (int i = 0; i < this.members.size(); i++) {
            if (this.members.get(i).getName().equals(name)) {
                System.out.println(name + "'s point: " + this.members.get(i).getPoint());
                return;
            }
        }

        System.out.println("Not found " + name);
    }

    @Override
    public void showMember() {
        this.members.sort(Comparator.naturalOrder());

        for (int i = 0; i < this.members.size(); i++)
        {
            System.out.println((i + 1) + ": " + this.members.get(i).getName() + ", point: " + this.members.get(i).getPoint());
        }
    }

}