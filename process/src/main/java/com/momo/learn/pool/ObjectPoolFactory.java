package com.momo.learn.pool;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;

/**
 * @author majunjie
 * @date 2018/3/20 15:09
 */
public class ObjectPoolFactory implements PooledObjectFactory<Connection> {

    @Override
    public PooledObject makeObject() throws Exception {
        return new CustomPoolObject();
    }

    @Override
    public void destroyObject(PooledObject pooledObject) throws Exception {

    }

    @Override
    public boolean validateObject(PooledObject pooledObject) {
        return true;
    }

    @Override
    public void activateObject(PooledObject pooledObject) throws Exception {

    }

    @Override
    public void passivateObject(PooledObject pooledObject) throws Exception {

    }
}