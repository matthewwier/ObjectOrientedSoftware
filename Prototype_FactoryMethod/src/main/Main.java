package main;

import factory.ElectronicModulesFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(ElectronicModulesFactory.ElectronicModuleFactory("A"));
        System.out.println(ElectronicModulesFactory.ElectronicModuleFactory("B"));
        System.out.println(ElectronicModulesFactory.ElectronicModuleFactory("C"));
        System.out.println(ElectronicModulesFactory.ElectronicModuleFactory("D"));
    }
}
