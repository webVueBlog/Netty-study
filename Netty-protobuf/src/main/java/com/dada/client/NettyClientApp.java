package com.dada.client;

/**
* @Title: NettyClientApp
* @Description: Netty 客户端主程序
* @Version:1.0.0  
*/
public class NettyClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NettyClient nettyClient = new NettyClient();
		nettyClient.run();
	}

}
