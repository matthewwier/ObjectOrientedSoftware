package dao;

import storage.IStorageObject;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SQLServerIDao implements IDao {

    Queue<IStorageObject> objects;

    public SQLServerIDao() {
        objects = new PriorityQueue<>();
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
