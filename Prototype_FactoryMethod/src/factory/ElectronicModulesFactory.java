package factory;

import base_electronic_module.BaseElectronicModule;
import electronic_modules_manager.ElectronicModulesManager;

public class ElectronicModulesFactory {

    private static ElectronicModulesManager manager = new ElectronicModulesManager();

    public static BaseElectronicModule ElectronicModuleFactory(String moduleName) {

        switch (moduleName) {
            case "A":
                return manager.getCopy("A");
            case "B":
                return manager.getCopy("B");
            case "C":
                return manager.getCopy("C");
            case "D":
                return manager.getCopy("D");
        }
        return null;
    }
}
