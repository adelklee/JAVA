package week_9_hw_1;

import java.util.Arrays;

public class Array_0 implements Run {
    private Member[] members;

    @Override
    public void run() {
        this.members = new Member[0];
        menu();
    }

    @Override
    public void insertMember(String name, int point) {
        Member[] temp = new Member[this.members.length + 1];

        for (int i = 0; i < this.members.length; i++) {
            if (this.members[i].getName().equals(name)) {
                this.members[i].addPoint(point);
                return;
            }

            temp[i] = this.members[i];
        }

        this.members = temp;
        this.members[this.members.length - 1] = new Member(name, point);
    }

    @Override
    public void searchMember(String name) {
        for (int i = 0; i < this.members.length; i++) {
            if (this.members[i].getName().equals(name)) {
                System.out.println(name + "'s point: " + this.members[i].getPoint());
                return;
            }
        }

        System.out.println("Not found " + name);
    }

    @Override
    public void showMember() {
        Arrays.sort(this.members);
        
        for (int i = 0; i < this.members.length; i++) {
            System.out.println((i + 1) + ": " + this.members[i].getName() + ", point: " + this.members[i].getPoint());
        }
    }
}
