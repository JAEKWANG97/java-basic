package extend1.acess.child;

import extend1.acess.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1;

        publicMethod();
        protectedMethod();

        printParent();

    }
}
