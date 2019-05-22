package cn.edu.ysu.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * <p><b>Description：</b></p>
 * <p>rpc importer</p>
 * <p><b>createTime: </b></p>
 * <p>2018/6/12 14:51</p>
 *
 * @author huangjinzhao
 * @since V1.0
 */

public class RpcImporter<S> {
    public S importer(final Class<?> serviceClass, final InetSocketAddress addr) {
        return (S) Proxy.newProxyInstance(serviceClass.getClassLoader(), new Class<?>[]{serviceClass.getInterfaces()[0]}, (proxy, method, args) -> {
            Socket socket = new Socket();
            socket.connect(addr);
            try (ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
                 ObjectInputStream inputS = new ObjectInputStream(socket.getInputStream())) {
                output.writeUTF(serviceClass.getName());
                output.writeUTF(method.getName());
                output.writeObject(method.getParameterTypes());
                output.writeObject(args);
                return inputS.readObject();
            }finally {
                if(socket!=null){
                    socket.close();
                }
            }
        });
    }
}
