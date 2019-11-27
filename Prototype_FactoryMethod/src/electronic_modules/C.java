package electronic_modules;

import base_electronic_module.BaseElectronicModule;

public class C implements BaseElectronicModule {

    public String name;

    public C() {
        this.name = "C";
    }

    @Override
    public Object clone() {
        C newObject = new C();
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
