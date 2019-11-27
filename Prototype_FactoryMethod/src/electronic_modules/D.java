package electronic_modules;

import base_electronic_module.BaseElectronicModule;

public class D implements BaseElectronicModule {

    public String name;

    public D() {
        this.name = "D";
    }

    @Override
    public Object clone() {
        D newObject = new D();
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
