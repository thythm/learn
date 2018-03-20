package com.momo.learn.pool;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectState;

import java.io.PrintWriter;
import java.util.Deque;

/**
 * @author majunjie
 * @date 2018/3/20 15:24
 */
public class CustomPoolObject implements PooledObject<Connection> {

    @Override
    public Connection getObject() {
        Connection connection = new Connection();
        System.out.println("创建对象：" + connection);
        return connection;
    }

    @Override
    public long getCreateTime() {
        return 0;
    }

    @Override
    public long getActiveTimeMillis() {
        return 0;
    }

    @Override
    public long getIdleTimeMillis() {
        return 0;
    }

    @Override
    public long getLastBorrowTime() {
        return 0;
    }

    @Override
    public long getLastReturnTime() {
        return 0;
    }

    @Override
    public long getLastUsedTime() {
        return 0;
    }

    @Override
    public int compareTo(PooledObject<Connection> pooledObject) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean startEvictionTest() {
        return false;
    }

    @Override
    public boolean endEvictionTest(Deque<PooledObject<Connection>> deque) {
        return false;
    }

    @Override
    public boolean allocate() {
        return false;
    }

    @Override
    public boolean deallocate() {
        return false;
    }

    @Override
    public void invalidate() {

    }

    @Override
    public void setLogAbandoned(boolean b) {

    }

    @Override
    public void use() {

    }

    @Override
    public void printStackTrace(PrintWriter printWriter) {

    }

    @Override
    public PooledObjectState getState() {
        return null;
    }

    @Override
    public void markAbandoned() {

    }

    @Override
    public void markReturning() {

    }
}
