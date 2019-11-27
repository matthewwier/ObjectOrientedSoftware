package main;

import electronic_modules.A;
import electronic_modules.B;
import electronic_modules.C;
import electronic_modules.D;
import electronic_modules_manager.ElectronicModulesManager;
import factory.ElectronicModulesFactory;

public class Main {
    public static void main(String[] args) {
        ElectronicModulesManager manager = new ElectronicModulesManager();
        manager.addElectronicModule("A", new A());
        manager.addElectronicModule("B", new B());
        manager.addElectronicModule("C", new C());
        manager.addElectronicModule("D", new D());
        System.out.println(ElectronicModulesFactory.ElectronicModuleFactory("A"));

    }
}
