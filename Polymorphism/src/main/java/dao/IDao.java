package dao;

import storage.IStorageObject;


public interface IDao {
    IStorageObject getObjectById(int id);
    void save(IStorageObject object);
    void update(IStorageObject object);
    void delete(IStorageObject object);
}
