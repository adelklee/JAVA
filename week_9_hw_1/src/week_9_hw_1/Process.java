package week_9_hw_1;

public class Process {
    public void Run(int version){
        switch (version){
        case 1 : new Array_0().run(); break;
        case 2 : new Vector_0().run(); break;
        case 3 : new ArrayList_0().run(); break;
        case 4 : new HashMap_0().run(); break;
        case 5 : new LinkedList_0().run(); break;
        default : break;
        }
    }
}
