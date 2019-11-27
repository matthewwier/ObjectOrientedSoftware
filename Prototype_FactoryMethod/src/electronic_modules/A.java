package electronic_modules;

import base_electronic_module.BaseElectronicModule;

public class A implements BaseElectronicModule {

    public String name;

    public A() {
        this.name = "A";
    }

    @Override
    public Object clone() {
        A newObject = new A();
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
