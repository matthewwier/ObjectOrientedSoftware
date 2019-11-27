package electronic_modules_manager;

import base_electronic_module.BaseElectronicModule;
import electronic_modules.A;
import electronic_modules.B;
import electronic_modules.C;
import electronic_modules.D;

import java.util.HashMap;
import java.util.Map;

public class ElectronicModulesManager {

    Map<String, BaseElectronicModule> electronicModules = new HashMap<String, BaseElectronicModule>();

    public ElectronicModulesManager() {
        addElectronicModule("A", new A());
        addElectronicModule("B", new B());
        addElectronicModule("C", new C());
        addElectronicModule("D", new D());
    }

    public void addElectronicModule(String name, BaseElectronicModule electronicModule) {
        electronicModules.put(name, electronicModule);
    }

    public void deleteElectronicModule(String name) {
        electronicModules.remove(name);
    }

    public void dropAllElectronicModules() {
        electronicModules.clear();
    }

    public BaseElectronicModule getCopy(String name) {
        if (electronicModules.containsKey(name)) {
            return (BaseElectronicModule) electronicModules.get(name).clone();
        }
        return null;
    }
}
