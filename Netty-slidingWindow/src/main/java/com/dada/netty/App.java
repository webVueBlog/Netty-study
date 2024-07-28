package com.dada.netty;

import com.dada.netty.server.NettyServer;
import com.dada.netty.client.NettyClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//启动服务端和客户端
    	new Thread(() -> new NettyServer().run()).start();
    	new Thread(() -> new NettyClient().run()).start();
    	

    }
}
