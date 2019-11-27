package electronic_modules;

import base_electronic_module.BaseElectronicModule;

public class B implements BaseElectronicModule {

    public String name;

    public B() {
        this.name = "B";
    }

    @Override
    public Object clone() {
        B newObject = new B();
        newObject.name = this.name;
        return newObject;
    }

    @Override
    public void action() {
        System.out.print(name);
    }

    public String toString(){
        return name;
    }

}
