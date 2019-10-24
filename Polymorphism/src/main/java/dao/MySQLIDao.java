package dao;

import storage.IStorageObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MySQLIDao implements IDao {

    List<IStorageObject> objects;

    public MySQLIDao() {
        objects = new ArrayList<>();
    }

    @Override
    public IStorageObject getObjectById(int id) {
        Iterator<IStorageObject> it = objects.iterator();
        while (it.hasNext()) {
            IStorageObject object = it.next();
            if (object.getId() == id) {
                return object;
            }
        }
        return null;
    }

    @Override
    public void save(IStorageObject object) {
        objects.add(object.Store());
    }

    @Override
    public void update(IStorageObject ob) {
        IStorageObject objToUpdate = getObjectById(ob.getId());
        objToUpdate.Update(ob);
    }

    @Override
    public void delete(IStorageObject object) {
        Iterator<IStorageObject> it = objects.iterator();
        while (it.hasNext()) {
            IStorageObject obj = it.next();
            if (obj.getId() == object.getId()) {
                object.Delete(object);
                it.remove();
            }
        }
    }
}
