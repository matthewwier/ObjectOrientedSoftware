package storage;

public interface IStorageObject<StorageObject> {
    void PrintMe();
    IStorageObject Store();
    void Update(StorageObject object);
    void Delete(StorageObject object);
    int getId();
}
